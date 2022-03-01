package com.company.Prototype;

public class TestPrototype {
    public static void main(String[] args) {
        SimpleCar car1 = new SimpleCar("Ab2345", 200.34, 500.67,
                new Owner("Gheorghe", "Ababii", 40, "078563412", "str. Stefan cel Mare 12"));
        SimpleCar car2 = (SimpleCar) car1.clone();
        System.out.println(car1);
        System.out.println(car2);

        System.out.println("\n\n");
        car2.getOwner().setFirstName("Dragos");
        System.out.println(car1);
        System.out.println(car2);
    }
}
