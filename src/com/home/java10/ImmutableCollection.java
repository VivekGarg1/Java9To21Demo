package com.home.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableCollection {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);

        List<Integer> result = list.stream().filter(i -> i%2 == 0).collect(Collectors.toUnmodifiableList());
        //result.add(400); //Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(result);

        List<Integer> result1 = List.copyOf(list);
        //result1.add(400); //Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(result1);
    }
}
