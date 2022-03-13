package com.company.Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("Answer those questions and get points");
        IQuestionnaire questionnaire = new TimedQuestionnaire(new Questionnaire());
        questionnaire.addQuestion("What is the seventh planet from the sun?",
                Arrays.asList("Jupiter", "Saturn", "*Uranus", "Venus"));
        questionnaire.addQuestion("Who invented the rabies vaccine?",
                Arrays.asList("Albert Einstein", "*Louis Pasteur", "Robert Einstein", "Marie Curie"));
        questionnaire.addQuestion("What colour is a Himalayan poppy?",
                Arrays.asList("*Blue", "Yellow", "White", "Red"));
        questionnaire.ask();
    }
}
