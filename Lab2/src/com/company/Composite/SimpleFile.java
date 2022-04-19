package com.company.Composite;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleFile implements FileSystem{
    File file;

    public SimpleFile(String filepath) {
        this.file = new File(filepath);
    }

    @Override
    public File getEntity() {
        return file;
    }

    @Override
    public void ls() {
        System.out.println(file.getName());
    }

    public void catEditor() throws IOException {
        Desktop.getDesktop().open(file);
    }

    @Override
    public void cat() throws IOException {
        if(!file.getPath().substring(file.getPath().lastIndexOf(".") + 1).equals("txt")) {
            this.catEditor();
        }
        else System.out.println(Files.readString(Path.of(file.getAbsolutePath()), StandardCharsets.UTF_8));
    }
}
