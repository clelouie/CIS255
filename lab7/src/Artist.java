/*
 * Name: Coco Louie
 * Date: 07/05/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 7.26 LAB: Artwork label (classes/constructors)
 * 
 * Stores name, birth, and death years of an artist.
 * Outputs artist information.
 */

public class Artist {
	private String artistName;
	private int birthYear;
	private int deathYear;

   // Default constructor to initialize fields artistName, birthYear, deathYear to default values
	public Artist() {
		artistName = "unknown";
		birthYear = -1;
		deathYear = -1;
	}
	
	
	
	
	

    // Second constructor to initialize private fields artistName, birthYear, deathYear
	// from parameters userArtistName, userBirthYear, userDeathYear, respectively
	public Artist(String userArtistName, int userBirthYear, int userDeathYear) {
		artistName = userArtistName;
		birthYear = userBirthYear;
		deathYear = userDeathYear;
	}

	
	
	
		
   
   // Returns private field artistName
	public String getName() {
		return artistName;
	}
	
	
	
	
	
	
	// Returns private field birthYear
	public int getBirthYear() {
		return birthYear;
	}
	
	
	
	
	
	
	// Returns private field deathYear
	public int getDeathYear() {
		return deathYear;
	}

	
	
	
	
	
    // Outputs artist name name birth to death years
	// If birth year is unknown (-1), outputs unknown
	// If death year is unknown (-1), outputs birth year to present
	public void printInfo() {
		System.out.print("Artist: ");
		System.out.print(artistName);
		System.out.print(" (");
		if (birthYear < 0) {
			System.out.print("unknown");
		}
		else if (deathYear < 0) {
			System.out.print(birthYear + " to present");
		}
		else {
			System.out.print(birthYear + " to " + deathYear);
		}
		System.out.println(")");
				
	}

}