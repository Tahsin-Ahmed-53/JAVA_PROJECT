package com.company.Anonymous_Class.Anime_Anonymous;

public class Main {
    public static void main(String[] args) {
        Pokemon charizard = new Pokemon() {
            @Override
            public void type() {
                System.out.println("Fire type");
            }

            @Override
            public void totalMove() {
                System.out.println("17 moves");
            }

            @Override
            public void specialMove() {
                System.out.println("Dragon tail");
            }

            @Override
            public void specialAbility() {
                System.out.println("Rage");
            }

            @Override
            public void battleWin() {
                System.out.println("73%");
            }
        };

        Pokemon infernape = new Pokemon() {
            @Override
            public void type() {
                System.out.println("Fire type");
            }

            @Override
            public void totalMove() {
                System.out.println("6 moves");
            }

            @Override
            public void specialMove() {
                System.out.println("Fireblade");
            }

            @Override
            public void specialAbility() {
                System.out.println("Blaze");
            }

            @Override
            public void battleWin() {
                System.out.println("74%");
            }
        };
        Pokemon Greninja = new Pokemon() {
            @Override
            public void type() {
                System.out.println("water");
            }

            @Override
            public void totalMove() {
                System.out.println("7 moves");
            }

            @Override
            public void specialMove() {
                System.out.println("Water Shiriken");
            }

            @Override
            public void specialAbility() {
                System.out.println("Bond evolution");
            }

            @Override
            public void battleWin() {
                System.out.println("79%");
            }
        };

        Pokemon sceptile = new Pokemon() {
            @Override
            public void type() {
                System.out.println("grass");
            }

            @Override
            public void totalMove() {
                System.out.println("8 moves");
            }

            @Override
            public void specialMove() {
                System.out.println("Leave blade");
            }

            @Override
            public void specialAbility() {
                System.out.println("Overgrow");
            }

            @Override
            public void battleWin() {
                System.out.println("55%");
            }
        };

        charizard.type();
        charizard.totalMove();
        charizard.specialMove();
        charizard.specialAbility();
        charizard.battleWin();

        infernape.type();
        infernape.totalMove();
        infernape.specialMove();
        infernape.specialAbility();
        infernape.battleWin();

        Greninja.type();
        Greninja.totalMove();
        Greninja.specialMove();
        Greninja.specialAbility();
        Greninja.battleWin();

        sceptile.type();
        sceptile.totalMove();
        sceptile.specialMove();
        sceptile.specialAbility();
        sceptile.battleWin();

    }
}
