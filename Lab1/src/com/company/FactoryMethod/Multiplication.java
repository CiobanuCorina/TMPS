package com.company.FactoryMethod;

public class Multiplication extends Calculator{
    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a * b;
    }
}
