package com.company.LiskovSubstitution;

public class ManualCar extends Car{
    protected int gear;

    public ManualCar(double speed) {
        super(speed);
        this.checkGear();
    }

    public void checkGear() {
        if(speed >= 0 && speed <= 10) this.gear = 1;
        else if(speed > 10 && speed <= 20) this.gear = 2;
        else if(speed > 20 && speed <= 30) this.gear = 3;
        else if(speed > 30 && speed <= 40) this.gear = 4;
        else if(speed < 40) this.gear = 5;
    }
    @Override
    public void accelerate() {
        super.accelerate();
        this.checkGear();
        System.out.println(this.gear);
    }

    @Override
    public void brake() {
        super.brake();
        this.checkGear();
        System.out.println(this.gear);
    }
}
