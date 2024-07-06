/*
 * Name: Coco Louie
 * Date: 06/22/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 4.16:  Remove all non alpha characters
 * 
 * Given a string from input,
 * output all alpha characters (remove all non-alpha characters).
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputString;
		
		inputString = scnr.nextLine();
		
		for (int i = 0; i < inputString.length(); ++i) {
			if (Character.isLetter(inputString.charAt(i))) {
				System.out.print(inputString.charAt(i));
			}
		}
		
		System.out.println();

	}

}
