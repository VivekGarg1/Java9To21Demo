package com.home.java10;

import java.util.ArrayList;
import java.util.function.Predicate;

public class VarKeyword {

    public static void main(String[] args) {
        int a = 10;
        String s =  "Java 10";
        var i = 100;
        var j = 10.7f;
        var a1 = true;
        var a2 = false;
        var list = new ArrayList<>();

        Employee emp = new Employee();
        var empObj = new Employee();

        //java 11
        Predicate<Integer> isEven = (var num) -> num%2 == 0;
        System.out.println(isEven.test(10));
    }
}
