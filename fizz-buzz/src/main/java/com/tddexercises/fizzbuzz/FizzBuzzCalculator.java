package com.tddexercises.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzzCalculator {

    private static final String FIZZ_VALUE = "Fizz";
    private static final String BUZZ_VALUE = "Buzz";
    private static final int FIZZ_MOD_DIVISOR = 3;
    private static final int BUZZ_MOD_DIVISOR = 5;

    /**
     * Returns a {@code "Fizz"} {@code "Buzz"} or {@code "FizzBuzz"} String depending on the given input
     * <ul>
     *     <li>"Fizz" when input is multiple of 3</li>
     *     <li>"Buzz" when input is multiple of 5</li>
     *     <li>"FizzBuzz" when input is multiple of 3 and 5</li>
     *     <li>The number as String if no condition is met. 0 is considered not meeting previous condition</li>
     * </ul>
     *
     * @param input Provided input
     * @return The generated result
     */
    public String fizzBuzz(int input) {
        StringBuilder resultBuilder = new StringBuilder();

        appendIfMatchesCondition(this::matchesFizzCondition, input, resultBuilder, FIZZ_VALUE);
        appendIfMatchesCondition(this::matchesBuzzCondition, input, resultBuilder, BUZZ_VALUE);

        return !resultBuilder.isEmpty() ? resultBuilder.toString() : Integer.toString(input);
    }

    private void appendIfMatchesCondition(Predicate<Integer> condition, int input, StringBuilder builder, String toAppend) {
        if (condition.test(input)) {
            builder.append(toAppend);
        }
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
