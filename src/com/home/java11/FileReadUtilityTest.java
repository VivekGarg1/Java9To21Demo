package com.home.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadUtilityTest {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("student.txt");
        String result = Files.readString(filePath);
        System.out.println(result);
    }
}
