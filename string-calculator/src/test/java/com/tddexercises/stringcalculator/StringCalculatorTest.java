package com.tddexercises.stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
