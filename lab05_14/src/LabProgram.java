/*
 * Name: Coco Louie
 * Date: 06/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 5.14:  Middle item
 * 
 * Reads a list of integers from input and stores in array userValues.
 * Outputs middle item of inputs, calculated by (total inputs / 2).
 * If the number of inputs exceeds 9, outputs "Too many numbers".
 */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user 
      int nextVal;
      int i = 0;
      
      nextVal = scnr.nextInt();
      
      while (nextVal >= 0 && i < 9) {
    	  userValues[i] = nextVal;
    	  nextVal = scnr.nextInt();
    	  ++i;
      }
      
      if (i >= 9 && nextVal >= 0) {
    	  System.out.println("Too many numbers");
      }
      else {
          System.out.println("Middle item: " + userValues[i / 2]);
      } 

   }
}