package com.company.Anonymous_Class.With_MultiThreading;

public class Goku extends Thread {
    public void run() {
        for (int i = 0; i<= 5; i++) {
            System.out.println("Goku is training: level " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
