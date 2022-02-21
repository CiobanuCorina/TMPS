package com.company.BuilderAbstractFactory;

public class SimpleHouseHouseBuilder implements HouseBuilder {
    private House house;

    public SimpleHouseHouseBuilder() {
        this.house = new House();
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

    public House getHouse() {
        return house;
    }
}
