package com.endava.training;

import com.endava.training.examples.A;
import com.endava.training.examples.B;
import com.endava.training.examples.C;
import com.endava.training.examples.ExtendedSimple;
import com.endava.training.shape.Shape2D;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello OOP");

        Shape2D circle = new Circle(12, 124, 543);
        System.out.println("Circle area: " + circle.computeArea());
        System.out.println("Circle perimeter: " + circle.computePerimeter());

        Shape2D square = new Square(10, 432, 654);
        System.out.println("Square area: " + square.computeArea());
        System.out.println("Square perimeter: " + square.computePerimeter());

        Shape2D triangle = new Triangle(8, 5, 10, 256, 340);
        System.out.println("Triangle area: " + triangle.computeArea());
        System.out.println("Triangle perimeter: " + triangle.computePerimeter());

        ExtendedSimple extendedSimple1 = new ExtendedSimple();
        ExtendedSimple extendedSimple2 = new ExtendedSimple(43);
        ExtendedSimple extendedSimple3 = new ExtendedSimple(26, 47);

        A a = new B();
        a.f();

        B b = new C();
        b.f();

        a = new C();
        a.f();
    }
}
