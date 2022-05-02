package com.company.InterfaceSegregation;

public class MercedesSedan implements SimpleCar{
    @Override
    public String setWindows() {
        return "                   _..-------++._\n" +
                "               _.-'/ |      _||  \\\"--._\n" +
                "         __.--'`._/_\\j_____/_||___\\    `----.\n";
    }

    @Override
    public String setWheels() {
        return "[__]==// .-. \\\\==`===========/==// .-. \\\\=[__]\n" +
                "  `-._|\\ `-' /|___\\_________/___|\\ `-' /|_.' \n" +
                "        `---'                     `---'\n";
    }

    @Override
    public String setSkeleton() {
        return "   _.--'_____    |          \\     _____    /\n" +
                " _j    /,---.\\   |        =o |   /,---.\\   |_\n" ;
    }

    @Override
    public void display() {
        System.out.println(setWindows() + setSkeleton() + setWheels());
    }
}
