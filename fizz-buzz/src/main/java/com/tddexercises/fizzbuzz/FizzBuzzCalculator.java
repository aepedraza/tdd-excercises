package com.tddexercises.fizzbuzz;

public class FizzBuzzCalculator {

    private static final String FIZZ_VALUE = "Fizz";
    private static final String EMPTY_STRING_DEFAULT_VALUE = "";

    public String fizzBuzz(int input) {
        if (matchesFizzCondition(input)) {
            return FIZZ_VALUE;
        }

        if (input == 5) {
            return "Buzz";
        }

        return EMPTY_STRING_DEFAULT_VALUE;
    }

    private boolean matchesFizzCondition(int input) {
        return input > 0 && input % 3 == 0;
    }
}
