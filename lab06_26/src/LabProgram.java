/*
 * Name: Coco Louie
 * Date: 06/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 6.26: Swapping variables
 * 
 * Reads an array of 4 integers from input.
 * Passes array through method swapValues, 
 * which swaps the values of index 0 with 1, and 2 with 3.
 * Outputs new swapped array.
 */

import java.util.Scanner;

public class LabProgram {
	
	/* 
	 * Method to swap array values.
	 * Takes one integer array parameter, arrayToSwap. Returns nothing.
	 * Uses tempVal to store array values 
	 * and swap the values of index 0 with 1, and 2 with 3.
	 */
	public static void swapValues(int[] arrayToSwap) {
		int tempVal;
		
		tempVal = arrayToSwap[0];
		arrayToSwap[0] = arrayToSwap[1];
		arrayToSwap[1] = tempVal;
		
		tempVal = arrayToSwap[2];
		arrayToSwap[2] = arrayToSwap[3];
		arrayToSwap[3] = tempVal;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] arrayToSwap = new int[4];
		int i;
		
		for (i = 0; i < arrayToSwap.length; ++i) {
			arrayToSwap[i] = scnr.nextInt();
		}
		
		swapValues(arrayToSwap);
		
		for (i = 0; i < arrayToSwap.length; ++i) {
			System.out.print(arrayToSwap[i]);
			if (i < arrayToSwap.length - 1) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}

}
