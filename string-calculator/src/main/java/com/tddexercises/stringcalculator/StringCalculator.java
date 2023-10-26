package com.tddexercises.stringcalculator;

import java.util.stream.Stream;

public class StringCalculator {

    private static final String COMMA_SEPARATOR = ",";
    private static final String NEWLINE_SEPARATOR = "\n";
    private static final String REGEX_OR_CONDITION = "|";
    private static final String DEFAULT_SEPARATOR = String.join(REGEX_OR_CONDITION, COMMA_SEPARATOR, NEWLINE_SEPARATOR);
    private static final int EMPTY_STRING_RESULT = 0;

    private String delimiter;
    private String sanitizedInput;

    public int add(String input) {
        calculateInputAndDelimiter(input);
        String[] addends = sanitizedInput.split(delimiter);
        return calculatedSum(addends);
    }

    private void calculateInputAndDelimiter(String input) {
        if (inputWithCustomDelimiter(input)) {
            sanitizedInput = input.substring(input.indexOf("\n") + 1);
            delimiter = calculateCustomDelimiter(input);
            validateSanitizedInput();
        } else {
            validateInput(input);
            sanitizedInput = input;
            delimiter = DEFAULT_SEPARATOR;
        }
    }

    private boolean inputWithCustomDelimiter(String input) {
        return input.startsWith("//");
    }

    private String calculateCustomDelimiter(String input) {
        String separator = input.substring(2, input.indexOf("\n"));
        // TODO: 25/10/2023 Sanitize regex special characters
        separator = separator.replaceAll("\\|", "\\\\|");
        return separator;
    }

    private void validateSanitizedInput() {
        String validInputRegex = "(\\d" + delimiter + ")+\\d";
        if (!sanitizedInput.matches(validInputRegex)) {
            throw new InvalidInputException();
        }
    }

    private void validateInput(String input) {
        if (input.endsWith(COMMA_SEPARATOR) || input.endsWith(NEWLINE_SEPARATOR)) {
            throw new IllegalArgumentException();
        }
    }

    private int calculatedSum(String[] addends) {
        if (addends.length == 1) {
            return sanitizedInput.isEmpty() ? EMPTY_STRING_RESULT : Integer.parseInt(sanitizedInput);
        } else {
            return Stream.of(addends)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }
}
