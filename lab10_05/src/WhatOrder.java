/*
 * Name: Coco Louie
 * Date: 07/16/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.5 LAB: What order? (generic methods)
 * 
 * Given four user inputs of generic type, output order (ascending, descending, neither).
 */

import java.util.Scanner;

// Generic method takes for variables of generic type as arguments
// Checks input order, returns:
// -1 for ascending, 1 for descending, 0 for neither.
public class WhatOrder {
	
	public static <T extends Comparable<T>>
	int checkOrder(T v1, T v2, T v3, T v4) {
		if (v1.compareTo(v2) < 0 && 
				v2.compareTo(v3) < 0 &&
				v3.compareTo(v4) < 0) {
			return -1;
			}
		else if (v1.compareTo(v2) > 0 && 
				v2.compareTo(v3) > 0 &&
				v3.compareTo(v4) > 0) {
			return 1;
		}
		else { return 0; }
	}
   




	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
   }
}
