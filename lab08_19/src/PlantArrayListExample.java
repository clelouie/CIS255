/*
 * Name: Coco Louie
 * Date: 07/12/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.19 LAB: Plant information (ArrayList)
 * 
 * Creates plant/flower objects based on user input and outputs the stored information.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // Outputs ArrayList of plant (or flower) objects using plant/flower printInfo methods
   public static void printArrayList(ArrayList<Plant> myGarden) {
	   for (int i = 0; i < myGarden.size(); ++i) {
		   System.out.println("Plant " + (i+1) + " Information: ");
		   myGarden.get(i).printInfo();
		   System.out.println();
	      }
   }
   
   
   
   
   
   
   // Takes user inputs for plant/flower fields and stores as plant/flower objects, 
   // depending on the user specified type.
   // Calls printArrayList method to output plant/flower information
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;

      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      String plantName;
      String plantCost;
      String flowerName;
      String flowerCost;
      Boolean isAnnual;
      String colorOfFlowers;
      
      input = scnr.next();
      while(!input.equals("-1")){
    	  if (input.equals("plant")) {
    		  Plant myPlant = new Plant();
    		  
    		  plantName = scnr.next();
    		  plantCost = scnr.next();
    		  
    		  myPlant.setPlantName(plantName);
    		  myPlant.setPlantCost(plantCost);
    		  
    		  myGarden.add(myPlant);
    	  }
    	  else {
    		  Flower myFlower = new Flower();
    		  
    		  flowerName = scnr.next();
    		  flowerCost = scnr.next();
    		  isAnnual = scnr.nextBoolean();
    		  colorOfFlowers = scnr.next();
    		  
    		  myFlower.setPlantName(flowerName);
    		  myFlower.setPlantCost(flowerCost);
    		  myFlower.setPlantType(isAnnual);
    		  myFlower.setColorOfFlowers(colorOfFlowers);
    		  
    		  myGarden.add(myFlower);
    	  }
      
         input = scnr.next();
      }
      
      printArrayList(myGarden);
      
   }
}
