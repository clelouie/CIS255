/*
 * Name: Coco Louie
 * Date: 07/28/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 14.7 LAB: Insertion sort
 * 
 * Reads size of an integer array, followed by the elements.
 * Outputs array.
 * Sorts array via insertion sort, outputting array at each iteration and counting comparisons + swaps.
 * Outputs comparisons + swaps.
 */
import java.util.Scanner;

public class LabProgram {
	
	public static int comparisons;
	public static int swaps;
	
   // Read and return an array of integers.
   // The first integer read is number of integers that follow.
   private static int[] readNums() {
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();                // Read array size
      int[] numbers = new int[size];            // Create array
      for (int i = 0; i < size; ++i) {          // Read the numbers
         numbers[i] = scnr.nextInt();
      }
      return numbers;
   }

   // Print the numbers in the array, separated by spaces
   // (No space or newline before the first number or after the last.)
   private static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.print(nums[i]);
         if (i < nums.length - 1) {
            System.out.print(" ");
         }
      }
      System.out.println();
   }

   // Exchange nums[j] and nums[k].
   private static void swap(int[] nums, int j, int k) {
      int temp = nums[j];
      nums[j] = nums[k];
      nums[k] = temp;
   }

   
   
   
   
   
   // Sort numbers using insertion sort.
   // Count comparisons and swaps. Output the array at the end of each iteration. 
   public static void insertionSort(int[] numbers) {
      int i;
      int j;

      for (i = 1; i < numbers.length; ++i) {
           j = i;
           
         // Insert numbers[i] into sorted part,
         // stopping once numbers[i] is in correct position
         while (j > 0) {
        	 ++comparisons;
        	 
        	 if (numbers[j] < numbers[j - 1]) {
        		 // Swap numbers[j] and numbers[j - 1]
        		 swap(numbers, j, j  - 1);
        		 --j;
        		 ++swaps;
        	 }
        	 else { j = 0; }
         }

         for (int g = 0; g < numbers.length; ++g) {
        	 System.out.print(numbers[g]);
        	 if (g != numbers.length - 1) {
        		 System.out.print(" ");
        	 }
         }
         System.out.println();
      }
   }

   
   
   
   
   
   // Calls readNums() to read numbers into array.
   // Calls printNums() to output array
   // Calls insertionSort() to sort numbers
   // Outputs number of comparisons and swaps performed during the sort
   public static void main(String[] args) {
      // Step 1: Read numbers into an array
      int[] numbers = readNums();

      // Step 2: Output the numbers array
      printNums(numbers);
      System.out.println();

      // Step 3: Sort the numbers array
      insertionSort(numbers);
      System.out.println();

      // Step 4: Output the number of comparisons and swaps performed
      System.out.println("comparisons: " + comparisons);
      System.out.println("swaps: " + swaps);
   }
}
