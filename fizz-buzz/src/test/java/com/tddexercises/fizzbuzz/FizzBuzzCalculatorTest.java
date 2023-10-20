package com.tddexercises.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCalculatorTest {

    private static final String DEFAULT_EXPECTED_RESULT = "";
    private static final String MULTIPLE_OF_3_EXPECTED_RESULT = "Fizz";

    private final FizzBuzzCalculator underTest = new FizzBuzzCalculator();

    @Test
    void givenZeroAsInput_whenCalculateFizzBuzz_thenReturnEmptyString() {
        String result = underTest.fizzBuzz(0);

        assertEquals(DEFAULT_EXPECTED_RESULT, result);
    }

    @Test
    void givenThreeAsInput_thenReturnFizzString() {
        String result = underTest.fizzBuzz(3);

        assertEquals(MULTIPLE_OF_3_EXPECTED_RESULT, result);
    }

    @Test
    void givenMultipleOfThreeAsInput_thenReturnFizzString() {
        for (int input = 3; input <= 30; input += 3) {
            assertEquals(MULTIPLE_OF_3_EXPECTED_RESULT, underTest.fizzBuzz(input));
        }
    }
}
