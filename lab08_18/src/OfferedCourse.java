/*
 * Name: Coco Louie
 * Date: 07/12/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.18 LAB: Course information (derived classes)
 * 
 * Derived from Course class/ 
 * Stores information specific to offered courses:
 * instructor name, location, class time.
 */

public class OfferedCourse extends Course {
   // TODO: Declare private fields
	private String instructorName;
	private String location;
	private String classTime;

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
	public void setInstructorName(String userName) {
		instructorName = userName;
	}
	
	
	
	
	
	
	public void setLocation(String userLocation) {
		location = userLocation;
	}
	
	
	
	
	
	
	public void setClassTime(String userTime) {
		classTime = userTime;
	}


	
	
	
	
   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
	public String getInstructorName() {
		return instructorName;
	}
	
	
	
	
	
	
	public String getLocation() {
		return location;
	}
	
	
	
	
	
	
	public String getClassTime() {
		return classTime;
	}

}