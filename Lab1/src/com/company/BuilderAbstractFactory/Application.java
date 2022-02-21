package com.company.BuilderAbstractFactory;

public class Application {
    private GreatFactory greatFactory;

    public Application(GreatFactory greatFactory) {
        this.greatFactory = greatFactory;
    }

    public House createHouse() {
        return greatFactory.createHouse();
    }

    public Car createCar() {
        return greatFactory.createCar();
    }
}
