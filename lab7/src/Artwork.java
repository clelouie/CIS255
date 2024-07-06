/*
 * Name: Coco Louie
 * Date: 07/05/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 7.26 LAB: Artwork label (classes/constructors)
 * 
 * Stores title, creation year, and artist of an artwork.
 * Outputs artist and artwork information.
 */

public class Artwork {
	private String title;
	private int yearCreated;
	private Artist artist;

   // Default constructor to initialize fields title and yearCreated to default values
	public Artwork() {
		title = "unknown";
		yearCreated = -1;
	}
   
	
	
	
	
	
   // Returns title
	public String getTitle() {
		return title;
	}
	
	
	
	
	
	
	// Returns yearCreated
	public int getYearCreated() {
		return yearCreated;
	}
	
	
	
	
	

    // Second constructor to initialize private fields title, yearCreated, artist
 	// from parameters userTitle, userYearCreated, userArtist, respectively
	public Artwork(String userTitle, int userYearCreated, Artist userArtist) {
		title = userTitle;
		yearCreated = userYearCreated;
		artist = userArtist;


	}
	
	
	
	
	

	// Outputs an artists information by calling the artist printInfo() method
	// and then outputting the artwork information
	public void printInfo() {
		artist.printInfo();
		System.out.print("Title: ");
		System.out.println(title + ", " + yearCreated);
	}

}
