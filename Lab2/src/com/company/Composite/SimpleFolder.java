package com.company.Composite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleFolder implements FileSystem{
    File folder;
    List<FileSystem> files = new ArrayList<>();

    public SimpleFolder(String folderpath) {
        this.folder = new File(folderpath);
        if(!folder.exists()) folder.mkdir();
        File[] fileList = folder.listFiles();
        assert fileList != null;
        for(File file : fileList) {
            files.add(new SimpleFile(file.getPath()));
        }
    }

    public void addPlaintextFile(String filename) throws IOException {
        File newFile = new File(folder + "\\" + filename + ".txt");
        if(newFile.createNewFile()) {
            System.out.println("File created" + newFile.getPath());
            files.add(new SimpleFile(newFile.getPath()));
        }
        else System.out.println("Couldn't crete file, please try again");
    }

    public void removeFile(String filename) {
        File oldFile = new File(folder + "\\" + filename);
        if (oldFile.delete()) {
            System.out.println("File deleted" + oldFile.getPath());
            files.remove(new SimpleFile(oldFile.getPath()));
        }
        else System.out.println("Can't delete file, please try again");
    }
    @Override
    public void ls() {
        System.out.println(folder.getName());
        files.forEach((elem) -> {
            if(elem.getEntity().isDirectory()) {
                SimpleFolder nextFolder = new SimpleFolder(elem.getEntity().getPath());
                nextFolder.ls();
            } else elem.ls();
        });
    }

    @Override
    public void cat() throws IOException {
        files.forEach((elem) -> {
            try {
                if(elem.getEntity().isDirectory()) {
                    SimpleFolder nextFolder = new SimpleFolder(elem.getEntity().getPath());
                    nextFolder.cat();
                }
                else elem.cat();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public File getEntity() {
        return folder;
    }
}
