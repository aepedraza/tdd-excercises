package com.tddexercises.stringcalculator;

public class StringCalculator {

    private static final int EMPTY_STRING_RESULT = 0;
    private static final String SEPARATOR = ",";

    public int add(String input) {
        String[] split = input.split(SEPARATOR);

        if (split.length == 1) {
            return input.isEmpty() ? EMPTY_STRING_RESULT : Integer.parseInt(input);
        } else {
            return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
        }
    }
}
