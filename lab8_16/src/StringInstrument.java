/*
 * Name: Coco Louie
 * Date: 07/12/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.16 LAB: Instrument information (derived classes)
 * 
 * Derived from Instrument class.
 * Stores string information specific details:
 * number of strings, number of frets, if it is bowed.
 */

public class StringInstrument extends Instrument {
   // TODO: Declare private fields
	private int numStrings;
	private int numFrets;
	private boolean bowed;

	// Takes integer parameter userNumStrings, sets numStrings to userNumStrings
	public void setNumOfStrings(int userNumStrings) {
		numStrings = userNumStrings;
	}
	
	
	
	
	
	
	// Takes integer parameter userNumFrets, sets numFrets to userNumFrets
	public void setNumOfFrets(int userNumFrets) {
		numFrets = userNumFrets;
	}
	
	
	
	
	
	
	// Takes boolean parameter isBowed, sets bowed to true if isBowed is true, false otherwise
	public void setIsBowed (boolean isBowed) {
		if (isBowed) {
			bowed = true;
		}
		else {
			bowed = false;
		}
	}

	
	
	
	

   // Returns integer numStrings
	public int getNumOfStrings () {
		return numStrings;
	}
	
	
	
	
	
	
	// Returns integer numFrets
	public int getNumOfFrets() {
		return numFrets;
	}
	
	
	
	
	
	
	// Returns boolean bowed
	public boolean getIsBowed() {
		return bowed;
	}

}

