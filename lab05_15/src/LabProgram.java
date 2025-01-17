/*
 * Name: Coco Louie
 * Date: 06/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 5.15:  Output values below an amount
 * 
 * Reads a list of integers from input.
 * The first integer indicates the number of values to follow.
 * The final value indicates a threshold value to compare the previous values too.
 * Outputs values below the indicated threshold value.
 */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      int numVals;
      int threshold;
      
      numVals = scnr.nextInt();
      
      for (int i = 0; i < numVals; ++i) {
    	  userValues[i] = scnr.nextInt();
      }
      
      threshold = scnr.nextInt();
      
      for (int i = 0; i < numVals; ++i) {
    	  if (userValues[i] < threshold) {
    		  System.out.print(userValues[i] + ",");
    	  }
      }
      
      System.out.println();
   }
}