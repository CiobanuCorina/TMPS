package com.company.BuilderAbstractFactory;

public class SimpleCarBuilder implements CarBuilder{
    private Car car;

    public SimpleCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setWindows() {
        car.setWindows(" /|_||_\\`.");
    }

    @Override
    public void setSkeleton() {
        car.setSkeleton("(   _    _ _\\");
    }

    @Override
    public void setWheels() {
        car.setWheels("=`-(_)--(_)-'");
    }

    @Override
    public void setRoof() {
        car.setRoof("  ______");
    }

    public Car getCar() {
        return this.car;
    }
}
