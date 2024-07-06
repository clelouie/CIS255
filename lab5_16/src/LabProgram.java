/*
 * Name: Coco Louie
 * Date: 06/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 5.16:  Adjust list by normalizing
 * 
 * Reads a list of integers from input.
 * The first integer indicates the number of values to follow.
 * Determines largest input value.
 * Outputs each input value divided by the largest value.
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numVals;
		numVals = scnr.nextInt();
		
		double[] userVals = new double[numVals];
		double maxVal;
		double yourValue;
		
		for (int i = 0; i < numVals; ++i) {
			userVals[i] = scnr.nextDouble();
		}
		
		maxVal = userVals[0];
		for (int i = 0; i < numVals; ++i) {
			if (userVals[i] > maxVal) {
				maxVal = userVals[i];
			}
		}
		
		for (int i = 0; i < numVals; ++i) {
			yourValue = userVals[i] / maxVal;
			System.out.printf("%.2f", yourValue);
			System.out.print(" ");
		}
		
		System.out.println();

	}

}
