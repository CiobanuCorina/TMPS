package com.company.LiskovSubstitution;

public class AutomateCar extends Car{
    protected String mode;
    protected String option;

    public AutomateCar(double speed, String option) {
        super(speed);
        this.option = option;
    }

    public void changeMode(String mode) {
        this.mode = mode;
    };

    @Override
    public void accelerate() {
        super.accelerate();
        if(option.equals("forward")) this.changeMode("Drive");
        else this.changeMode("Reverse");
        System.out.println(this.mode);
    }

    @Override
    public void brake() {
        super.brake();
        if(option.equals("Park")) this.changeMode("Park");
        else this.changeMode("Neutral");
        System.out.println(this.mode);
    }
}
