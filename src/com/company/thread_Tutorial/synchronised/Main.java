package com.company.thread_Tutorial.synchronised;

public class Main {
    public static void main(String[] args) {
        DragonBall db = new DragonBall();
        Goku gokuThreads = new Goku(db);
        Vegeta vegetaThreads = new Vegeta(db);
        gokuThreads.start();
        vegetaThreads.start();
    }
}
