/*
 * Name: Coco Louie
 * Date: 07/02/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 7.23: Triangle area comparison (classes)
 * 
 * Reads base and height for 2 triangles from input.
 * Sets base and height using setBase() and setHeight() from Triangle.java
 * Determines smallest area via getArea()
 * Outputs the base, height, and area of the triangle with the smallest area using printInfo()
 */

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());      
      
      System.out.println("Triangle with smaller area:");
      
      if (triangle1.getArea() < triangle2.getArea()) {
    	  triangle1.printInfo();
      }
      else {
    	  triangle2.printInfo();
      }
      
   }
}
