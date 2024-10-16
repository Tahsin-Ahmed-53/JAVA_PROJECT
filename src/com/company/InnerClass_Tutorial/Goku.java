package com.company.InnerClass_Tutorial;

public class Goku {
    public static String powerLevel = "ultra instinct";
    public static class Gohan {
        public void gohan() {
            System.out.println("Goku's power: " + powerLevel);
        }
    }

    public static void main(String[] args) {
        Goku.Gohan gohan =  new Goku.Gohan();
        gohan.gohan();
    }
}
