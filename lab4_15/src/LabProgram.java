/*
 * Name: Coco Louie
 * Date: 06/22/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 4.15: Count characters
 * 
 * Given an character and string from input,
 * output the number of times the character appears in the string.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char inputChar;
		String inputString;
		int count = 0;
		
		inputChar = scnr.next().charAt(0);
		inputString = scnr.nextLine();
		
		for (int i = 0; i < inputString.length(); ++i) {
			if (inputString.charAt(i) == inputChar) {
				count += 1;
			}
		}
		
		if (count == 1) {
			System.out.println(count + " " + inputChar);
		}
		else {
			System.out.println(count + " " + inputChar + "'s");
		}

	}

}
