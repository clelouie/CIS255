/*
 * Name: Coco Louie
 * Date: 07/15/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.12 LAB: Input errors with zyLabs
 * 
 * Takes three integer inputs, finds and outputs max value.
 * If missing an input, outputs number of inputs and max value of inputs.
 * If no inputs, outputs "No max".
 */

import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max;
      int numInputs = 0;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      try {
    	  val1 = scnr.nextInt();
    	  numInputs += 1;
    	  val2 = scnr.nextInt();
    	  numInputs += 1;
    	  val3 = scnr.nextInt();
    	  numInputs += 1;
    	  
    	  max = val1;
    	  
    	  if (val2 > max) { max = val2; }
    	  if (val3 > max) { max = val3; }
    	  
    	  System.out.println(max);
      }
      catch (NoSuchElementException excpt) {
    	  
    	  System.out.println(numInputs + " input(s) read:");

    	  if (numInputs > 0) {
        	  max = val1;
        	  if (val2 > max) { max = val2; }
        	  if (val3 > max) { max = val3; }
        	  
        	  System.out.println("Max is " + max);
    	  }
    	  else {
    		  System.out.println("No max");
    	  }
      }
      
   }
}
