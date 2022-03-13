package com.company.Decorator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Questionnaire extends IQuestionnaire{
    @Override
    public void addQuestion(String question, List<String> answers) {
        questions.put(question, answers);
    }

    @Override
    public int check(String question, String answer) {
        List<String> answers = questions.get(question);
        if(answers.contains("*" + answer)) return 10;
        return 0;
    }

    @Override
    public void ask() {
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, List<String>> question : questions.entrySet()) {
            System.out.println(question.getKey());
            question.getValue().forEach((elem) -> System.out.println(elem.replaceAll("\\*", "")));
            int points = check(question.getKey(), scanner.nextLine());
            if(points == 0) System.out.println("Try again next time!");
            else System.out.printf("Great job! You got %d points\n", points);
            score += points;
        }
        System.out.printf("You got %d points", score);
    }
}
