package com.company.BuilderAbstractFactory;

public class CarDirector {
    private ISimpleCarBuilder ISimpleCarBuilder;

    public void setCarBuilder(ISimpleCarBuilder ISimpleCarBuilder) {
        this.ISimpleCarBuilder = ISimpleCarBuilder;
    }

    public void buildSimpleCar(ISimpleCarBuilder ISimpleCarBuilder) {
        ISimpleCarBuilder.setRoof();
        ISimpleCarBuilder.setWindows();
        ISimpleCarBuilder.setSkeleton();
        ISimpleCarBuilder.setWheels();
    }

    public void buildLuxCar(ILuxCarBuilder iLuxCarBuilder) {
        iLuxCarBuilder.setRoof();
        iLuxCarBuilder.setWindows();
        iLuxCarBuilder.setMirrors();
        iLuxCarBuilder.setSkeleton();
        iLuxCarBuilder.setWheels();
    }
}
