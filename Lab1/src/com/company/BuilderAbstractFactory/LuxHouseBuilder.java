package com.company.BuilderAbstractFactory;

public class LuxHouseBuilder implements ILuxHouseBuilder {
    private LuxHouse house;

    public LuxHouseBuilder() {
        this.house = new LuxHouse();
    }
    @Override
    public void setRoof() {
        house.setRoof(" ) )        /\\\n" +
                " =====      /  \\\n" +
                "_|___|_____/ __ \\____________\n" +
                "|::::::::::/ |  | \\:::::::::::|\n" +
                "|:::::::::/  ====  \\::::::::::|\n" +
                "|::::::::/__________\\:::::::::|\n" +
                "|_________|  ____  |__________|");
    }

    @Override
    public void setWalls() {
        house.setWall("| ______ | / || \\ | _______ |");
    }

    @Override
    public void setDoor() {
        house.setDoor("||--+---|| |    | ||---+---||\n" +
                "||__|___|| |   o| ||___|___||\n" +
                "|========| |____| |=========|");
    }

    @Override
    public void setWindow() {
        house.setWindow("||  |   || ====== ||   |   ||");

    }

    @Override
    public void setGarden() {
        house.setGarden("(^^-^^^^^-|________|-^^^--^^^)\n" +
                "(,, , ,, ,/________\\,,,, ,, ,)\n" +
                "','',,,,' /__________\\,,,',',;;");
    }

    public LuxHouse getHouse() {
        return this.house;
    }
}
