package com.company.CommandTemplateMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFileSystemCommand extends Command{

    @Override
    public void execute() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the todo you want to delete");
        String titleToDelete = scanner.nextLine();
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\Cora\\univer\\SemVII\\TMPS\\test\\test.txt");
        if(file.exists() && file.length() != 0) {
            todos = objectMapper.readValue(file, new TypeReference<>() {});
            Todo todoDelete = todos.stream()
                    .filter(todo -> titleToDelete.equals(todo.getTitle()))
                    .findFirst()
                    .orElse(null);
            if(todoDelete == null)
                System.out.println("There is no todo with such a title");
            else {
                todos.remove(todoDelete);
                objectMapper.writeValue(file, todos);
            }
        }
    }
}
