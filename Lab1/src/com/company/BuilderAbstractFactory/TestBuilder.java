package com.company.BuilderAbstractFactory;

public class TestBuilder {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector();

        SimpleHouseHouseBuilder simpleHouseBuilder = new SimpleHouseHouseBuilder();
        director.buildSimpleHouse(simpleHouseBuilder);
        House house = simpleHouseBuilder.getHouse();

        System.out.println(house);
    }
}
