package com.home.java12;

public class StringUtilityTest {

    public static void main(String[] args) {
        String strIndent = "Hello World";
        System.out.println("Original String: " + strIndent);
        System.out.println("Original String Length: " + strIndent.length());
        System.out.println("Indent String: " + strIndent.indent(5));
        System.out.println("Indent String Length: " + strIndent.indent(5).length());

        System.out.println("----------------------------------------------------------");

        String strIndentNegative = "     Hello Java";
        System.out.println("Original String: " + strIndentNegative);
        System.out.println("Original String Length: " + strIndentNegative.length());
        System.out.println("Indent String: " + strIndentNegative.indent(-3));
        System.out.println("Indent String Length: " + strIndentNegative.indent(-3).length());

        System.out.println("----------------------------------------------------------");

        String strTransform = "Learn Java";
        String result = strTransform.transform(String::toUpperCase);
        System.out.println(result);

        //Chaining of transformation
        String result1 = strTransform.transform(String::toUpperCase)
                .transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(result1);
    }
}
