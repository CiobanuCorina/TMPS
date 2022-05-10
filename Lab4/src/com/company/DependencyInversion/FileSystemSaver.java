package com.company.DependencyInversion;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSystemSaver extends UserSaver{
    List<User> users = new ArrayList<>();

    @Override
    public void save() throws IOException {
        getUserInputData();
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\Cora\\univer\\SemVII\\TMPS\\test\\test.txt");
        if(file.exists() && file.length() != 0){
            users = objectMapper.readValue(file, new TypeReference<>() {});
        }
        users.add(user);
        objectMapper.writeValue(file, users);
    }
}
