package com.tddexercises.stringcalculator;

public class StringCalculator {

    private static final int EMPTY_STRING_RESULT = 0;
    private static final String SEPARATOR = ",";

    public int add(String input) {
        if (input.isEmpty()) {
            return EMPTY_STRING_RESULT;
        } else {
            String[] split = input.split(SEPARATOR);
            if (split.length == 1) {
                return Integer.parseInt(input);
            } else {
                return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            }
        }
    }
}
