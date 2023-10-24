package com.tddexercises.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    private final StringCalculator underTest = new StringCalculator();

    @Test
    void givenEmptyString_thenReturnZero() {
        assertEquals(0, underTest.add(""));
    }
}
