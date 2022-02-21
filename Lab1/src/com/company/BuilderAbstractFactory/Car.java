package com.company.BuilderAbstractFactory;

public class Car {
    private String roof;
    private String windows;
    private String skeleton;
    private String wheels;

    public String getWindows() {
        return windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return this.roof + "\n" +
                this.windows + "\n" +
                this.skeleton + "\n" +
                this.wheels;
    }
}
