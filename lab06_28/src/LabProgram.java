/*
 * Name: Coco Louie
 * Date: 06/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 6.28: Sort an array
 * 
 * Reads integer numVals from input, indicating the number of values to follow.
 * Then reads integer array userArray from input.
 * Calls method sortArray on userArray with numVals.
 * Outputs the results of sortArray.
 */

import java.util.Scanner;

public class LabProgram {
	/*
	 * Method to sort the contents of an array in descending order.
	 * Takes parameters integer array arrayToSort and integer numVals, 
	 * indicating the number of values to sort in the array.
	 * Uses the bubble method to sort the array.
	 */
	public static void sortArray(int[] arrayToSort, int numVals) {
		int tempVal;
		
		for (int i = 0; i < numVals - 1; ++i) {
			for (int j = 0; j < numVals - 1; ++j) {
				if (arrayToSort[j] < arrayToSort[j + 1]) {
					tempVal = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j + 1];
					arrayToSort[j + 1] = tempVal;
				}
			}
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numVals;
		int[] userArray = new int[20];
		int i;
		
		numVals = scnr.nextInt();
		
		for (i = 0; i < numVals; ++i) {
			userArray[i] = scnr.nextInt();
		}
		
		sortArray(userArray, numVals);
		
		for (i = 0; i < numVals; ++i) {
			System.out.print(userArray[i] + ",");
		}
		
		System.out.println();

	}

}
