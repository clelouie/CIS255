/*
 * Name: Coco Louie
 * Date: 06/22/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 4.18:  Print string in reverse
 * 
 * Given a line of text as input,
 * output the text in reverse.
 * Program keeps receiving inputs until
 * "Done" "done" or "d" is inputted.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputText;
		
		inputText = scnr.nextLine();
		
		while (!inputText.equals("Done") &&
			   !inputText.equals("done") &&
			   !inputText.equals("d")) {
			
			for (int i = (inputText.length() - 1); i >=0; --i) {
				System.out.print(inputText.charAt(i));
			}
			System.out.println();
			inputText = scnr.nextLine();
		}

	}

}
