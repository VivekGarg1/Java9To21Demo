package com.home.java16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEnhancementTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,6,7,8,9);
        List<Integer> listResult = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        listResult.add(10);
        System.out.println(listResult);

        List<Integer> listResult1 = list.stream().filter(n -> n % 2 == 0).toList();
        //listResult1.add(10); //Exception in thread "main" java.lang.UnsupportedOperationException(ImmutableCollections)
        System.out.println(listResult1);
    }
}
