package com.home.java11;

import java.util.stream.Stream;

public class StringUtilityTest {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.repeat(10));

        String strStrip = "     Hello     ";
        System.out.println(strStrip.strip());
        System.out.println(strStrip.strip().length());

        String strStripLeading = "     Hello     ";
        System.out.println(strStripLeading.stripLeading());
        System.out.println(strStripLeading.stripLeading().length());

        String strStripTrailing= "     Hello     ";
        System.out.println(strStripTrailing.stripTrailing());
        System.out.println(strStripTrailing.stripTrailing().length());

        var strLines = "Java\nVivek\nGarg";
        Stream<String> stream = strLines.lines();
        stream.forEach(System.out::println);

        String s = "";
        System.out.println(s.isBlank());
    }
}
