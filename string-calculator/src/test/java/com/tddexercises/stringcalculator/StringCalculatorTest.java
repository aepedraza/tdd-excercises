package com.tddexercises.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    private StringCalculator underTest;

    @Test
    void givenEmptyString_thenReturnZero() {
        Assertions.assertEquals(0, underTest.add(""));
    }
}
