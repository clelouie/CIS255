/*
 * Name: Coco Louie
 * Date: 07/16/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.8: LAB: Min, max, median (generic methods)
 * 
 * Stores 3 array lists of length 5 of integer, double, and string type.
 * Determines and outputs min, median, and max. 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {

   // Takes Scanner parameter, 5 Integers from input and returns the Integers in an ArrayList
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   
	   list.add(scnr.nextInt());
	   list.add(scnr.nextInt());
	   list.add(scnr.nextInt());
	   list.add(scnr.nextInt());
	   list.add(scnr.nextInt());
	   
	   return list;
   }

   
   
   
   
   
   // Takes Scanner parameter, 5 Doubles from input and returns the Doubles in an ArrayList
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
	   ArrayList<Double> list = new ArrayList<Double>();
	   
	   list.add(scnr.nextDouble());
	   list.add(scnr.nextDouble());
	   list.add(scnr.nextDouble());
	   list.add(scnr.nextDouble());
	   list.add(scnr.nextDouble());
	   
	   return list;
   }

   
   
   
   
   
   // Takes Scanner parameter, 5 Strings from input and returns the Strings in an ArrayList
   public static ArrayList<String> inputWords(Scanner scnr) {
	   ArrayList<String> list = new ArrayList<String>();
	   
	   list.add(scnr.next());
	   list.add(scnr.next());
	   list.add(scnr.next());
	   list.add(scnr.next());
	   list.add(scnr.next());
	   
	   return list;
   }

   
   
   
   
   
   // Takes ArrayList<TheType> parameter, prints out elements of list.
   public static <TheType extends Comparable<TheType>>
      void print(ArrayList<TheType> list) {
      for (int i = 0; i < list.size(); ++i) {
    	  System.out.print(list.get(i) + " ");
      }
      System.out.println();
   }

   
   
   
   
   
   // Takes ArrayList<TheType> as parameter, returns min, median, and max in a new ArrayList
   // To find median, first sorts the list provided.
   public static <TheType extends Comparable<TheType>>
      ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
	   
      ArrayList<TheType> stats = new ArrayList<TheType>();
      TheType min, median, max;
      
      Collections.sort(list);

      median = list.get(list.size()/2);
      min = list.get(0);
      max = list.get(0);
      
      for (int i = 0; i < list.size(); ++i) {
    	  if (list.get(i).compareTo(min) < 0) {
    		  min = list.get(i);
    	  }
    	  if (list.get(i).compareTo(max) > 0) {
    		  max = list.get(i);
    	  }
      }

      stats.add(min);
      stats.add(median);
      stats.add(max);
      
      return stats;
   }

   
   
   
   
   
   // Calls inputIntegers and assigns to new array list, prints elements of list
   // Calls getStatistics, outputs list statistics
   // Repeats for types Double and String
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();

      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
