package com.endava.training.examples;

public class C extends B {

    @Override
    public void f() {
        System.out.println("Hello from C");
    }

    @Override
    public void f(String name, String location) {
        System.out.println("Hello from C - " + name);
        System.out.println("Hello from C - " + location);
    }
}
