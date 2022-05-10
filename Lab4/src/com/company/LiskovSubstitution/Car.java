package com.company.LiskovSubstitution;

public class Car {
    protected double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    };
    public void brake() {
        this.speed--;
    };
}
