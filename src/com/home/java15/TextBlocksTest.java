package com.home.java15;

public class TextBlocksTest {

    public static void main(String[] args) {
        String str = "Hello Java World";
        System.out.println(str);

        //String s1 = """Hello Java World"""; //Invalid syntax
        String s1 = """
                 Hello Java World""";
        System.out.println(s1);

        String s2 = """
                 Hello Java World
                 """;
        System.out.println(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(str));
        System.out.println(s2.equals(str));

        String s3 = """
                 'Hello Java World'
                 "Hello Spring"
                 \"""Hello Spring Boot\"""
                 """;
        System.out.println(s3);

        String s4 = """
                 Hello Java World
                 Hello Spring
                 Hello Spring Boot
                 """;
        System.out.println(s4);

        String s5 = """
                 Hello Java World\
                 Hello Spring\
                 Hello Spring Boot\
                 """;
        System.out.println(s5);

        String s6 = """
                 Hello Java World\s\
                 Hello Spring\s\
                 Hello Spring Boot\s\
                 """;
        System.out.println(s6);

        String s7 = """
                Hello Java World \
                Hello Spring \
                Hello Spring Boot \
                """;
        System.out.println(s7);

        String s8 = """
                {
                "id" : 1,
                "name" : "Vivek Garg"
                }
                """;
        System.out.println(s8);

    }
}
