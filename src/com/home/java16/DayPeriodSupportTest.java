package com.home.java16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayPeriodSupportTest {

    public static void main(String[] args) {
        String result = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, h:mm a", Locale.US)
                .format(LocalDateTime.now());
        System.out.println(result);

        String result1 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, h:mm B", Locale.US)
                .format(LocalDateTime.now());
        System.out.println(result1);
    }
}
