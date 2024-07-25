/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.10 LAB: Fibonacci sequence (recursion)
 * 
 * Reads integer startNum from input, 
 * indicating the index of the fibonacci sequence value to return.
 * Calls method fibonacci with parameter as startNum and outputs the results.
 */

import java.util.Scanner;


public class LabProgram {
   
	/*
	 * Method to calculate the nth value in the fibonacci sequence using recursion.
	 * Takes integer parameter n, indicating the index of the fibonacci value to calculate.
	 * If n is negative, returns -1. Otherwise, returns the fibonacci value indicated by n.
	 */
   public static int fibonacci(int n) {
	   if (n < 0)  {
		   return -1;
	   }
	   else if (n <= 1) {
		   return n;
	   }
	   else {
		   return fibonacci(n-1) + fibonacci(n-2);
	   }      
   }
   
   
   
   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
