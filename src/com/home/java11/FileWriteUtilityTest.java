package com.home.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteUtilityTest {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("G:/","Java Development/","Java9To21Demo/","testfile/","dummy.txt");
        Files.writeString(filePath, "Welcome to file demo");
        String result = Files.readString(filePath);
        System.out.println(result);
    }
}
