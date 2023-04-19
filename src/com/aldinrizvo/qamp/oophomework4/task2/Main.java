package com.aldinrizvo.qamp.oophomework4.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Shape circle = new Circle("red", 1);
        final Shape square = new Square("blue", 1);
        final Shape rectangle = new Rectangle("green", 1, 2);
        final List<Shape> listOfShapes = List.of(circle, square, rectangle);

        for (final Shape shape : listOfShapes) {
            System.out.println(shape);
        }
    }
}
