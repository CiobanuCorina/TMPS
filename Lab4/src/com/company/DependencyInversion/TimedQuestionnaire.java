package com.company.DependencyInversion;

import java.util.concurrent.*;

public class TimedQuestionnaire extends QuestionnaireDecorator{
    public TimedQuestionnaire(IQuestionnaire wrappee) {
        super(wrappee);
    }


    @Override
    public void ask() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<Object> perform = service.submit(() -> {
                wrappee.ask();
                return "";
            });

            System.out.println(perform.get(10, TimeUnit.SECONDS));
        } catch (final TimeoutException e) {
            System.out.println("Time out. You lost.");
            service.shutdown();
            System.exit(0);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}
