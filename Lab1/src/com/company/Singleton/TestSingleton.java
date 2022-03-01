package com.company.Singleton;

import javax.management.MBeanServer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TestSingleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's add some questions to the questionnaire: (type exit when you finish)");
        System.out.println("enter next question when you finish entering answers");
        Questionnaire questionnaire = new Questionnaire();
        while(true) {
            List<String> answers = new ArrayList<>();

            String question = scanner.nextLine();
            if(question.equals("exit"))
                break;
            while(true){
                String answer = scanner.nextLine();
                if(answer.equals("next question"))
                    break;
                answers.add(answer);
            }
            questionnaire.addQuestion(question, answers);
        }

        System.out.println("Now answer the questions (you can answer only once)");
        Answers answers = Answers.getInstance();
        System.out.println("Your answers:");
        questionnaire.ask(answers);
        System.out.println("Do you want to answer one more time?[yes/no]");
        if(Objects.equals(scanner.next(), "yes")) {
            Answers answerSecond = Answers.getInstance();
            if(answerSecond == answers)
                System.out.println("The questionnaire can be completed only once");
        }
    }
}
