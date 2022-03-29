package com.company.Adapter;

public class TestAdapter {
    public static void main(String[] args) {
        System.out.println(new Cuboid(2, 5, 4).volume());
        System.out.println(new SphereAdapter(new Sphere(5)).volume());
    }
}
