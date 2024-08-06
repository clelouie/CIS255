/*
 * Name: Coco Louie
 * Date: 07/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 14.8.1: LAB: Binary search
 * 
 * Reads size of an integer ArrayList, followed by the elements.
 * Reads target value to search for.
 * Locates target value via binary search.
 * Outputs index of target (-1 if not found), and
 * recursions and comparisons executed during the search. 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
	
	public static int recursions;
	public static int comparisons;
	
   // Read and return an ArrayList of integers.
   private static ArrayList<Integer> readNums(Scanner scnr) {
      int size = scnr.nextInt();                // Read size of ArrayList
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {          // Read the numbers
         nums.add(scnr.nextInt());
      }
      return nums;
   }

   
   
   
   
   
   // Searches an ArrayList of integers for target element using binary search.
   // Returns target element index when found.
   // If all elements are searched without locating the target, returns -1.
   static public int binarySearch(int target, ArrayList<Integer> integers,
                                    int lower, int upper) {
	   ++recursions;
	   ++comparisons;
       int midIndex = (lower + upper) / 2;
      
	   if (target == integers.get(midIndex)) {
		   return midIndex;
	   }
	   else if (lower == upper) {
		   return -1;
	   }
	   else {
		   if (integers.get(midIndex) < target) {
			   ++comparisons;
			   return binarySearch(target, integers, midIndex + 1, upper);
		   }
		   else {
			   ++comparisons;
			   return binarySearch(target, integers, lower, midIndex - 1);
		   }
	   }
   }

   
   
   
   
   
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Input a list of integers
      ArrayList<Integer> integers = readNums(scnr);

      // Input a target value for the search
      int target = scnr.nextInt();

      int index = binarySearch(target, integers, 0, integers.size() - 1);

      System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                        index, recursions, comparisons);
   }
}
