package com.company.thread_Tutorial.synchronised;

public class Goku extends Thread{
    DragonBall dragonBall;
    public Goku(DragonBall dragonBall) {
        this.dragonBall = dragonBall;
    }
    public void run() {
        dragonBall.collectingBall("Goku");
    }

}
