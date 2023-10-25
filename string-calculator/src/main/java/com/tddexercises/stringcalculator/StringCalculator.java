package com.tddexercises.stringcalculator;

import java.util.stream.Stream;

public class StringCalculator {

    private static final String COMMA_SEPARATOR = ",";
    private static final String NEWLINE_SEPARATOR = "\n";
    private static final String REGEX_OR_CONDITION = "|";
    private static final int EMPTY_STRING_RESULT = 0;

    public int add(String input) {
        String delimiter;
        if (inputWithCustomDelimiter(input)) {
            input = input.substring(input.indexOf("\n") + 1);
            delimiter = calculateCustomDelimiter(input);
        } else {
            validateInput(input);
            delimiter = String.join(REGEX_OR_CONDITION, COMMA_SEPARATOR, NEWLINE_SEPARATOR);
        }

        String[] split = input.split(delimiter);

        if (split.length == 1) {
            return input.isEmpty() ? EMPTY_STRING_RESULT : Integer.parseInt(input);
        } else {
            return Stream.of(split)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }

    private boolean inputWithCustomDelimiter(String input) {
        return input.matches("//.+\\n.+");
    }

    private String calculateCustomDelimiter(String input) {
        return ";";
    }

    private void validateInput(String input) {
        if (input.endsWith(COMMA_SEPARATOR) || input.endsWith(NEWLINE_SEPARATOR)) {
            throw new IllegalArgumentException();
        }
    }
}
