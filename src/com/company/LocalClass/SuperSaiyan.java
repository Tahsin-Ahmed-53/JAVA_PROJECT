package com.company.LocalClass;

public class SuperSaiyan {
    public void ssj() {
           class Saiyan {
               String power = "ultra instinct";
            public void showForm() {
                System.out.println("New form : " + power);
            }
        }
        Saiyan saiyan = new Saiyan();
        saiyan.showForm();
    }

    public static void main(String[] args) {
        SuperSaiyan superSaiyan = new SuperSaiyan();
        superSaiyan.ssj();
    }
}
