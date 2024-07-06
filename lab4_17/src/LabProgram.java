/*
 * Name: Coco Louie
 * Date: 06/22/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 4.16:  Remove all non alpha characters
 * 
 * Given two integers from input,
 * output the first integer and increments of 5 as long as the output value is
 * less than or equal to the second integer.
 * If the second integer is less than the first,
 * output an error message.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int firstInt;
		int secondInt;
		
		firstInt = scnr.nextInt();
		secondInt = scnr.nextInt();
		
		if (firstInt <= secondInt) {
			for (int i = firstInt; i <= secondInt; i = i + 5) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.print("Second integer can't be less than the first.");
		}
		
		System.out.println();

	}

}
