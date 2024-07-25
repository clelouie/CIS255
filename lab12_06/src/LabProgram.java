/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.6 LAB: File name change
 * 
 * Reads files names from a txt file.
 * Outputs file names with "_photo.jpg" replaced with "_info.jpg"
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      
      String readFile;
      int charCount;
      
      String fileName = scnr.next();
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      
      while (inFS.hasNext()) {
    	  charCount = 0;
    	  readFile = inFS.next();
    	  
    	  for (int i = 0; i < readFile.length(); i++) {
    		  if (readFile.charAt(i) != '_') {
    			  charCount += 1;
    		  }
    		  else {
    			  i = 300;
    		  }
    	  }
    	  
    	  String format = "%." + charCount + "s";
    	  System.out.printf(format, readFile);
    	  System.out.println("_info.txt");
    	  
      }
      
      inFS.close();
   }
}
