package com.company.thread_Tutorial.synchronised;

public class Vegeta extends Thread {
    DragonBall dragonBall;
    public Vegeta(DragonBall dragonBall) {
        this.dragonBall = dragonBall;
    }
    public void run() {
        dragonBall.collectingBall("Vegeta");
    }
}

