package ru.clevertec;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789"})
    void testIsAllPositiveNumbers_True(String number) {
        assertTrue(Utils.isAllPositiveNumbers(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-123", "abc", "2.1", "0",  ""})
    void testIsAllPositiveNumbers_False(String input) {
        assertFalse(Utils.isAllPositiveNumbers(input));
    }
}
