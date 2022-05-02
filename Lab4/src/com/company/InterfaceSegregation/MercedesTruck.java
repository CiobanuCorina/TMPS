package com.company.InterfaceSegregation;

public class MercedesTruck implements Truck{
    @Override
    public String setWindows() {
        return "                      .------.\n" +
                "                     :|||\"\"\"`.`.\n" +
                "                     :|||     7.`.\n";
    }

    @Override
    public String setWheels() {
        return "   /_,-/ ,-. \\ `._____|__________||/ ,-. \\ \\_[\n" +
                "      /\\ `-' /                    /\\ `-' /\n" +
                "        `---'                       `---'\n";
    }

    @Override
    public String setTruck() {
        return "  .===+===+===+===+===||`----L7'-`7`---.._\n" +
                "  []                  || ==       |       \"\"\"-.\n" +
                "  []...._____.........||........../ _____ ____|\n" +
                " c\\____/,---.\\_       ||_________/ /,---.\\_  _/\n";
    }

    @Override
    public void display() {
        System.out.println(setWindows() + setTruck() + setWheels());
    }
}
