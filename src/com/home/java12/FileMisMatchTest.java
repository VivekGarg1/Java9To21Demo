package com.home.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMisMatchTest {

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("welcome1.txt");
        Path path2 = Paths.get("welcome2.txt");
        long misMatch = Files.mismatch(path1, path2);
        if(misMatch == -1L)
            System.out.println("Files content is matched.");
        else
            System.out.println("Files content is not matched.");
    }
}
