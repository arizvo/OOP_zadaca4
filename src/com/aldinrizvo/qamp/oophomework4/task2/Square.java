package com.aldinrizvo.qamp.oophomework4.task2;

public class Square extends Shape {
    private final double side;

    public Square(final String colour, final double side) {
        super(colour);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }
}
