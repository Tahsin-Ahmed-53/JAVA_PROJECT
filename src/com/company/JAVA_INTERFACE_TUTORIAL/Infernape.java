package com.company.JAVA_INTERFACE_TUTORIAL;

public class Infernape implements Pokemon{
    @Override
    public void name() {
        System.out.println("Name: Infernape");
    }

    @Override
    public void type() {
        System.out.println("Fire");
    }

    @Override
    public void specialMove() {
        System.out.println("Fire spin");
    }

    @Override
    public void specialAbility() {
        System.out.println("Blaze");
    }

    @Override
    public void battles() {
        System.out.println("win percentage 73%.");
    }
}
