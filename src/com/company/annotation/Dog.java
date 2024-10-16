package com.company.annotation;

public class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    @VeryImportant
    public void Bow () {
        System.out.println("Bow Bow!");
    }

    @RunImmediately(times = 2)
    public void eat() {
        System.out.println("Chomp");
    }
}
