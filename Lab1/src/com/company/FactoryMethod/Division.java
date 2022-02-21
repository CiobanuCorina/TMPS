package com.company.FactoryMethod;

public class Division implements Calculator{
    private double a;
    private double b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a / b;
    }
}
