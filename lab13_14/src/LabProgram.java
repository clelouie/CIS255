/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.14 LAB: Drawing a right side up triangle
 * 
 * Reads one integer from input.
 * Outputs an isosceles triangle with made up of "*" characters,
 * with the input integer indicating the number of characters in the base.
 */

import java.util.Scanner;

public class LabProgram {
   
    // Recursive method to print an isosceles triangle of "*" characters
	// given the parameter baseLength
	// Centers triangle on a maximum base length of 19 with spaces
		public static void drawTriangle(int baseLength) {
		if (baseLength == 1) {
			System.out.println("         *");
		}
		else {
			drawTriangle(baseLength - 2);
			
			int spaces = ((20 - baseLength) / 2);
			
			for (int i = 0; i < spaces; ++i) {
				System.out.print(" ");
			}
			for (int i = 0; i < baseLength; ++i) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	
	
	
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int baseLength;
      
      baseLength = scnr.nextInt();
      drawTriangle(baseLength);
   }
}
