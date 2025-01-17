/*
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.25 LAB: Leap year
Program to determine if user input inputYear is a leap year.
First tests if divisible by 4.
Then tests if it is a century year - if so, tests if divisible by 400.
Assigns isLeapYear with true or false accordingly.
Outputs inputYear and status as leap year.
 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();
      
      if ((inputYear % 4) == 0) {
         if ((inputYear % 100) == 0 && (inputYear % 400) == 0) {
            isLeapYear = true;
         }
         if ((inputYear % 100) == 0 && (inputYear % 400) != 0) {
            isLeapYear = false;
         }
         else {
            isLeapYear = true;
         }
      }
      else {
         isLeapYear = false;
      }

      if (isLeapYear) {
         System.out.println(inputYear + " - leap year");
      }
      else {
         System.out.println(inputYear + " - not a leap year");
      }
   }
}
