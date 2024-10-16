package com.company.LamdaExpression.format2;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();

        Printable cat = new Cat();
        printThing(cat);
        printThing(myCat);

    }
    public static void printThing(Printable object) {
        object.print();
    }
}
