/*
 * Name: Coco Louie
 * Date: 06/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 6.27: Flip a coin
 * 
 * Reads integer numFlips from input, 
 * indicating the number of coin flips to perform.
 * Calls method coinFlip numFlips times and outputs results.
 */

import java.util.Scanner;
import java.util.Random;

public class LabProgram {
	/*
	 * Method to flip a coin based on a random number.
	 * Takes Random parameter rand and outputs String coinSide.
	 * If rand generates 1, coinSide is Heads. Otherwise, coinSide is tails.
	 */
	public static String coinFlip(Random rand) {
		int flip = rand.nextInt(2);
		String coinSide;
		
		if (flip == 1) {
			coinSide = "Heads";
		}
		else {
			coinSide = "Tails";
		}
		
		return coinSide;
	}
	   
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    Random rand = new Random(2); // Unique seed
	    int numFlips = scnr.nextInt();
	      
	    for (int i = 0; i < numFlips; ++i) {
	    	System.out.println(coinFlip(rand));
	    }
	}
}
