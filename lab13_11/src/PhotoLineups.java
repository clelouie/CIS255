/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.11 LAB: All permutations of names
 * 
 * Reads a list of names from input.
 * Outputs all possible permutations of the list of names.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

	/* 
	 * Determines and outputs all possible permutation of parameter input nameList.
	 * Stores in parameter permList and outputs.
	 */
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
	   
	   ArrayList<String> copyNameList;
	   String currName;
	   
	   if (nameList.size() == 0) {
		   for (int i = 0; i < permList.size(); ++i) {
			   
			   if (i != permList.size() - 1) {
			   System.out.print(permList.get(i) + ", ");
			   }
			   else {
				   System.out.print(permList.get(i));
			   }
		   }
		   System.out.println();
	   }
	   else {
		   for (int i = 0; i < nameList.size(); ++i) {
			   copyNameList = new ArrayList<String>(nameList);
			   currName = copyNameList.remove(i);
			   permList.add(currName);
			   
			   printAllPermutations(permList, copyNameList);
			   
			   permList.remove(permList.size()-1);
		   }
	   }
   }

   
   
   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      name =  scnr.next();
      while (!name.equals("-1")) {
    	  nameList.add(name);
    	  name = scnr.next();
      }
      
      printAllPermutations(permList, nameList);
   }
}
