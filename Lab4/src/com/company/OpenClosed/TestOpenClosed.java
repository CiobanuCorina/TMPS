package com.company.OpenClosed;

import java.util.ArrayList;
import java.util.List;

public class TestOpenClosed {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(12.3));
        shapes.add(new Rectangle(23.6, 21.4));
        shapes.add(new Circle(14.5));
        shapes.forEach(shape -> System.out.println(shape.calculateArea()));
    }
}
