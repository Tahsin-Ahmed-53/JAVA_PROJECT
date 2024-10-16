package com.company.JAVA_INHERITANCE_TUTORIAL;

public class Hulk extends SuperHero{
    public String name = "Hulk";

    public Hulk(String name,String power,int age) {
        super(power, age);
        this.name = name;
    }
    public void attack() {
        System.out.println("Smash");
    }

}
