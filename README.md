# **StringValidatorApp Documentation**

## **Application Description**
`StringValidatorApp` is a Java application that validates an input string against a specified maximum length and a set of constraints. The string must contain at least one uppercase letter, one lowercase letter, one digit, and one special character. The application then outputs whether the input string is valid or not.

## **Regex Implementation Description**
The core of this application's validation logic lies within the `RegexValidator` class, which uses a regular expression to perform validation. The regex is dynamically built based on the provided `maxLength`. It checks for the presence of at least one uppercase letter, one lowercase letter, one numeric digit, and one of the specified special characters. The regex then ensures that only characters from the defined set are present in the input and validates the string's length to ensure it doesn't exceed `maxLength`. It's worth noting that this regex might not handle some edge cases with certain character combinations or unique encodings, so thorough testing is recommended before deployment in a production environment.

## **Running StringValidatorApp Locally**

1. **Prerequisites:** Ensure you have Java and the required libraries (e.g., SLF4J) installed on your machine.

2. **Compile the Application:** Navigate to the directory containing `StringValidatorApp.java` and `RegexValidator.java`. Compile both classes:
    ```bash
    javac StringValidatorApp.java RegexValidator.java
    ```

3. **Run the Application:** After successful compilation, run the application with two arguments - the input string to be validated and the maximum length the string can have.
    ```bash
    java StringValidatorApp "<inputString>" <maxLength>
    ```

   **Example:**
    ```bash
    java StringValidatorApp "Aa1!" 4
    ```

4. The application will then output whether the input string is valid or not.

## **Note**: 
Remember to ensure your classpath includes the required libraries or you may encounter runtime errors.


