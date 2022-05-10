package com.company.OpenClosed;

public class Square implements Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.length * this.length;
    }
}
