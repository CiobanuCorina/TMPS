package com.company.DecoratorProxy;

import java.util.List;

public class QuestionnaireProxy extends IQuestionnaire{
    User user;
    IQuestionnaire questionnaire;

    public QuestionnaireProxy(User user) {
        this.questionnaire = new Questionnaire();
        this.user = user;
    }

    public boolean hasAddQuestionPermission() {
        return user.isAdmin();
    }

    public boolean hasAskPermission() {
        return !user.isAdmin();
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void addQuestion(String question, List<String> answers) {
        if(hasAddQuestionPermission()) questionnaire.addQuestion(question, answers);
        else System.out.println("You don't have permission to add question");
    }

    @Override
    public void ask() {
        if(hasAskPermission()) questionnaire.ask();
        else System.out.println("You don't have permission to ask");
    }

    @Override
    public int checkAnswer(String question, String answer) {
        return questionnaire.checkAnswer(question, answer);
    }
}
