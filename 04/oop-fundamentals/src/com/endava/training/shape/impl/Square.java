package com.endava.training.shape.impl;


import com.endava.training.shape.Coordinates;
import com.endava.training.shape.Shape2D;

public class Square implements Shape2D {

    private float side;

    private Coordinates coordinates;

    public Square(float side, int x, int y) {
        this.side = side;
        this.coordinates = new Coordinates(x, y);
    }

    @Override
    public double computeArea() {
        return side * side;
    }

    @Override
    public double computePerimeter() {
        return 4 * side;
    }
}
