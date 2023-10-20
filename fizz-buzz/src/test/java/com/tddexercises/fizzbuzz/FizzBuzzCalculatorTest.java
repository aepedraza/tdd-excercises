package com.tddexercises.fizzbuzz;

import org.junit.jupiter.api.Test;

class FizzBuzzCalculatorTest {

    @Test
    void givenZeroAsInput_whenCalculateFizzBuzz_thenReturnEmptyString() {
        String result = underTest.fizzBuzz(0);
    }
}
