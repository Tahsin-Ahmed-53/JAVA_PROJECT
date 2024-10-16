package com.company.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Cat myCat = new Cat("Stella","Black");
        System.out.println(myCat.getClass());
        Class<?> catClass = myCat.getClass();
        System.out.println(catClass.getSimpleName());

        Method method = catClass.getMethod("eat");
        System.out.println(method.getName());
//
        System.out.println(myCat.getClass().isAnnotationPresent(VeryImportant.class));

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("The " + myCat.getClass().getSimpleName() + " class is very important");
        } else {
            System.out.println("The " + myCat.getClass().getSimpleName() + " class is not very important");
        }

        Dog myDog = new Dog("Saint Paul");
        if (myDog.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("The " + myDog.getClass().getSimpleName() + " class is very important");
        } else {
            System.out.println("The " + myDog.getClass().getSimpleName() + " class is not very important");
        }

        if (myDog.getClass().getMethod("Bow").isAnnotationPresent(VeryImportant.class)) {
            System.out.println("The " + myDog.getClass().getMethod("Bow").getName() + "() is very important");
        } else {
            System.out.println("The " + myDog.getClass().getMethod("Bow").getName() + "() is not very important");
        }

        for(Method methods : myCat.getClass().getDeclaredMethods()) {
            if (methods.isAnnotationPresent(RunImmediately.class)) {
                try {
                    methods.invoke(myCat);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

        for (Method methods : myDog.getClass().getDeclaredMethods()) {
            if (methods.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately runImmediately = methods.getAnnotation(RunImmediately.class);
                for (int i = 0; i < runImmediately.times(); i++) {
                    try {
                        methods.invoke(myDog);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }

        for (Field fields : myCat.getClass().getDeclaredFields()) {
            if (fields.isAnnotationPresent(VeryImportant.class)) {
                try {
                    fields.setAccessible(true); // যদি ফিল্ড private হয়
                    System.out.println(fields.get(myCat)); // invoke এর পরিবর্তে get() ব্যবহার করা হয়েছে
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}
