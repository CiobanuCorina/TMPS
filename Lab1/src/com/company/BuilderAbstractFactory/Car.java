package com.company.BuilderAbstractFactory;

public abstract class Car {
    protected String roof;
    protected String windows;
    protected String skeleton;
    protected String wheels;

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public abstract String display();
}
