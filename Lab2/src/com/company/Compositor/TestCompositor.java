package com.company.Compositor;

import java.io.IOException;

public class TestCompositor {
    public static void main(String[] args) throws IOException {
        FileSystem folder = new SimpleFolder("D:\\Cora\\univer\\SemVII\\TMPS\\test");
        folder.ls();
        folder.cat();
    }
}
