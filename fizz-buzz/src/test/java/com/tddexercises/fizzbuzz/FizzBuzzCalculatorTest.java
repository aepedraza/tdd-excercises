package com.tddexercises.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @DisplayName("Given input = 3N (multiple of 3), then return \"Fizz\"")
    @ValueSource(ints = { 3, 6, 9, 12, 18, 21, 24, 27, 30, 33 })
    void givenMultipleOfThreeAsInput_thenReturnFizzString(int input) {
        assertEquals(MULTIPLE_OF_3_EXPECTED_RESULT, underTest.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given input = 5, then return \"Buzz\"")
    void givenFiveAsInput_thenReturnBuzzString() {
        String result = underTest.fizzBuzz(5);

        assertEquals(MULTIPLE_OF_5_EXPECTED_RESULT, result);
    }

    @ParameterizedTest
    @DisplayName("Given input = 5N (multiple of 5), then return \"Buzz\"")
    @ValueSource(ints = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70 })
    void givenMultipleOfFiveAsInput_thenReturnBuzzString(int input) {
        assertEquals(MULTIPLE_OF_5_EXPECTED_RESULT, underTest.fizzBuzz(input));
    }

    @ParameterizedTest
    @DisplayName("Given input = 3*5*N (multiple of 3 and 5), then return \"FizzBuzz\"")
    @ValueSource(ints = { 15, 30, 45, 60, 75 })
    void givenMultipleOrThreeAndFive_thenReturnFizzBuzzString(int input) {
        assertEquals("FizzBuzz", underTest.fizzBuzz(input));
    }
}
