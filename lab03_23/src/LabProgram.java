/*
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.23 LAB: Interstate highway numbers
Program to output type (source or auxiliary), direction, and if applicable service highway
of an user inputted highwayNumber.
First determines highway direction based on if highwayNumber is odd/even.
Then determines if highway is primary, auxiliary, or not a valid highway.
If auxiliary determines service highway. Outputs all relevant information.
 */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      String highwayDirection; // Cardinal direction of highway.
      int highwayService; // Primary highway serviced by auxiliary highway.

      highwayNumber = scnr.nextInt();

      if ((highwayNumber % 2) == 0) {
         highwayDirection = "east/west";
      }
      else {
         highwayDirection = "north/south";
      }

      if (highwayNumber >= 1 && highwayNumber <= 99) {
         System.out.println("I-" + highwayNumber + " is primary, going " + highwayDirection + ".");
      }
      else if (highwayNumber >= 100 && highwayNumber <= 999) {
         highwayService = highwayNumber % 100;
         if (highwayService != 0){
            System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + highwayService + ", going " + highwayDirection + ".");
         }
         else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
         }
      }
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
   }
}
