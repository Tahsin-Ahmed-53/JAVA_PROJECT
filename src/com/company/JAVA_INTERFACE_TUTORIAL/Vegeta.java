package com.company.JAVA_INTERFACE_TUTORIAL;

public class Vegeta implements AnimeCharacter {
    public String name = "Vegeta";

    public String getName() {
        return name;
    }

    @Override
    public void currentForm() {
        System.out.println("ultra ego");
    }

    @Override
    public void powerLevel() {
        System.out.println("Near to goku");
    }

    @Override
    public void attack() {
        System.out.println("Attacks with final flash");
    }
    @Override
    public void specialMove() {
        System.out.println("final flash");
    }

    @Override
    public void defend() {
        System.out.println("final");
    }
}
