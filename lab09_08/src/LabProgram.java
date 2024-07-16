/*
 * Name: Coco Louie
 * Date: 07/15/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.8 LAB: Exceptions with arrays
 * 
 * Reads integer input indicating an array index.
 * Ouputs item in names corresponding to the index.
 * If index is out of bounds, outputs exception message and nearest name.
 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      /* Type your code here. */
		try {
			System.out.println("Name: " + names[index]);
		}
		catch (ArrayIndexOutOfBoundsException excpt) {
			System.out.println("Exception! Index " + index + " out of bounds for length 10");
			if (index < 0) {
				System.out.println("The closest name is: Ryley");
			}
			else {
				System.out.println("The closest name is: Johnny");
			}
		}
   }
}
