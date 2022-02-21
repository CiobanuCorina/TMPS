package com.company.BuilderAbstractFactory;

public class CarDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void buildSimpleCar(CarBuilder carBuilder) {
        carBuilder.setRoof();
        carBuilder.setWindows();
        carBuilder.setSkeleton();
        carBuilder.setWheels();
    }
}
