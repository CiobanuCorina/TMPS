package com.company.FactoryMethod;

public class Substraction implements Calculator{
    private double a;
    private double b;

    public Substraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a - b;
    }
}
