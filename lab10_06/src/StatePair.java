/*
 * Name: Coco Louie
 * Date: 07/16/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.6: LAB: Zip code and population (generic types)
 * 
 * Generic class to store information pairs about a state.
 */

public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
   private Type1 value1;
   private Type2 value2;
   
   // Constructor, takes generic type parameters
   public StatePair(Type1 newValue1, Type2 newValue2) {
	   value1 = newValue1;
	   value2 = newValue2;
   }
   
   
   
   
   
   
   // Sets value1 to generic parameter newValue1
   public void setValue1(Type1 newValue1) {
	   value1 = newValue1;
   }
   
   
   
   
   
   
   // Sets value2 to generic parameter newValue2
   public void setValue2(Type2 newValue2) {
	   value2 = newValue2;
   }
   
   
   
   
   
   
   // Returns value1
   public Type1 getValue1() {
	   return value1;
   }
   
   
   
   
   
   
   // Returns value2
   public Type2 getValue2() {
	   return value2;
   }
   
   
   
   
   
   
   // Outputs value 1 and value 2
   public void printInfo() {
	   System.out.println(value1 + ": " + value2);
   }
}