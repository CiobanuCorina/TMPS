package com.company.Singleton;

import java.util.*;

public class Questionnaire {
    private HashMap<String, List<String>> questions = new HashMap<String, List<String>>();

    public HashMap<String, List<String>> getQuestions() {
        return questions;
    }

    public void addQuestion(String question, List<String> answers) {
        questions.put(question, answers);
    }

    public Answers ask(Answers answers) {
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, List<String>> entry : questions.entrySet()) {
            System.out.println(entry.getKey());
            String answer = scanner.nextLine();
            if(entry.getValue().contains(answer))
                answers.addAnswers(entry.getKey(), answer);
            else {
                System.out.println("No such variant");
                return null;
            }
        }
        return answers;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "questions=" + questions +
                '}';
    }
}
