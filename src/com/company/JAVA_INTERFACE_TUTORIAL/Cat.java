package com.company.JAVA_INTERFACE_TUTORIAL;

public class Cat implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Mew");
    }

    @Override
    public void eat() {
        System.out.println("Munch");
    }
}
