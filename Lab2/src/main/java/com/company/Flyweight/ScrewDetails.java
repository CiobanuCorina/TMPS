package com.company.Flyweight;

public class ScrewDetails {
    private double diameter;
    private double length;
    private ScrewPattern screwType;

    public ScrewDetails(double diameter, double length, ScrewPattern screwType) {
        this.diameter = diameter;
        this.length = length;
        this.screwType = screwType;
    }

    public void display() {
        screwType.display();
        System.out.println("\nWith diameter of " + this.diameter + " and with length " + this.length);
    }
}
