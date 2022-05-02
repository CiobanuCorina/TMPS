package com.company.InterfaceSegregation;

public class TestInterfaceSegregation {
    public static void main(String[] args) {
        Car sedan = new MercedesSedan();
        sedan.display();
        Car truck = new MercedesTruck();
        truck.display();
    }
}
