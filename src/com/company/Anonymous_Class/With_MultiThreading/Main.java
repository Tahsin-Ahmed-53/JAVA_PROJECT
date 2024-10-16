package com.company.Anonymous_Class.With_MultiThreading;

public class Main {
    public static void main(String[] args) {
        Goku gokuThread = new Goku();
        Vegeta vegetaThread = new Vegeta();

        gokuThread.start();
        vegetaThread.start();
    }
}
