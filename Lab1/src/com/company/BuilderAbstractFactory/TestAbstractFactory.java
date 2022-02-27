package com.company.BuilderAbstractFactory;

import java.util.Scanner;

public class TestAbstractFactory {
    public static void main(String[] args) {
        GreatFactory greatFactory;
        Application app;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which kind of house and car do you want:");
        System.out.println("1) Simple");
        System.out.println("2) Lux");
        switch(scanner.nextInt()) {
            case 1:
                greatFactory = new SimpleFactory();
                app = new Application(greatFactory);
                System.out.println(app.createHouse().display());
                System.out.println(app.createCar().display());
                break;
            case 2:
                greatFactory = new LuxFactory();
                app = new Application(greatFactory);
                System.out.println(app.createHouse().display());
                System.out.println(app.createCar().display());
                break;
            default:
                System.out.println("No such variant");
        };
    }
}
