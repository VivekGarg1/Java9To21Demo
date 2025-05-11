package com.home.java12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberTest {

    public static void main(String[] args) throws ParseException {
        var shortFormat = NumberFormat.getCompactNumberInstance(new Locale("en","us"),
                NumberFormat.Style.SHORT);
        System.out.println(shortFormat.format(1000));
        System.out.println(shortFormat.format(10000));
        System.out.println(shortFormat.format(100000));
        System.out.println(shortFormat.format(1000000));

        System.out.println("----------------------------------------------------------");

        var longFormat = NumberFormat.getCompactNumberInstance(new Locale("en","us"),
                NumberFormat.Style.LONG);
        System.out.println(longFormat.format(1000));
        System.out.println(longFormat.format(10000));
        System.out.println(longFormat.format(100000));
        System.out.println(longFormat.format(1000000));

        System.out.println("----------------------------------------------------------");

        System.out.println(longFormat.parse("1 thousand"));
    }
}
