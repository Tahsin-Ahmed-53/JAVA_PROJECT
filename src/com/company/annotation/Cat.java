package com.company.annotation;

@VeryImportant
public class Cat {
    String name;
    @VeryImportant
    String color;

   public Cat(String name, String color) {
       this.name = name;
       this.color = color;
   }

   @VeryImportant
   @RunImmediately(times = 3)
   public void meow() {
       System.out.println("Meow!");
   }
   public void eat() {
       System.out.println("Munch");
   }


}
