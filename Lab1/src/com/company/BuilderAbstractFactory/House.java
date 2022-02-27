package com.company.BuilderAbstractFactory;

public abstract class House {
    protected String roof;
    protected String wall;
    protected String window;
    protected String door;

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public abstract String display();
}
