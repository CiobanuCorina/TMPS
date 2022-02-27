package com.company.BuilderAbstractFactory;

public class TestBuilder {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector();

        SimpleHouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        director.buildSimpleHouse(simpleHouseBuilder);
        SimpleHouse house = simpleHouseBuilder.getHouse();

        System.out.println(house);
    }
}
