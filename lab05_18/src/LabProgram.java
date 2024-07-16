/*
 * Name: Coco Louie
 * Date: 06/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 5.17:   Contains the character
 * 
 * Reads an integer from input that indicates the number of string inputs to follow.
 * Stores string inputs in array.
 * Reads a character from input.
 * Outputs input strings that contain the indicated character.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numVals = scnr.nextInt();
		String[] userStrings = new String[numVals];
		char charToContain;
		int[] freq = new int[numVals];
		
		for (int i = 0; i < numVals; ++i) {
			userStrings[i] = scnr.next();
		}
		
		charToContain = scnr.next().charAt(0);
		
		for (int i = 0; i < numVals; ++i) {
			if (userStrings[i].indexOf(charToContain) >= 0) {
				System.out.print(userStrings[i] + ",");
			}
		}
		
		System.out.println();
		

	}

}
