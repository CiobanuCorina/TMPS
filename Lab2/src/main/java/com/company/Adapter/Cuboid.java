package com.company.Adapter;

public class Cuboid implements Shape{
    private int width;
    private int length;
    private int height;

    public Cuboid(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public int volume() {
        return width * length * height;
    }
}
