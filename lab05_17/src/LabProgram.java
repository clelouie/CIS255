/*
 * Name: Coco Louie
 * Date: 06/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 5.17:  Word frequences
 * 
 * Reads an integer from input that indicates the number of string inputs to follow.
 * Outputs each input string and associated frequency.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numVals = scnr.nextInt();
		String[] userStrings = new String[numVals];
		int[] freq = new int[numVals];
		
		for (int i = 0; i < numVals; ++i) {
			userStrings[i] = scnr.next();
		}
		
		for (int i = 0; i < numVals; ++i) {
			int count = 0;
			for (int j = 0; j < numVals; ++j) {
				if (userStrings[i].equals(userStrings[j])) {
					++count;
				}
			}
			freq[i] = count;
		}
		
		for (int i = 0; i < numVals; ++i) {
			System.out.println(userStrings[i] + " - " + freq[i]);
		}
		
	}

}
