/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.9 LAB: Parsing dates
 * 
 * Reads dates from input.
 * If date follows format "month day, year" outputs with format "month-day-year"
 * Otherwise, outputs nothing.
 */

import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int month;
      String day;
      int year;
      
      String input = scnr.next();
      
      while (!input.equals("-1")) {
    	  if (getMonthAsInt(input) != 0) {
    		  month = getMonthAsInt(input);
    		  day = scnr.next();
    		  year = scnr.nextInt();
    		      		  
    		  if (day.charAt(day.length() - 1) == ',') {
    			  String format = "%." + (day.length()-1) + "s";
    			  System.out.print(month + "-");
    			  System.out.printf(format, day);
        		  System.out.println("-" + year);
    		  }
    	  }
    	  input = scnr.next();
      }
     
   }
}
