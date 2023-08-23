package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringValidatorApp
{
    private static final Logger logger = LoggerFactory.getLogger(StringValidatorApp.class);

    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            logger.info("Usage: java StringValidatorApp <inputString> <maxLength>");
            return;
        }

        String inputString = args[0];
        int maxLength;

        try
        {
            maxLength = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e)
        {
            logger.error("Error: The second argument should be an integer representing the maximum length.");
            return;
        }

        boolean isValid = RegexValidator.validateString(inputString, maxLength);
        if (isValid)
        {
            logger.info("The input string is valid.");
        }
        else
        {
            logger.info("The input string is invalid.");
        }
    }
}