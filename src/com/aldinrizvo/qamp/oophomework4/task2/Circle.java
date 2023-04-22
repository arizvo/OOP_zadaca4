package com.aldinrizvo.qamp.oophomework4.task2;

public class Circle extends Shape {
    private final double radius;

    public Circle(final String colour, final double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}
