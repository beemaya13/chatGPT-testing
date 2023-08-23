
import static org.junit.jupiter.api.Assertions.*;

import org.example.RegexValidator;
import org.junit.jupiter.api.Test;

class RegexValidatorTest {
    @Test
    void testTooShortInput() {
        assertTrue(RegexValidator.validateString("Aa1!", 5));
    }

    @Test
    void testTooLongInput() {
        assertFalse(RegexValidator.validateString("Aa1!Aa1!Aa1!Aa1!", 15));
    }

    @Test
    void testMatchingInputLength() {
        assertTrue(RegexValidator.validateString("Aa1!Aa1", 7));
    }

    @Test
    void testMissingUppercase() {
        assertFalse(RegexValidator.validateString("aa1!", 5));
    }

    @Test
    void testMissingLowercase() {
        assertFalse(RegexValidator.validateString("AA1!", 5));
    }

    @Test
    void testMissingDigit() {
        assertFalse(RegexValidator.validateString("Aa!!", 5));
    }

    @Test
    void testMissingSpecialCharacter() {
        assertFalse(RegexValidator.validateString("Aa1a", 5));
    }

    @Test
    void testWhitespaceAtStart() {
        assertFalse(RegexValidator.validateString(" Aa1!", 6));
    }

    @Test
    void testWhitespaceAtEnd() {
        assertFalse(RegexValidator.validateString("Aa1! ", 6));
    }

    @Test
    void testWhitespaceInMiddle() {
        assertFalse(RegexValidator.validateString("Aa 1!", 6));
    }
}
