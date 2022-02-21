package com.company.BuilderAbstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        GreatFactory greatFactory = new SimpleFactory();

        Application app = new Application(greatFactory);
        System.out.println(app.createHouse());
        System.out.println(app.createCar());
    }
}
