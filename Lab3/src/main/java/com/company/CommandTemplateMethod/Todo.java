package com.company.CommandTemplateMethod;

import java.util.Date;

public class Todo {
    private String title;
    private String content;
    private Date createdAt;
    private Date targetDate;
    private TodoStatuses status;

    public Todo(String title, String content, Date createdAt, Date targetDate, TodoStatuses status) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.targetDate = targetDate;
        this.status = status;
    }

    public Todo() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public TodoStatuses getStatus() {
        return status;
    }

    public void setStatus(TodoStatuses status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", targetDate=" + targetDate +
                ", status=" + status +
                '}';
    }
}
