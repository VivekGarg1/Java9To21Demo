package com.home.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("outputfile.txt");
        try(fileOutputStream) {
            fileOutputStream.write("Hello World".getBytes());
            System.out.println("Given String is written in the file successfully");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
