package com.tddexercises.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringCalculator {

    private static final int EMPTY_STRING_RESULT = 0;
    private static final String SEPARATOR = ",";

    public int add(String input) {
        String[] split = input.split(SEPARATOR + "|" + "\n");

        if (split.length == 1) {
            return input.isEmpty() ? EMPTY_STRING_RESULT : Integer.parseInt(input);
        } else {
            return Stream.of(split)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }
}
