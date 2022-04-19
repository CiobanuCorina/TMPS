package com.company.CommandTemplateMethod;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class AddCommand extends Command{
    protected Todo todo = new Todo();

    @Override
    public void execute() throws ParseException, IOException, SQLException {
        getInput();
        save();
    }

    public void getInput() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the todo:");
        String title = scanner.nextLine();
        todo.setTitle(title);
        System.out.println("Enter the content of todo:");
        todo.setContent(scanner.nextLine());
        todo.setCreatedAt(new Date());
        System.out.println("Enter target date for todo:");
        String targetDate = scanner.nextLine();
        SimpleDateFormat formatedDate = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy");
        todo.setTargetDate(formatedDate.parse(targetDate));
        todo.setStatus(TodoStatuses.NEW);
    }

    public abstract void save() throws IOException, SQLException;
}
