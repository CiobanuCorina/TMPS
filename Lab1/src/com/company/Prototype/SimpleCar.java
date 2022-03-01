package com.company.Prototype;

public class SimpleCar extends Car{
    public SimpleCar(String model, double speed, double fuelConsumption) {
        super(model, speed, fuelConsumption);
    }

    public SimpleCar(String model, double speed, double fuelConsumption, Owner owner) {
        super(model, speed, fuelConsumption);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SimpleCar{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", owner=" + owner +
                '}';
    }

    @Override
    public Object clone() {
        SimpleCar simpleCar = new SimpleCar(this.model, this.speed, this.fuelConsumption);
        simpleCar.setOwner((Owner) this.getOwner().clone());
        return simpleCar;
    }
}
