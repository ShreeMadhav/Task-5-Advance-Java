package com.agecalculator;

import java.util.Scanner;
public class AgeCalculatorApplication {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get the user's birthdate
	        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
	        String inputDate = scanner.nextLine();
	        
	        // Calculate age
	        AgeCalculator ageCalculator = new AgeCalculator();
	        String age = ageCalculator.calculateAge(inputDate);
	        
	        // Output the result
	        System.out.println(age);
	        
	        // Close the scanner
	        scanner.close();
	    }

}
