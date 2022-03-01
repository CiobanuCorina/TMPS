package com.company.FactoryMethod;

public class Substraction extends Calculator{
    public Substraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a - b;
    }
}
