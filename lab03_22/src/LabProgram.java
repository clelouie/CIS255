/* 
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.22 LAB: Smallest number

Program to identify the smallest number of 3 user inputs: num1, num2, num3.
Compares num1 to num2 and num3, then num2 to num1 and num3, 
then num3 to num1 and num1 to find the smallest input.
Outputs the smallest input.
*/ 

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
	
		int num1;
		int num2;
		int num3;
			
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
			
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1);
		}
		else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2);
		}
		else if (num3 <= num1 && num3 <= num2) {
			System.out.println(num3);
		}
	}
}
