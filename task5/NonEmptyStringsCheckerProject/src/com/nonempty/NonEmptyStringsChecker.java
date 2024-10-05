package com.nonempty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringsChecker {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out non-empty strings using streams
        List<String> nonEmptyStrings = strings.stream()
            .filter(s -> !s.isEmpty()) // Keep only non-empty strings
            .collect(Collectors.toList()); // Collect the results into a List

        // Print the result
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
