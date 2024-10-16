package com.company.Anonymous_Class.Simple_AnonymousClass;

public class Main {
    public static void main(String[] args) {
        SaiyanPower goku = new SaiyanPower() {
            @Override
            public void transform() {

                System.out.println("Goku transforms into Ultra instinct");
            }
        };

        AnimeCharacter goku1 = new AnimeCharacter() {
            @Override
            public void powerLevel() {
                System.out.println("Ultra instinct");
            }

            @Override
            public void currentForm() {

                System.out.println("Ultra instinct");
            }

            @Override
            public void specialMove() {

                System.out.println("Kamehameha");
            }

            @Override
            public void defend() {

                System.out.println("great defense");
            }

            @Override
            public void attack() {

                System.out.println("Kamehameha");
            }
        };

        AnimeCharacter vegeta = new AnimeCharacter() {
            @Override
            public void powerLevel() {

                System.out.println("Ultra ego");
            }

            @Override
            public void currentForm() {

                System.out.println("Ultra ego");
            }

            @Override
            public void specialMove() {
                System.out.println("final smash");
            }

            @Override
            public void defend() {

                System.out.println("great defend");
            }

            @Override
            public void attack() {
                System.out.println("final smash");
            }
        };

        goku.transform();
        goku1.powerLevel();
        goku1.attack();
        goku1.currentForm();
        goku1.specialMove();
        goku1.defend();
        vegeta.powerLevel();
        vegeta.currentForm();
        vegeta.specialMove();
        vegeta.defend();
        vegeta.attack();
    }
}
