package com.company.DecoratorProxy;

import java.util.HashMap;
import java.util.List;

public abstract class IQuestionnaire {
    protected HashMap<String, List<String>> questions = new HashMap<String, List<String>>();
    protected int score = 0;

    public abstract void addQuestion(String question, List<String> answers);
    public abstract void ask();
    public abstract int checkAnswer(String question, String answer);
}
