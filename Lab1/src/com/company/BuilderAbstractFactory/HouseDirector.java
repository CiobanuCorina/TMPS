package com.company.BuilderAbstractFactory;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public void setBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildSimpleHouse(HouseBuilder houseBuilder) {
        houseBuilder.setRoof();
        houseBuilder.setWalls();
        houseBuilder.setWindow();
        houseBuilder.setDoor();
    }
}
