package com.endava.training.examples;

public class B extends A {

    @Override
    public void f() {
        System.out.println("Hello from B");
    }

    @Override
    public void f(String name, String location) {
        System.out.println("Hello from B - " + name);
        System.out.println("Hello from B - " + location);
    }
}
