package com.company.BuilderAbstractFactory;

public class SimpleCar extends Car{
    @Override
    public String display() {
        return this.roof + "\n" +
                this.windows + "\n" +
                this.skeleton + "\n" +
                this.wheels;
    }
}
