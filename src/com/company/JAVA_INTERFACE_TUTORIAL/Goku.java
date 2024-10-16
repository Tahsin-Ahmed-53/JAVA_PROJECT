package com.company.JAVA_INTERFACE_TUTORIAL;

public class Goku implements AnimeCharacter {
    public String name = "Goku";

    public String getName() {
        return name;
    }

    @Override
    public void currentForm() {
        System.out.println("Autonomous ultra instinct");
    }

    @Override
    public void powerLevel() {
        System.out.println("upgrading");
    }

    @Override
    public void attack() {
        System.out.println("Goku attacks with kamehameha");
    }

    @Override
    public void defend() {
        System.out.println("Goku has a great defence against attack");
    }

    @Override
    public void specialMove() {
        System.out.println("kamehameha");
    }
}
