package com.company.FactoryMethod;

public class Addition extends Calculator{
    public Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a + b;
    }
}
