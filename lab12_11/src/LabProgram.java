/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.11 LAB: Thesaurus
 * 
 * Reads a word and character from input.
 * Opens thesaurus file corresponding to the word.
 * Outputs all words in file beginning with the input character.
 * If no words begin with the input character, outputs:
 * "No synonyms for (word) begin with (character)."
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line

      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      
      String fileWord = scnr.next();
      char startLetter = scnr.next().charAt(0);
      String currWord;
      boolean synonymFound = false;
      
      fileByteStream = new FileInputStream(fileWord + ".txt");
      inFS = new Scanner(fileByteStream);
      
      while (inFS.hasNext()) {
    	  currWord = inFS.next();
    	  if (currWord.charAt(0) == startLetter) {
    		  System.out.println(currWord);
    		  synonymFound = true;
    	  }
      }
      
      if (!synonymFound) {
    	  System.out.println("No synonyms for " + fileWord + " begin with " + startLetter + ".");

      }
      
      inFS.close();
      
   }
}
