/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.13 LAB: Count the digits
 * 
 * Reads one integer from input.
 * Outputs the number of digits in the integer,
 * determined by calling digitCount
 */

import java.util.Scanner;

public class LabProgram {
   
    // Recursive method, takes one integer parameter
	// Returns number of digits in integer by checking division by 10
	public static int digitCount(int num) {

		if (num / 10 == 0){
			return 1;
		}
		else {
			return 1 + digitCount(num / 10);
		}
	}
   
	
	
	
	
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
   }
}
