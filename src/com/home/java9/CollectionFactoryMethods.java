package com.home.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        List<String>  list = List.of("Vivek Garg", "Shivam Garg", "Prabhat Kumar", "Md Sameer");
        list.forEach(System.out::println);
        //list.add("Shubham Sharma"); // Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println("-------------------------------------------------------------------");

        Set<String> set = Set.of("Vivek Garg", "Shivam Garg", "Prabhat Kumar", "Md Sameer");
        set.forEach(System.out::println);
        //set.add("Shubham Sharma"); // Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println("-------------------------------------------------------------------");

        Map<Integer, String> map = Map.of(1,"Vivek Garg", 2,"Shivam Garg", 3,"Prabhat Kumar", 4,"Md Sameer");
        map.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println("-------------------------------------------------------------------");

        Map<Integer, String> entryMap = Map.ofEntries(entry(1,"Vivek Garg"),entry(2,"Shivam Garg"));
        entryMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
