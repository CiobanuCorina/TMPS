package com.company.BuilderAbstractFactory;

public class LuxHouse extends House {
    private String garden;

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String display() {
        return this.roof + "\n" +
                this.wall + "\n" +
                this.window + "\n" +
                this.door + "\n" +
                this.garden;
    }
}
