package com.company.DecoratorProxy;

import java.util.Arrays;

public class TestProxy {
    public static void main(String[] args) {
        User admin = new User("Cotaga", "Sergiu", 23, "078453624", new String[]{"ADMIN"});
        User simpleUser = new User("Andronache", "Tudor", 45, "0682345126", new String[]{"USER"});
        QuestionnaireProxy proxy = new QuestionnaireProxy(admin);
        proxy.addQuestion("What is the seventh planet from the sun?",
                Arrays.asList("Jupiter", "Saturn", "*Uranus", "Venus"));
        proxy.ask();
        proxy.setUser(simpleUser);
        proxy.ask();
    }
}
