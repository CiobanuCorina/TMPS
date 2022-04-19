package com.company.CommandTemplateMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateFileSystemCommand extends Command{

    @Override
    public void execute() throws ParseException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the todo you want to update:");
        String titleToDelete = scanner.nextLine();
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\Cora\\univer\\SemVII\\TMPS\\test\\test.txt");
        if(file.exists() && file.length() != 0) {
            todos = objectMapper.readValue(file, new TypeReference<>() {});
            Todo todoUpdate = todos.stream()
                    .filter(todo -> titleToDelete.equals(todo.getTitle()))
                    .findFirst()
                    .orElse(null);
            if(todoUpdate == null)
                System.out.println("There is no todo with such a title");
            else {
                System.out.println("Enter the content of the updated todo:");
                todoUpdate.setContent(scanner.nextLine());
                System.out.println("Enter the target date of the updated todo:");
                String targetDate = scanner.nextLine();
                SimpleDateFormat formatedDate = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy");
                todoUpdate.setTargetDate(formatedDate.parse(targetDate));
                todoUpdate.setStatus(TodoStatuses.UPDATED);
                objectMapper.writeValue(file, todos);
            }
        }
    }
}
