package com.tddexercises.stringcalculator;

public class StringCalculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else {
            String[] split = input.split(",");
            if (split.length == 1) {
                return Integer.parseInt(input);
            } else {
                return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            }
        }
    }
}
