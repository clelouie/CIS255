/*
 * Name: Coco Louie
 * Date: 07/05/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 7.28 LAB: Vending machine
 * 
 * Takes user integer inputs for the number of bottles bought (bottlesBought) from a vending machine
 * and the number of bottles to restock (bottlesRestock)
 * Calls purchase and restock methods to update vending machine inventory, reports inventory
 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      VendingMachine vendingMachine = new VendingMachine();
      
      int bottlesBought = scnr.nextInt();
      int bottlesRestock = scnr.nextInt();
      
      vendingMachine.purchase(bottlesBought);
      vendingMachine.restock(bottlesRestock);
      
      vendingMachine.report();
            
   }
}
