package com.company.LamdaExpression.format3;

import com.company.LamdaExpression.format2.Printable;

public class Main {
    public static void main(String[] args) {
        printThing(
                () -> {
                    System.out.println("Meow");
                }
        );
    }
    public static void printThing(Printable object) {
        object.print();
    }
}
