package com.company.Decorator;

import java.util.List;

public class QuestionnaireDecorator extends IQuestionnaire{
    IQuestionnaire wrappee;

    public QuestionnaireDecorator(IQuestionnaire wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void addQuestion(String question, List<String> answers) {
        wrappee.addQuestion(question, answers);
    }

    @Override
    public void ask() {
        wrappee.ask();
    }

    @Override
    public int check(String question, String answer) {
        return wrappee.check(question, answer);
    }
}
