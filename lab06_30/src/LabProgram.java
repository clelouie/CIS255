/*
 * Name: Coco Louie
 * Date: 06/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 6.30: Fibonacci sequence
 * 
 * Reads integer startNum from sequences, 
 * indicating the index of the fibonacci sequence value to return.
 * Calls method fibonacci with parameter as startNum and outputs the results.
 */

import java.util.Scanner;

public class LabProgram {
   
	/*
	 * Method to calculate the nth value in the fibonacci sequence.
	 * Takes integer parameter n, indicating the index of the fibonacci value to calculate.
	 * If n is negative, returns 0. Otherwise, returns the fibonacci value indicated by n.
	 */
   public static int fibonacci(int n) {	   
      if (n < 0)  {
    	  return -1;
      }
      else if (n == 0) {
    	  return 0;
      }
      else {
   	   	  int[] fibSequence = new int[n + 1];
    	  fibSequence[0] = 0;
    	  fibSequence[1] = 1;
    	  
    	  for (int i = 2; i <= n; ++i) {
    		  fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
    	  }
    	  return fibSequence[n];
      }
   }
   
   
   
   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}