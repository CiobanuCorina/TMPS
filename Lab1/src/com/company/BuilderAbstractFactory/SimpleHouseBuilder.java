package com.company.BuilderAbstractFactory;

public class SimpleHouseBuilder implements ISimpleHouseBuilder {
    private SimpleHouse house;

    public SimpleHouseBuilder() {
        this.house = new SimpleHouse();
    }

    @Override
    public void setRoof() {
        house.setRoof("____||____\n" +
                " ///////////\\\n" +
                "///////////  \\");
    }

    @Override
    public void setWalls() {
        house.setWall("|    _    |  |");
    }

    @Override
    public void setDoor() {
        house.setDoor("|   | |   |  |");
    }

    @Override
    public void setWindow() {
        house.setWindow("|[] | | []|[]|");
    }

    public SimpleHouse getHouse() {
        return house;
    }
}
