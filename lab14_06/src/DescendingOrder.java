/*
 * Name: Coco Louie
 * Date: 07/27/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 14.6 LAB: Descending selection sort with output during execution
 * 
 * Reads up to 10 integers from input and stores in an array.
 * Sort inputs into descending order, and outputs each iteration of the sorting algorithm.
 */

import java.util.Scanner;

public class DescendingOrder {

	// Takes integer array (numbers) and number of elements in the array (numElements) as arguments.
	// Sorts array into descending order using selection sort.
	// Outputs the array after each iteration of the outer loop.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	   
	   int indexLargest, temp;
	   int i, j, g;
	   
	   for (i = 0; i < numElements - 1; ++i) {
		   indexLargest = i;
		   for (j = i + 1; j < numElements; ++j) {
			   if (numbers[j] > numbers[indexLargest]) {
				   indexLargest = j;
			   }
		   }
		   
		   temp = numbers[i];
		   numbers[i] = numbers[indexLargest];
		   numbers[indexLargest] = temp;
		   
		   for (g = 0; g < numElements; ++g) {
			   System.out.print(numbers[g] + " ");
		   }
		   
		   System.out.println();
	   }
   }
   
   
   
   
   
   
   // Reads in a list of up to 10 positive integers and stores in numbers.
   // Stops when -1 is read.
   // Then calls selectionSortDescendTrace() method.
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      input = scnr.nextInt();
      
      while (input != -1) {
    	  numbers[numElements] = input;
    	  ++numElements;
    	  input = scnr.nextInt();
      }
      
      selectionSortDescendTrace(numbers, numElements);
   }
}

