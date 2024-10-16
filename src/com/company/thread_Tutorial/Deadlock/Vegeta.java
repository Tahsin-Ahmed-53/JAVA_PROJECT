package com.company.thread_Tutorial.Deadlock;

public class Vegeta extends Thread{
    Resource resource1,resource2;
    public Vegeta(Resource resource1,Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }
    public void run() {
        synchronized (resource1) {
            try {
                System.out.println("Vegeta working on " + resource1.name);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (resource2) {
                System.out.println("Vegeta working on " + resource2.name);
            }
        }
    }
}
