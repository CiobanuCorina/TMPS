package com.company.BuilderAbstractFactory;

public class SimpleHouse extends House{
    @Override
    public String display() {
        return this.roof + "\n" +
                this.wall + "\n" +
                this.window + "\n" +
                this.door;
    }
}
