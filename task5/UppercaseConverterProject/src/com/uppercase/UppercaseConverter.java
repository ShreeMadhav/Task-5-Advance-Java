package com.uppercase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class UppercaseConverter {
	 public static void main(String[] args) {
	        // Create a Stream of Strings
	        Stream<String> streamNames = Stream.of("aBc", "d", "ef");

	        // Convert to uppercase using map() method
	        List<String> uppercaseNames = streamNames
	                .map(String::toUpperCase) // Convert each string to uppercase
	                .collect(Collectors.toList()); // Collect the results into a List

	        // Print the result
	        System.out.println("Uppercase names: " + uppercaseNames);
	    }

}
