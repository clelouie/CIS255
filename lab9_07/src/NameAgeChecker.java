/*
 * Name: Coco Louie
 * Date: 07/14/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.7 LAB: Exception handling to detect input String vs. Integer
 * 
 * Reads input single word names and ages
 * Throws an exception and outputs age as 0 if the second input is not an integer
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String inputName;
      int age;
      
      inputName = scnr.next();
      while (!inputName.equals("-1")) {
    	 try {
    		 age = scnr.nextInt();
    		 System.out.println(inputName + " " + (age + 1));
    	 }
    	 catch (InputMismatchException excpt) {
    		 System.out.println(inputName + " 0");
    		 scnr.next();
    		 scnr.next();
    	 }
         inputName = scnr.next();
      }
   }
}