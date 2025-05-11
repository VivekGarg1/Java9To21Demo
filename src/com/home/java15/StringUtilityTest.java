package com.home.java15;

public class StringUtilityTest {

    //Formatted and Translate Escape
    public static void main(String[] args) {
        Integer userId = 111;
        String userName = "Vivek Garg";
        String message = String.format("%s %d", userName,userId);
        System.out.println(message);

        String message1 = "%s %d".formatted(userName,userId);
        System.out.println(message1);

        String empDetail = """
                Employee Detail
                ---------------------
                Employee Number : %d
                Employee Name : %s
                Employee Salary : %f
                Employee Address : %s
                """;
        String formattedEmpDetail = empDetail.formatted(111,"Vivek Garg",5000f,"Test");
        System.out.println(formattedEmpDetail);

        String str = "Hello\nJava\nWorld";
        System.out.println(str);

        String str1 = "Hello\nJava\\\nWorld";
        System.out.println(str1);
        System.out.println(str1.translateEscapes());
    }
}
