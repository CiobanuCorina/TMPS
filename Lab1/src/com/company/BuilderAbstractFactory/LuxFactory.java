package com.company.BuilderAbstractFactory;

public class LuxFactory implements GreatFactory{
    @Override
    public House createHouse() {
        HouseDirector director = new HouseDirector();
        LuxHouseBuilder luxHouseBuilder = new LuxHouseBuilder();
        director.buildLuxHouse(luxHouseBuilder);
        return luxHouseBuilder.getHouse();
    }

    @Override
    public Car createCar() {
        CarDirector director = new CarDirector();
        LuxCarBuilder luxCarBuilder = new LuxCarBuilder();
        director.buildLuxCar(luxCarBuilder);
        return luxCarBuilder.getCar();
    }
}
