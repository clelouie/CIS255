/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.12 LAB: Number pattern
 * 
 * Reads two numbers from input. 
 * Calls printNumberPattern, outputting the following number pattern:
 * Given a positive integer, subtract another positive integer until a negative is reached
 * Then add the second integer until the first integer is reached again
 */

import java.util.Scanner;

public class NumberPattern {
   
	// Recursive method, takes two integer parameters.
	// Prints a pattern such that:
	// num2 is continually subtracted from num1 until a negative number is reached
	// Then num2 is continually added until num1 is reached again
	public static void printNumPattern(int num1, int num2) {
		
		if (num1 < 0) {
			System.out.print(num1 + " ");
			return;
		}
		
		System.out.print(num1 + " ");
		printNumPattern(num1 - num2, num2);
		System.out.print(num1 + " ");
	}
  
	
	
	
	
	
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 