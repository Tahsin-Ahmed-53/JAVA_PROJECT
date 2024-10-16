package com.company.JAVA_INHERITANCE_TUTORIAL;

public class Saitama extends  SuperHero {
    public String name = "Saitama";

    public Saitama(String name,String power,int age) {
        super(power, age);
        this.name = name;
    }
    public String toString() {
        return "Name: " + name + " Power: " + power + " Age: " + age;
    }
}
