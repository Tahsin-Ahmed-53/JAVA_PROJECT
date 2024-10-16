package com.company.thread_Tutorial.synchronised;

public class DragonBall {
   synchronized void collectingBall(String name) {
       for (int i = 1; i <= 7 ; i++) {
           System.out.println("Dragon ball total in number: " + i);
       }try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
       System.out.println(name + "Dragon ball collecting...");
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
       System.out.println(name + "Dragon ball collection finished");
   }
}
