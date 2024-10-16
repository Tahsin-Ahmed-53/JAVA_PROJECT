package com.company.JAVA_INTERFACE_TUTORIAL;

public class Sceptile implements Pokemon {

    @Override
    public void name() {
        System.out.println("Name: Sceptile");
    }

    @Override
    public void type() {
        System.out.println("grass type");
    }

    @Override
    public void specialMove() {
        System.out.println("Leave blades");
    }

    @Override
    public void specialAbility() {
        System.out.println("Over grow");
    }

    @Override
    public void battles() {
        System.out.println("win percentage is 55%");
    }
}
