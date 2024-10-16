package com.company.thread_Tutorial.Deadlock;

public class Main {
    public static void main(String[] args) {
        Resource resourceA = new Resource("resourceA");
        Resource resourceB = new Resource("resourceB");

        Goku gokuExtends = new Goku(resourceA,resourceB);
        Vegeta vegetaExtends = new Vegeta(resourceA,resourceB);

        gokuExtends.start();
        vegetaExtends.start();
    }
}
