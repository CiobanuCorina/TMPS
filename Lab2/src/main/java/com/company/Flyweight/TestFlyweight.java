package com.company.Flyweight;

import java.util.ArrayList;

public class TestFlyweight {
    public static void main(String[] args) {
        ArrayList<ScrewDetails> screwDetails = new ArrayList<>();
        ScrewPattern lagScrew1Pattern = ScrewFactory.getScrew("    _________\n" +
                "   | \\/   \\/ |\n" +
                "   |_/\\___/\\_|\n",
                "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n",
                "     '-----'");
        ScrewDetails carScrew = new ScrewDetails(20, 40, lagScrew1Pattern);
        screwDetails.add(carScrew);

        ScrewPattern lagScrew2 = ScrewFactory.getScrew("    _________\n" +
                        "   | \\/   \\/ |\n" +
                        "   |_/\\___/\\_|\n",
                "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n" +
                        "     |=====|\n",
                "     '-----'");
        ScrewDetails tractorScrew = new ScrewDetails(40, 60, lagScrew2);
        screwDetails.add(tractorScrew);
        ScrewPattern sheetMetalScrew = ScrewFactory.getScrew("   ,==\"\"\"\"\"\"\"==,\n" +
                "    '=._   _.='\n",
                "        ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n" +
                        "       ('.|\n" +
                        "        |._)\n",
                "        \\_/");
        ScrewDetails valveScrew = new ScrewDetails(15, 35, sheetMetalScrew);
        screwDetails.add(valveScrew);
        for (ScrewDetails screw: screwDetails) {
            screw.display();
        }
    }
}
