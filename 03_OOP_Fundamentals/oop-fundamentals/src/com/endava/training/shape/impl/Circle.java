package com.endava.training.shape.impl;

import com.endava.training.shape.Coordinates;
import com.endava.training.shape.Shape2D;

public class Circle implements Shape2D {

    private float radius;

    private Coordinates coordinates;

    public Circle(float radius, int x, int y) {
        this.radius = radius;
        this.coordinates = new Coordinates(x, y);
    }

    @Override
    public double computeArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double computePerimeter() {
        return  2 * Math.PI * radius;
    }
}
