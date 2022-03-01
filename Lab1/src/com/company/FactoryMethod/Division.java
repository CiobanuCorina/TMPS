package com.company.FactoryMethod;

public class Division extends Calculator{
    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a / b;
    }
}
