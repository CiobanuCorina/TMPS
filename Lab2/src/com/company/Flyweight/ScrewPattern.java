package com.company.Flyweight;

public class ScrewPattern {
    private String head;
    private String thread;
    private String tip;

    public ScrewPattern(String head, String thread, String tip) {
        this.head = head;
        this.thread = thread;
        this.tip = tip;
    }

    public void display() {
        System.out.println(this.head + "\n" +
                this.thread + "\n" +
                this.tip);
    }

    public String getHead() {
        return head;
    }

    public String getThread() {
        return thread;
    }

    public String getTip() {
        return tip;
    }
}
