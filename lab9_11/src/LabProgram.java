/*
 * Name: Coco Louie
 * Date: 07/15/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 9.11 LAB: Student info not found
 * 
 * Searches a roster file for a student name/ID, outputs associated ID/name.
 * If name/ID is not found, outputs exception message.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   
	// Takes parameters studentName and infoScnr
	// Reads file and returns Student ID associated with studentName.
	// If studentName is not found, throws exception.
   public static String findID(String studentName, Scanner infoScnr) throws Exception {
      String currentInput;
      boolean nameFound = false;
      String nameID = "na";
      
      currentInput = infoScnr.next();
      
      while (infoScnr.hasNext()) {
	      if (currentInput.equals(studentName)) {
	    	  nameFound = true;
	    	  nameID = infoScnr.next();
	    	  currentInput = infoScnr.next();
	      }
	      else {
	    	  currentInput = infoScnr.next();
	      }
      }
      
      if (!nameFound) {
    	  throw new Exception("Student ID not found for " + studentName);
      }
      
	  return nameID;
   }
   
   
   
   
   
   
	// Takes parameters studentID and infoScnr
	// Reads file and returns student name associated with studentID.
	// If studentID is not found, throws exception.
   public static String findName(String studentID, Scanner infoScnr) throws Exception {
      String currentInput;
      String previousInput;
      boolean IDFound = false;
      String IDName = "na";
      
      previousInput = infoScnr.next();
      currentInput = infoScnr.next();
      
      while (infoScnr.hasNext()) {
    	  if (currentInput.equals(studentID)) {
    		  IDFound = true;
    		  IDName = previousInput;
    		  currentInput = infoScnr.next();
    	  }
    	  else {
    		  previousInput = currentInput;
    		  currentInput = infoScnr.next();
    	  }
      }
      
      if (!IDFound) {
    	  throw new Exception("Student name not found for " + studentID);
      }
      
      return IDName;
      
   }
   
   
   
   
   
   
   // Reads file, search type, and student name/ID from input
   // Calls findID or findName methods and outputs name or ID
   // Outputs exception message if exception is thrown. 
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String studentID;
      String studentInfoFileName;
      FileInputStream studentInfoStream = null;
      Scanner studentInfoScanner = null;
      
      // Read the text file name from user
      studentInfoFileName = scnr.next();

      // Open the text file
      studentInfoStream = new FileInputStream(studentInfoFileName);
      studentInfoScanner = new Scanner(studentInfoStream);
      
      // Read search option from user. 0: findID(), 1: findName()
      int userChoice = scnr.nextInt();

      try {
    	  if (userChoice == 0) {
    		  studentName = scnr.next();
    		  studentID = findID(studentName, studentInfoScanner);
    		  System.out.println(studentID);
    	  }
    	  else {
    		  studentID = scnr.next();
    		  studentName = findName(studentID, studentInfoScanner);
    		  System.out.println(studentName);
    	  }
      }
      catch (Exception excpt) {
    	  System.out.println(excpt.getMessage());
      }

      studentInfoStream.close();
   }
}
