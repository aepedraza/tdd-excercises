package com.tddexercises.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCalculatorTest {

    private static final String EMPTY_STRING = "";

    private final FizzBuzzCalculator underTest = new FizzBuzzCalculator();

    @Test
    void givenZeroAsInput_whenCalculateFizzBuzz_thenReturnEmptyString() {
        String result = underTest.fizzBuzz(0);

        assertEquals(EMPTY_STRING, result);
    }

    @Test
    void givenThreeAsInput_thenReturnFizzString() {
        String result = underTest.fizzBuzz(3);

        assertEquals("Fizz", result);
    }
}
