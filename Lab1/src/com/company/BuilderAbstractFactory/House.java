package com.company.BuilderAbstractFactory;

public class House {
    private String roof;
    private String wall;
    private String window;
    private String door;

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

    @Override
    public String toString() {
        return this.roof + "\n" +
                this.wall + "\n" +
                this.window + "\n" +
                this.door;
    }
}
