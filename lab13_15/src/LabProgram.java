/*
 * Name: Coco Louie
 * Date: 07/25/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 13.15 LAB: Output a linked list
 * 
 * Reads integers from input to create a linked list.
 * Calls printLinkedList to output the contents of the list.
 */

import java.util.Scanner;

public class LabProgram {
   
    // Recursive method to print a linked list.
	// Takes the list headNode as a parameter,
	// then calls printLinkedList until the end of the list is reached
	public static void printLinkedList(IntNode headNode) {
		if (headNode.getNext() == null) {
			headNode.printData();
		}
		else {
			headNode.printData();
			printLinkedList(headNode.getNext());
		}
		
	}
   
	
	
	
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;
      int value;
      
      size = scnr.nextInt();
      value = scnr.nextInt();
      IntNode headNode = new IntNode(value); // Make head node as the first node
      IntNode lastNode = headNode;      // Node to add after
      IntNode newNode = null;           // Node to create
      
      // Insert the second and the rest of the nodes
      for (int n = 0; n < size - 1; ++n) {
         value = scnr.nextInt();
         newNode = new IntNode(value);
         lastNode.insertAfter(newNode);
         lastNode = newNode;
      }
      
      // Call printLinkedList() with the head node
      printLinkedList(headNode);
   }
}
