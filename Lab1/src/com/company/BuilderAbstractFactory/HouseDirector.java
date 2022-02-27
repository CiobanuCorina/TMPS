package com.company.BuilderAbstractFactory;

public class HouseDirector {
    private ISimpleHouseBuilder ISimpleHouseBuilder;

    public void setBuilder(ISimpleHouseBuilder ISimpleHouseBuilder) {
        this.ISimpleHouseBuilder = ISimpleHouseBuilder;
    }

    public void buildSimpleHouse(ISimpleHouseBuilder ISimpleHouseBuilder) {
        ISimpleHouseBuilder.setRoof();
        ISimpleHouseBuilder.setWalls();
        ISimpleHouseBuilder.setWindow();
        ISimpleHouseBuilder.setDoor();
    }

    public void buildLuxHouse(ILuxHouseBuilder iLuxHouseBuilder) {
        iLuxHouseBuilder.setRoof();
        iLuxHouseBuilder.setWalls();
        iLuxHouseBuilder.setWindow();
        iLuxHouseBuilder.setDoor();
        iLuxHouseBuilder.setGarden();
    }
}
