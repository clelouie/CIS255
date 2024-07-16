/*
 * Name: Coco Louie
 * Date: 07/12/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.17 LAB: Book information (overriding member methods)
 * 
 * Derived from Book class.
 * Stores encyclopedia specific details:
 * edition, number of pages.
 */

public class Encyclopedia extends Book {
	private String edition;
	private int numPages;
  
   
   // Takes string parameter userEdition, sets edition to userEdition
	public void setEdition(String userEdition) {
		edition = userEdition;
	}
	
	
	
	
	
	
	// Takes integer parameter userNumPages, sets numPages to userNumPages
	public void setNumPages(int userNumPages) {
		numPages = userNumPages;
	}
   
	
	
	
	
  
   // Returns string edition
	public String getEdition() {
		return edition;
	}
	
	
	
	
	
	
	// Returns integer numPages
	public int getNumPages() {
		return numPages;
	}
   
	
	
	
	
   
    // Override
	// Print book information
	public void printInfo() {
		System.out.println("Book Information: ");
	      System.out.println("   Book Title: " + title);
	      System.out.println("   Author: " + author);
	      System.out.println("   Publisher: " + publisher);
	      System.out.println("   Publication Date: " + publicationDate);
	      System.out.println("   Edition: " + edition);
	      System.out.println("   Number of Pages: " + numPages);
	}
   
}