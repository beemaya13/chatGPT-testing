import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.example.StringValidatorApp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testMissingArgs() {
        StringValidatorApp.main(new String[]{});
        assertTrue(outContent.toString().contains("Usage: java StringValidatorApp <inputString> <maxLength>"));
    }

    @Test
    public void testNonIntegerMaxLength() {
        StringValidatorApp.main(new String[]{"Aa1!", "NotAnInteger"});
        assertTrue(outContent.toString().contains("Error: The second argument should be an integer representing the maximum length."));
    }

    @Test
    public void testValidString() {
        // Assuming that RegexValidator.validateString("Aa1!", 4) returns true
        StringValidatorApp.main(new String[]{"Aa1!", "4"});
        assertTrue(outContent.toString().contains("The input string is valid."));
    }

    @Test
    public void testInvalidString() {
        // Assuming that RegexValidator.validateString("Aa", 4) returns false
        StringValidatorApp.main(new String[]{"Aa", "4"});
        assertTrue(outContent.toString().contains("The input string is invalid."));
    }
}

