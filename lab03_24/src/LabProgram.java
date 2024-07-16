/*
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.24 LAB: Exact change
Program to determine the number of dollars, quarters, dimes, nickels, and pennies
in inputted numPennies.
Counts number of each change type and deducts from total pennies.
Outputs count of each change type.
 */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		int numPennies;
        int numDollars;
        int numQuarters;
        int numDimes;
        int numNickels;
        
        numPennies = scnr.nextInt();

        if (numPennies == 0) {
            System.out.println("No change");
        }
        else {
            numDollars = numPennies / 100;
            numPennies = numPennies - numDollars * 100;

            numQuarters = numPennies / 25;
            numPennies = numPennies - numQuarters * 25;

            numDimes = numPennies / 10;
            numPennies = numPennies - numDimes * 10;

            numNickels = numPennies / 5;
            numPennies = numPennies - numNickels * 5;

            if (numDollars != 0) {
                if (numDollars == 1) {
                    System.out.println("1 Dollar");
                }
                else {
                    System.out.println(numDollars + " Dollars");
                }
            }
            if (numQuarters != 0) {
                if (numQuarters == 1) {
                    System.out.println("1 Quarter");
                }
                else {
                    System.out.println(numQuarters + " Quarters");
                }
            }
            if (numDimes != 0) {
                if (numDimes == 1) {
                    System.out.println("1 Dime");
                }
                else {
                    System.out.println(numDimes + " Dimes");
                }
            }
            if (numNickels != 0) {
                if (numNickels == 1) {
                    System.out.println("1 Nickel");
                }
                else {
                    System.out.println(numNickels + " Nickels");
                }
            }
            if (numPennies != 0) {
                if (numPennies == 1) {
                    System.out.println("1 Penny");
                }
                else {
                    System.out.println(numPennies + " Pennies");
                }
            }
        }
	}
}