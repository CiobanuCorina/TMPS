package com.company.Adapter;

public class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4 * 3.14 * Math.pow(radius, 3))/3;
    }
}
