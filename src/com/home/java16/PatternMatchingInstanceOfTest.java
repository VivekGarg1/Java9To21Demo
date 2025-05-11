package com.home.java16;

public class PatternMatchingInstanceOfTest {

    public static void main(String[] args) {
        //Object obj = "Hello World";
        Object obj = 5;
        if(obj instanceof String){
            String s = (String) obj;
            if(s.length() > 5)
                System.out.println(s.toUpperCase());
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            System.out.println(i*i);
        }

        //From java 16 onwards
        if(obj instanceof String s){
            if(s.length() > 5)
                System.out.println(s.toUpperCase());
        } else if (obj instanceof Integer i) {
            System.out.println(i*i);
        }
        System.out.println("Done");
    }
}
