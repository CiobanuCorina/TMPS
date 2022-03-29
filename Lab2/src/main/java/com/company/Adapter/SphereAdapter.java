package com.company.Adapter;

public class SphereAdapter implements Shape{
    private Sphere sphere;

    public SphereAdapter(Sphere sphere) {
        this.sphere = sphere;
    }

    @Override
    public int volume() {
        return (int) sphere.volume();
    }
}
