/*
 * Name: Coco Louie
 * Date: 07/19/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 12.7 LAB: Course Grade
 * 
 * Reads student information from a tsv file.
 * Calculates course grade for each student and class wide exam averages.
 * Outputs all student information and new information to report.txt.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      FileOutputStream fileStream = null;
      PrintWriter outFS = null;
      
      String currFirstName;
      String currLastName;
      int midterm1;
      int midterm2;
      int finalExam;
      
      int studentAvg;
      double midterm1AvgCalc = 0;
      double midterm2AvgCalc = 0;
      double finalExamAvgCalc = 0;
      double count = 0;
      
      String fileName = scnr.next();
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      fileStream = new FileOutputStream("report.txt");
      outFS = new PrintWriter(fileStream);
            
      while (inFS.hasNext()) {
    	  currFirstName = inFS.next();
          currLastName = inFS.next();
          midterm1 = inFS.nextInt();
          midterm2 = inFS.nextInt();
          finalExam = inFS.nextInt();
          
          studentAvg = (midterm1 + midterm2 + finalExam) / 3;
          midterm1AvgCalc += midterm1;
          midterm2AvgCalc += midterm2;
          finalExamAvgCalc += finalExam;
          
          outFS.print(currFirstName + "\t");
          outFS.print(currLastName + "\t");
          outFS.print(midterm1 + "\t");
          outFS.print(midterm2 + "\t");
          outFS.print(finalExam + "\t");
          
          if (studentAvg >= 90) {
        	  outFS.print("A");
          }
          else if (studentAvg >= 80) {
        	  outFS.print("B");
          }
          else if (studentAvg >= 70) {
        	  outFS.print("C");
          }
          else if (studentAvg >= 60) {
        	  outFS.print("D");
          }
          else {
        	  outFS.print("F");
          }
          
          outFS.println();
          
          ++count;
      }
      
      midterm1AvgCalc = midterm1AvgCalc / count;
      midterm2AvgCalc = midterm2AvgCalc / count;
      finalExamAvgCalc = finalExamAvgCalc / count;
      
      outFS.println();
      outFS.print("Averages: Midterm1 " + String.format("%.2f", midterm1AvgCalc));
      outFS.print(", Midterm2 " + String.format("%.2f", midterm2AvgCalc));
      outFS.print(", Final " + String.format("%.2f", finalExamAvgCalc));
      outFS.println();
      
      inFS.close();
      outFS.close();
   }
}