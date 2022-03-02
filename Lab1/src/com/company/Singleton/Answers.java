package com.company.Singleton;

import java.util.HashMap;
import java.util.List;

public class Answers {
    private HashMap<String, String> answer;
    private static Answers instance;

    private Answers() {
        this.answer = new HashMap<String, String>();
    }

    public synchronized static Answers getInstance() {
        if(Answers.instance == null) {
            instance = new Answers();
            return instance;
        }
        return instance;
    }

    public void addAnswers(String question, String answer) {
        this.answer.put(question, answer);
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answer=" + answer +
                '}';
    }
}
