package com.company.BuilderAbstractFactory;

public class LuxCar extends Car{
    private String mirrors;

    public void setMirrors(String mirrors) {
        this.mirrors = mirrors;
    }

    @Override
    public String display() {
        return this.roof + "\n" +
                this.windows + "\n" +
                this.mirrors + "\n" +
                this.skeleton + "\n" +
                this.wheels;
    }
}
