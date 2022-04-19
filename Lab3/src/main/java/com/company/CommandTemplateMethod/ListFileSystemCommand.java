package com.company.CommandTemplateMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ListFileSystemCommand extends Command{
    @Override
    public void execute() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\Cora\\univer\\SemVII\\TMPS\\test\\test.txt");
        if(file.exists() && file.length() != 0){
            todos = objectMapper.readValue(file, new TypeReference<>() {});
            if(todos != null) {
                checkOutdatedTodos();
                objectMapper.writeValue(file, todos);
                todos = objectMapper.readValue(file, new TypeReference<>() {});
                todos.forEach(todo -> System.out.println(todo.toString()));
            }
        } else {
            System.out.println("No todo at the moment. Enter add command to make your first todo.");
        }
    }

    public void checkOutdatedTodos() {
        todos.forEach(todo -> {
            Date now = new Date();
            if((todo.getTargetDate().equals(now) || todo.getTargetDate().before(now)) &&
                    !todo.getStatus().equals(TodoStatuses.OUTDATED)) {
                todo.setStatus(TodoStatuses.OUTDATED);
            }
        });
    }
}
