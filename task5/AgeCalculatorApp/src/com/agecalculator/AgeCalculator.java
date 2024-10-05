package com.agecalculator;

import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
	   public String calculateAge(String birthdate) {
	        // Parse the birthdate
	        LocalDate birthDate = LocalDate.parse(birthdate);
	        LocalDate currentDate = LocalDate.now();

	        // Calculate the period between the birthdate and current date
	        Period period = Period.between(birthDate, currentDate);
	        
	        // Return the formatted age string
	        return String.format("Your age is: %d years, %d months, and %d days.", 
	                             period.getYears(), period.getMonths(), period.getDays());
	    }

}
