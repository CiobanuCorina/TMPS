package com.company.Prototype;

public abstract class Car {
    protected String model;
    protected double speed;
    protected double fuelConsumption;
    protected Owner owner;

    public Car(String model, double speed, double fuelConsumption) {
        this.model = model;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public abstract Object clone();
}
