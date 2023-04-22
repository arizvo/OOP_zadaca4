package com.aldinrizvo.qamp.oophomework4.task2;

public class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle(final String colour, final double a, final double b) {
        super(colour);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * (a + b);
    }
}
