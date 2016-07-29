package com.endava.training.shape.impl;

import com.endava.training.shape.Coordinates;
import com.endava.training.shape.Shape2D;

public class Triangle implements Shape2D {

    private float sideA;

    private float sideB;

    private float sideC;

    private Coordinates coordinates;

    public Triangle(float sideA, float sideB, float sideC, int x, int y) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.coordinates = new Coordinates(x, y);
    }

    @Override
    public double computeArea() {
        double semiPerimeter = this.computePerimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideB));
    }

    @Override
    public double computePerimeter() {
        return sideA * sideB * sideC;
    }
}
