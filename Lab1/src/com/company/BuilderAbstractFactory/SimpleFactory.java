package com.company.BuilderAbstractFactory;

public class SimpleFactory implements GreatFactory{
    @Override
    public House createHouse() {
        HouseDirector director = new HouseDirector();
        SimpleHouseHouseBuilder simpleHouseBuilder = new SimpleHouseHouseBuilder();
        director.buildSimpleHouse(simpleHouseBuilder);
        return simpleHouseBuilder.getHouse();
    }

    @Override
    public Car createCar() {
        CarDirector carDirector = new CarDirector();
        SimpleCarBuilder simpleCarBuilder = new SimpleCarBuilder();
        carDirector.buildSimpleCar(simpleCarBuilder);
        return simpleCarBuilder.getCar();

    }
}
