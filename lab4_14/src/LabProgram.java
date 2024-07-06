/*
 * Name: Coco Louie
 * Date: 06/22/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 4.14: Varied amount of input data
 * 
 * Given any number of non-negative integer inputs,
 * calculate and output maximum value and average (to the tenths place).
 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int inputVal;
		int maxVal;
		double sum = 0;
		double count = 0;
		double average;
		
		inputVal = scnr.nextInt();
		maxVal = inputVal;
		
		while (inputVal >= 0) {
			if (inputVal > maxVal) {
				maxVal = inputVal;
			}
			sum += inputVal;
			count += 1;
			inputVal = scnr.nextInt();
		}
		
		average = sum / count;
		System.out.print(maxVal + " ");
		System.out.printf("%.2f\n", average);

	}

}
