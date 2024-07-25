/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.8.1: LAB: Movie show time display
 * 
 * Reads movie information from a csv file.
 * Outputs movie information in a table. Each row contains:
 * the title, rating, and all showtimes of a unique movie.
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
      
      String fileName = scnr.next();
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      inFS.useDelimiter(",|\\n");

      String movieName = "";
      String showtimes = "";
      String movieRating = ""; 
      String currMovie, currRating, currShowtime;

      
      while (inFS.hasNext()) {
    	  
    	  currShowtime = inFS.next();
    	  currMovie = inFS.next();
    	  currRating = inFS.next();
    	     	  
    	  if (currMovie.equals(movieName)) {
    		  showtimes = showtimes + " " + currShowtime;
    	  }
    	  else if (movieName == "") {
    		  movieName = currMovie;
    		  movieRating = currRating;
    		  showtimes = currShowtime;
    	  }
    	  else {
    		  System.out.printf("%-44.44s | %5s | %s\n", movieName, movieRating, showtimes);
    		  
    		  movieName = currMovie;
    		  movieRating = currRating;
    		  showtimes = currShowtime;
    	  }
      }
      
	  System.out.printf("%-44.44s | %5s | %s\n", movieName, movieRating, showtimes);

      inFS.close();

   }
}
