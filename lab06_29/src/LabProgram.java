/*
 * Name: Coco Louie
 * Date: 06/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 6.29: Word frequencies - methods
 * 
 * Reads integer listSize from input, indicating the number of strings to follow.
 * Then reads string array wordsList from input.
 * Calls method getWordFrequency for each string in wordsList.
 * Outputs each string and calculated frequency.
 */

import java.util.Scanner;

public class LabProgram {
	
	/*
	 * Method to count the frequency of a provided word in an array, ignoring case.
	 * Takes parameters string array wordsList, listSize, and currWord, the string to look for.
	 * Counts occurrences of currWord in wordsList and stores in freq.
	 * Returns freq.
	 */
	public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
		int freq = 0;
		
		for (int i = 0; i < listSize; ++i) {
			if (wordsList[i].equalsIgnoreCase(currWord)) {
				++freq;
			}
		}
		
		return freq;
	}

	
	
	
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] wordsList = new String[20];
		int i;
		
		int listSize = scnr.nextInt();
		
		for (i = 0; i < listSize; ++i) {
			wordsList[i] = scnr.next();
		}
		
		for (i = 0; i < listSize; ++i) {
			System.out.print(wordsList[i] + " ");
			System.out.println(getWordFrequency(wordsList, listSize, wordsList[i]));
		}
		

	}

}
