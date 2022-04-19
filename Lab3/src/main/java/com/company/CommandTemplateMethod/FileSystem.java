package com.company.CommandTemplateMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileSystem extends AddCommand{
    @Override
    public void save() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\Cora\\univer\\SemVII\\TMPS\\test\\test.txt");
        if(file.exists() && file.length() != 0){
            todos = objectMapper.readValue(file, new TypeReference<>() {});
        }
        todos.add(todo);
        objectMapper.writeValue(file, todos);
    }
}
