/*
 * Name: Coco Louie
 * Date: 07/16/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.7: LAB: Pairs (generic classes)
 * 
 * Stores two pairs each of input of integer, double, and string type in generic class Pair.
 * Compares each pair of data type and outputs results. 
 */

import java.util.Scanner;

public class LabProgram {
	
	// Takes Scanner object as a parameter, returns new Pair object with two integers from input.
   public static Pair<Integer> readIntegerPair(Scanner scnr) {
	   return new Pair<Integer>(scnr.nextInt(), scnr.nextInt());
   }

   
   
   
   
   
	// Takes Scanner object as a parameter, returns new Pair object with two doubles from input.
   public static Pair<Double> readDoublePair(Scanner scnr) {
	   return new Pair<Double>(scnr.nextDouble(), scnr.nextDouble());
   }

   
   
   
   
   
	// Takes Scanner object as a parameter, returns new Pair object with two strings from input.
   public static Pair<String> readWordPair(Scanner scnr) {
	   return new Pair<String>(scnr.next(), scnr.next());
   }

   
   
   
   
   
   // Calls Pair<Integer>, <Double> and <String> twice each.
   // Compares each data type pair and outputs the result. 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Pair<Double> doublePair1 = readDoublePair(scnr);
      Pair<Double> doublePair2 = readDoublePair(scnr);

      Pair<String> wordPair1 = readWordPair(scnr);
      Pair<String> wordPair2 = readWordPair(scnr);

      System.out.print(integerPair1.toString());
      System.out.print(" " + integerPair1.comparisonSymbol(integerPair2) + " ");
      System.out.println(integerPair2.toString());
      
      System.out.print(doublePair1.toString());
      System.out.print(" " + doublePair1.comparisonSymbol(doublePair2) + " ");
      System.out.println(doublePair2.toString());
      
      System.out.print(wordPair1.toString());
      System.out.print(" " + wordPair1.comparisonSymbol(wordPair2) + " ");
      System.out.println(wordPair2.toString());
   }
}
