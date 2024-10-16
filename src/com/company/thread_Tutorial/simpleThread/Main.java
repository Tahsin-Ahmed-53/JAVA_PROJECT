package com.company.thread_Tutorial.simpleThread;

public class Main {
    public static void main(String[] args) {

        Goku gokuThreads = new Goku();
        Vegeta vegetaThreads = new Vegeta();

        gokuThreads.start();
        vegetaThreads.start();
    }
}
