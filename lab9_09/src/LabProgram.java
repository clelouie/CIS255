/*
 * Name: Coco Louie
 * Date: 07/15/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.9 LAB: Simple integer division - multiple exception handlers
 * 
 * Reads two integers from input, outputs integer 1 / integer 2
 * If integer 2 is 0, outputs Arithmetic Exception message.
 * If input type does not match integer, outputs Input Mismatch Exception message.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int userNum, divNum;
      
      try {
    	  userNum = scnr.nextInt();
    	  divNum = scnr.nextInt();
      
    	  System.out.println(userNum / divNum);
      }
      catch (ArithmeticException excpt) {
    	  System.out.print("Arithmetic Exception: ");
    	  System.out.println(excpt.getMessage());
      }
      catch (InputMismatchException excpt) {
    	  System.out.print("Input Mismatch Exception: ");
    	  System.out.println(excpt.toString());
      }
   }
}
