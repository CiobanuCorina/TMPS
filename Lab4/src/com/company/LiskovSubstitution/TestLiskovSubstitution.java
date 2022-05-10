package com.company.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class TestLiskovSubstitution {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new AutomateCar(20, "forward"));
        cars.add(new ManualCar(20));
        cars.add(new ManualCar(39));

        cars.forEach(Car::accelerate);
        cars.forEach(Car::brake);
    }
}
