package com.home.java14;

import java.util.Scanner;

public class SwitchExpressionTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (e.g., MONDAY): ");
        String day = scanner.nextLine().toUpperCase();
        System.out.println("You entered: " + day);

        switch(day) {
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println("Week Day");
            case "SATURDAY","SUNDAY" -> System.out.println("Week End");
            default -> throw new IllegalArgumentException("Unexpected Value: " + day);
        }

        System.out.println("-------------------------------------------------------------");

        String result = switch(day) {
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> "Week Day";
            case "SATURDAY","SUNDAY" -> "Week End";
            default -> throw new IllegalArgumentException("Unexpected Value: " + day);
        };
        System.out.println(result);
        scanner.close();
    }
}
