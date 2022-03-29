package com.company.Flyweight;

import java.util.ArrayList;

public class ScrewFactory {
    private static ArrayList<ScrewPattern> screws = new ArrayList<>();

    public static ScrewPattern getScrew(String head, String thread, String tip) {
        for (ScrewPattern screw: screws) {
            if(screw.getHead().equals(head) &&
            screw.getThread().equals(thread) &&
            screw.getTip().equals(tip))
                return screw;
        }
        ScrewPattern screw = new ScrewPattern(head, thread, tip);
        screws.add(screw);
        return screw;
    }
}
