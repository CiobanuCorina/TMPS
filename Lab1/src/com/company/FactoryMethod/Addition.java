package com.company.FactoryMethod;

public class Addition implements Calculator{
    private double a;
    private double b;

    public Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a + b;
    }
}
