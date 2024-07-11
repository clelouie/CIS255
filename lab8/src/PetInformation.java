/*
 * Name: Coco Louie
 * Date: 07/09/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.15 LAB: Pet information (derived classes)
 * 
 * Create pet and cat objects with user inputs for name, age, and cat breed.
 * Output pet information.
 */

import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      myPet.setName(petName);
      myPet.setAge(petAge);
      
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.setBreed(catBreed);
      
      myPet.printInfo();
      myCat.printInfo();
      System.out.println("   Breed: " + myCat.getBreed());
      
   }
}