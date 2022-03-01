package com.company.Prototype;

public class LuxCar extends Car{
    private boolean paintProtection;
    public LuxCar(String model, double speed, double fuelConsumption, boolean paintProtection) {
        super(model, speed, fuelConsumption);
        this.paintProtection = paintProtection;
    }

    public LuxCar(String model, double speed, double fuelConsumption, Owner owner, boolean paintProtection) {
        super(model, speed, fuelConsumption);
        this.owner = owner;
        this.paintProtection = paintProtection;
    }

    @Override
    public Object clone() {
        LuxCar luxCar = new LuxCar(this.model, this.speed, this.fuelConsumption, this.paintProtection);
        luxCar.setOwner((Owner) this.getOwner().clone());
        return luxCar;
    }
}
