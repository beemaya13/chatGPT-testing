package org.example;

import java.util.regex.Pattern;

public class RegexValidator
{

    /**
     * Validate a string against given constraints.
     *
     * @param input     The string to validate.
     * @param maxLength The maximum allowable length for the input string.
     * @return True if the string meets the criteria, otherwise false.
     */
    public static boolean validateString(String input, int maxLength)
    {
        // Build the regex dynamically based on the provided maxLength
        String regex = String.format(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%%&'()*+,-./:;<=>?@\\[\\]^_`{|}~])" + // At least one upper, lower, digit, special char
                        "[A-Za-z\\d!\"#$%%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{1,%d}$", // Character class to ensure only allowed chars and validate length
                maxLength);

        return Pattern.matches(regex, input);
    }
}
