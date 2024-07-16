/*
 * Name: Coco Louie
 * Date: 07/15/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.10 LAB: Step counter - exceptions
 * 
 * Takes integer input numSteps, calls method stepsToMiles and outputs numMiles.
 * Throws excpetion and prints message if numSteps is negative.
 */

import java.util.Scanner;

public class LabProgram {
	// Takes integer parameter numSteps, calculates and returns numMiles
	// Throws exception if numSteps is negative
	public static double stepsToMiles(int numSteps) throws Exception {
		final double STEPS_IN_MILE = 2000.0;
		double numMiles;
		
		if (numSteps < 0) {
			throw new Exception("Exception: Negative step count entered.");
		}
		
		numMiles = numSteps / STEPS_IN_MILE;
		
		return numMiles;
	}
   
	
	
	
	
	
	// Reads numSteps from input, calls stepsToMiles with numSteps as parameter
	// Outputs returned value
	// If stepsToMiles throws an expection, prints message
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numSteps = scnr.nextInt();

      try {
    	  System.out.printf("%.2f\n", stepsToMiles(numSteps));
      }
      catch (Exception excpt) {
    	  System.out.println(excpt.getMessage());
      }
   }
}
