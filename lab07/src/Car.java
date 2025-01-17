/*
 * Name: Coco Louie
 * Date: 07/02/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * Lab 7.24: Car value (classes)
 * 
 * Class with methods to set and get a car's modelYear and purchasePrice,
 * calculate the current value, 
 * and output the car's information. 
 */

public class Car {
   private int modelYear; 
   private int purchasePrice;

   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   
   
   
   
   

   // Takes integer parameter userPrice, sets field purchasePrice to userPrice.
   public void setPurchasePrice(int userPrice) {
	   purchasePrice = userPrice;
   }
   
   
   
   
   
   
   // Returns integer field purchasePrice
   public int getPurchasePrice() {
	   return purchasePrice;
   }
   
   
   
   
   
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   
   
   
   
   
   // Outputs modelYear, purchasePrice, and currentValue
   public void printInfo() {
	   System.out.println("Car's information:");
	   System.out.println("  Model year: " + modelYear);
	   System.out.println("  Purchase price: $" + purchasePrice);
	   System.out.println("  Current value: $" + currentValue);
   }
   
}