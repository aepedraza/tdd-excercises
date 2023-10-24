package com.tddexercises.stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    private final StringCalculator underTest = new StringCalculator();

    @Test
    @DisplayName("Given empty string then return zero")
    void givenEmptyString_thenReturnZero() {
        assertEquals(0, underTest.add(""));
    }

    @ParameterizedTest
    @DisplayName("Given single number as input then return the same number")
    @ValueSource(strings = { "1", "2", "3" })
    void givenSingleNumber_thenReturnSameNumber(String input) {
        assertEquals(Integer.parseInt(input), underTest.add(input));
    }

    @Test
    @DisplayName("Given 2 numbers separated by comma, then return their sum")
    void given2NumbersSeparatedByComma_thenReturnTheirSum() {
        assertEquals(3, underTest.add("1,2"));
    }

    @Test
    @DisplayName("Given multiple numbers separated by comma, then return their sum")
    void givenMultipleNumbersWithSeparator_thenReturnTheirSum() {
        assertEquals(6, underTest.add("1,2,3"));
    }

    @Test
    @DisplayName("Given input with different separators, then allow and return their sum")
    void givenInputWithDifferentSeparators_thenAllowAndReturnTheirSum() {
        assertEquals(30, underTest.add("5,10\n15"));
    }

    @Test
    @DisplayName("Given input with invalid adjacent separators, then throw IllegalArgumentException")
    void givenInputWithInvalidAdjacentSeparators_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> underTest.add("1,\n2"));
    }

    @Test
    @DisplayName("Given input with separator at the end, then throw exception")
    void givenInputWithInvalidSeparatorAtTheEnd_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> underTest.add("1,2,"));
    }
}
