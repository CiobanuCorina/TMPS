package com.company.Decorator;

import java.sql.Time;
import java.util.*;

public class TimedQuestionnaire extends QuestionnaireDecorator{
    public TimedQuestionnaire(IQuestionnaire wrappee) {
        super(wrappee);
    }

    @Override
    public void ask() {
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, List<String>> question : wrappee.questions.entrySet()) {
            Timer timer = new Timer();
            System.out.println(question.getKey());
            question.getValue().forEach((elem) -> System.out.println(elem.replaceAll("\\*", "")));
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time out");
                    cancel();
                    System.exit(0);
                }
            }, 5*1000);
            int points = wrappee.check(question.getKey(), scanner.nextLine());
            if(points == 0) System.out.println("Try again next time!");
            else System.out.printf("Great job! You got %d points\n", points);
            score += points;
            timer.cancel();
        }
        System.out.printf("You got %d points", score);
    }
}
