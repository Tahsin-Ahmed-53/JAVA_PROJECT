package com.company.JAVA_INTERFACE_TUTORIAL;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Bow Bow");
    }

    @Override
    public void eat() {
        System.out.println("Comp");
    }
}
