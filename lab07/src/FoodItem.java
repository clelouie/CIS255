/*
 * Name: Coco Louie
 * Date: 07/05/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 7.27 LAB: Nutritional information (classes/constructors)
 * 
 * Stores fat, carb, protein information for a food item.
 * (Given) Calculates calories, outputs nutritional information.
 */

public class FoodItem {
   private String name;
   private double fat;
   private double carbs;
   private double protein;
   
   // TODO: Define default constructor
   public FoodItem() {
	   name = "Water";
	   fat = 0.0;
	   carbs = 0.0;
	   protein = 0.0;
   }
   
   
   
   
   
   
   // TODO: Define second constructor with parameters to initialize private fields (name, fat, carbs, protein)
   public FoodItem(String itemName, double amountFat, double amountCarbs, double amountProtein) {
	   name = itemName;
	   fat = amountFat;
	   carbs = amountCarbs;
	   protein = amountProtein;
   }
   
   
   
   
   
   
   public String getName() {
      return name;
   }
   
   public double getFat() {
      return fat;
   }
   
   public double getCarbs() {
      return carbs;
   }
   
   public double getProtein() {
      return protein;
   }
   
   public double getCalories(double numServings) {
      // Calorie formula
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }
   
   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}