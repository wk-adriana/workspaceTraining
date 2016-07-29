package com.endava.training.examples;

public class ExtendedSimple extends Simple {

    public ExtendedSimple() {
        super(1);
        System.out.println("Hello from constructor with no args");
    }

    public ExtendedSimple(int i) {
        super(i);
        System.out.println("Hello from constructor with 1 args");
    }

    public ExtendedSimple(int i, int j) {
        super(i);
        System.out.println("Hello from constructor with 2 args");
    }
}
