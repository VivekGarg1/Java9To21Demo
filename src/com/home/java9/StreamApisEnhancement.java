package com.home.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApisEnhancement {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,1,5,7,8,9,10);
        List<Integer> result = numbers.stream()
                .filter(n -> n%2==0).toList();
        System.out.println("Even numbers: " + result);

        List<Integer> resultTakeWhile = numbers.stream()
                .takeWhile(n -> n%2==0).toList();
        System.out.println("Even numbers: " + resultTakeWhile);

        List<Integer> resultDropWhile = numbers.stream()
                .dropWhile(n -> n%2==0).toList();
        System.out.println("Even numbers: " + resultDropWhile);

        //Stream.iterate(1, x-> x +1).forEach(System.out::println); //Infinite Loop
        Stream.iterate(1, x-> x+1).limit(10).forEach(System.out::println); //Till Java 8
        Stream.iterate(1, x -> x<8, x-> x+2).forEach(System.out::println); // In Java 9

        Stream<String> stream = Stream.ofNullable(null);
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.ofNullable("Java 9");
        stream1.forEach(System.out::println);

    }
}
