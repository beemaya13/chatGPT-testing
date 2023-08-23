package org.example;

import static org.example.RegexValidator.validateString;

public class Main
{
    public static void main(String[] args)
    {
        // Test the function
        System.out.println(validateString("Aa1~ \\n", 10));    // false
        System.out.println(validateString("Aa1!", 10));    // true
        System.out.println(validateString("Aa1!Aa1!A", 10));  // true
        System.out.println(validateString("Aa1!Aa1!Aa1!", 10));   // false
        System.out.println(validateString("aa1!", 10));    // false
        System.out.println(validateString("aa1! ", 10));    // false
        System.out.println(validateString("aa1!hfjdkdjhkgjhhdehujfuhydn", 10));    // false
    }
    //STOP WORKING
}