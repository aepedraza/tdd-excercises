package com.tddexercises.stringcalculator;

import java.util.stream.Stream;

public class StringCalculator {

    private static final String COMMA_SEPARATOR = ",";
    private static final String NEWLINE_SEPARATOR = "\n";
    private static final String REGEX_OR_CONDITION = "|";
    private static final int EMPTY_STRING_RESULT = 0;

    public int add(String input) {
        String[] split = input.split(String.join(REGEX_OR_CONDITION, COMMA_SEPARATOR, NEWLINE_SEPARATOR));

        if (split.length == 1) {
            return input.isEmpty() ? EMPTY_STRING_RESULT : Integer.parseInt(input);
        } else {
            return Stream.of(split)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }
}
