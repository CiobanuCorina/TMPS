package com.company.BuilderAbstractFactory;

public class SimpleFactory implements GreatFactory{
    @Override
    public House createHouse() {
        HouseDirector director = new HouseDirector();
        SimpleHouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        director.buildSimpleHouse(simpleHouseBuilder);
        return simpleHouseBuilder.getHouse();
    }

    @Override
    public SimpleCar createCar() {
        CarDirector carDirector = new CarDirector();
        SimpleCarBuilder simpleCarBuilder = new SimpleCarBuilder();
        carDirector.buildSimpleCar(simpleCarBuilder);
        return simpleCarBuilder.getCar();

    }
}
