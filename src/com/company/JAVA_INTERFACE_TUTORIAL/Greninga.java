package com.company.JAVA_INTERFACE_TUTORIAL;

public class Greninga implements Pokemon{
    @Override
    public void name() {
        System.out.println("Name: Greninga");
    }

    @Override
    public void type() {
        System.out.println("Water type.");
    }

    @Override
    public void specialMove() {
        System.out.println("water shiriken");
    }

    @Override
    public void specialAbility() {
        System.out.println("bond evolution");
    }

    @Override
    public void battles() {
        System.out.println("win percentage is 87%");
    }

}
