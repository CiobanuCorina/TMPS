package com.company.BuilderAbstractFactory;

public class SimpleCarBuilder implements ISimpleCarBuilder {
    private SimpleCar simpleCar;

    public SimpleCarBuilder() {
        this.simpleCar = new SimpleCar();
    }

    @Override
    public void setWindows() {
        simpleCar.setWindows(" /|_||_\\`.");
    }

    @Override
    public void setSkeleton() {
        simpleCar.setSkeleton("(   _    _ _\\");
    }

    @Override
    public void setWheels() {
        simpleCar.setWheels("=`-(_)--(_)-'");
    }

    @Override
    public void setRoof() {
        simpleCar.setRoof("  ______");
    }

    public SimpleCar getCar() {
        return this.simpleCar;
    }
}
