package com.tddexercises.fizzbuzz;

public class FizzBuzzCalculator {

    private static final String EMPTY_STRING_DEFAULT_VALUE = "";
    private static final String FIZZ_VALUE = "Fizz";
    private static final String BUZZ_VALUE = "Buzz";
    private static final int FIZZ_MOD_DIVISOR = 3;
    private static final int BUZZ_MOD_DIVISOR = 5;

    public String fizzBuzz(int input) {
        if (matchesFizzCondition(input)) {
            return FIZZ_VALUE;
        }

        if (matchesBuzzCondition(input)) {
            return BUZZ_VALUE;
        }

        return EMPTY_STRING_DEFAULT_VALUE;
    }

    private boolean matchesFizzCondition(int input) {
        return matchesModCondition(input, FIZZ_MOD_DIVISOR);
    }

    private boolean matchesModCondition(int input, int mod) {
        return input > 0 && input % mod == 0;
    }

    private boolean matchesBuzzCondition(int input) {
        return matchesModCondition(input, BUZZ_MOD_DIVISOR);
    }
}
