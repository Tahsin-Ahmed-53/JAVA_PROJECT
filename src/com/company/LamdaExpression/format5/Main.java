package com.company.LamdaExpression.format5;

public class Main {
    public static void main(String[] args) {
        Printable lamdaEx = () -> System.out.println("Meow") ;
        printingThing(lamdaEx);
    }
    public static void printingThing(Printable object) {
        object.print();
    }
}
