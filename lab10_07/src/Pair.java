/*
 * Name: Coco Louie
 * Date: 07/16/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.7: LAB: Pairs (generic classes)
 * 
 * Stores pair of values of generic type.
 * Compares pairs of values.
 */

public class Pair <TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   // Constructor method sets firstVal to generic parameter aVal and secondVal to bVal
   public Pair(TheType aVal, TheType bVal) {
	   firstVal = aVal;
	   secondVal = bVal;
   }

   
   
   
   
   
   // Returns firstVal and secondVal as a string
   public String toString() {
      return "[" + firstVal + ", " + secondVal + "]";
   }

   
   
   
   
   
   // Compares current pair to otherPair, with firstVal taking precedence
   // Outputs -1 if pair is less than otherPair, 1 if greater than
   // Outputs 0 if they are equal
   public int compareTo(Pair<TheType> otherPair) {
	   if (firstVal.compareTo(otherPair.firstVal) < 0) {
		   return -1;
	   }
	   else if (firstVal.compareTo(otherPair.firstVal) > 0) {
		   return 1;
	   }
	   else {
		   if (secondVal.compareTo(otherPair.secondVal) < 0) {
			   return -1;
		   }
		   else if (secondVal.compareTo(otherPair.secondVal) > 0) {
			   return 1;
		   }
		   else { return 0; }
	   }
   }

   
   
   
   
   
   // Return '<', '=', or '>' according to the return value of compareTo
   public char comparisonSymbol(Pair<TheType> otherPair) {
      if (this.compareTo(otherPair) == -1) {
    	  return '<';
      }
      else if (this.compareTo(otherPair) == 1) {
    	  return '>';
      }
      else {
    	  return '=';
      }
   }

}
