package com.aldinrizvo.qamp.oophomework4.task2;

public abstract class Shape {
    private final String colour;

    public Shape(final String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String toString() {
        return "colour: " + colour + ", area: " + getArea() + ", circumference: " + getCircumference();
    }
}
