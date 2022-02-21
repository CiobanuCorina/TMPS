package com.company.BuilderAbstractFactory;

public class LuxHouse extends House{
    private String garden;

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                this.garden;
    }
}
