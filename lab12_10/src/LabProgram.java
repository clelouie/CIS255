/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.10 LAB: Parsing food data
 * 
 * Reads food information from a tsv with each line containing the
 * category, name, description, and availability of a food item
 * Stores each piece of information in a separate array
 * Outputs food information for all available food in the format:
 * name (category) -- description
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      
      String fileName = scnr.next();
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      inFS.useDelimiter("\t|\\n");
      
      String[] categories = new String[50];
      String [] names = new String[50];
      String [] descriptions = new String[50];
      String [] availability = new String[50];
      
      int index = 0;
      
      while (inFS.hasNext()) {
    	  categories[index] = inFS.next();
    	  names[index] = inFS.next();
    	  descriptions[index] = inFS.next();
    	  availability[index] = inFS.next();
    	  
    	  ++index;
      }
      
      for (int i = 0; i < index; ++i) {
    	  if (availability[i].equals("Available")) {
    		  System.out.print(names[i]);
    		  System.out.print(" (" + categories[i] + ") ");
    		  System.out.println("-- " + descriptions[i]);
    	  }
      }
      
      inFS.close();
   }
}
