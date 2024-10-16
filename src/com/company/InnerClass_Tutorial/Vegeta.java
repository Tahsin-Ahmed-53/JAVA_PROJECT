package com.company.InnerClass_Tutorial;

public class Vegeta {
    public String powerLevel = "ultra ego";

    class Trunks {
        public void trunks() {
            System.out.println("vegeta's power: " + powerLevel);
        }
    }

    public static void main(String[] args) {
        Vegeta vegeta = new Vegeta();
        Vegeta.Trunks trunks = vegeta.new Trunks();
        trunks.trunks();
    }
}
