/*
 * Name: Coco Louie
 * Date: 07/02/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 7.25 LAB: Winning team (classes)
 * 
 * Class with methods to set and get a team's name, wins, and losses,
 * calculate the win percentage, 
 * and output the team's "standing," or winning average. 
 */

public class Team {
	private String name;
	private int wins;
	private int losses;
   
	// Takes string parameter userName, sets  name to userName 
	public void setName(String userName) {
		name = userName;
	}
	
	
	
	
	
	// Takes integer parameter userWinds, sets wins to userWins
	public void setWins(int userWins) {
		wins = userWins;
	}
	
	
	
	
	
   
	// Takes integer parameter userLosses, sets losses to userLosses.
	public void setLosses(int userLosses) {
		losses = userLosses;
	}
	
	
	
	
	
   
	// Returns name
	public String getName() {
		return name;
	}
   
	
	
	
	
	
	// Returns wins
   public int getWins() {
	   return wins;
   }
   
   
   
   
   
   
   // Returns losses
   public int getLosses() {
	   return losses;
   }
   
   
   
   
   
   
   
   // Method to calculate win percentage
   // Returns win percentage as a double
   public double getWinPercentage() {
	   return (double)wins / (wins + losses);
   }
   
   
   
   
   
   
   // Outputs a team's win percentage and whether the team has a winning or losing average
   public void printStanding() {
	   System.out.printf("Win percentage: %.2f\n", getWinPercentage());
	   if (getWinPercentage() < 0.5) {
		   System.out.println("Team " + name + " has a losing average.");
	   }
	   else {
		   System.out.println("Congratulations, Team " + name + " has a winning average!");
	   }
   }
   
}