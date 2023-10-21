package com.tddexercises.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCalculatorTest {

    private static final String DEFAULT_EXPECTED_RESULT = "";
    private static final String MULTIPLE_OF_3_EXPECTED_RESULT = "Fizz";
    private static final String MULTIPLE_OF_5_EXPECTED_RESULT = "Buzz";

    private final FizzBuzzCalculator underTest = new FizzBuzzCalculator();

    @Test
    @DisplayName("Given input = 0, then return empty string")
    void givenZeroAsInput_thenReturnEmptyString() {
        String result = underTest.fizzBuzz(0);

        assertEquals(DEFAULT_EXPECTED_RESULT, result);
    }

    @Test
    @DisplayName("Given input = 3, then return \"Fizz\"")
    void givenThreeAsInput_thenReturnFizzString() {
        String result = underTest.fizzBuzz(3);

        assertEquals(MULTIPLE_OF_3_EXPECTED_RESULT, result);
    }

    @Test
    @DisplayName("Given input = 3N (multiple of 3), then return \"Fizz\"")
    void givenMultipleOfThreeAsInput_thenReturnFizzString() {
        for (int input = 3; input <= 30; input += 3) {
            assertEquals(MULTIPLE_OF_3_EXPECTED_RESULT, underTest.fizzBuzz(input));
        }
    }

    @Test
    @DisplayName("Given input = 5, then return \"Buzz\"")
    void givenFiveAsInput_thenReturnBuzzString() {
        String result = underTest.fizzBuzz(5);

        assertEquals(MULTIPLE_OF_5_EXPECTED_RESULT, result);
    }
}
