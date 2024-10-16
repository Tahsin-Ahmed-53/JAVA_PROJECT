package com.company.JAVA_INTERFACE_TUTORIAL;

public class Charizard implements Pokemon {
    @Override
    public void name() {
        System.out.println("Name: Charizard");
    }

    @Override
    public void type() {
        System.out.println("Fire-type.");
    }

    @Override
    public void specialMove() {
        System.out.println("almost 17 moves.");
    }

    @Override
    public void specialAbility() {
        System.out.println("Mega Evolution");
    }

    @Override
    public void battles() {
        System.out.println("win percentage is 72%.");
    }
}
