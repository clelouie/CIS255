/*
 * Name: Coco Louie
 * Date: 07/12/2024
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 8.18 LAB: Course information (derived classes)
 * 
 * Store basic course information:
 * number and time.
 * Output course information.
 */

public class Course { 
	private String courseNum;
	private String courseTitle;

	// Sets courseNum to string parameter userCourseNum
	public void setCourseNumber(String userCourseNum) {
		courseNum = userCourseNum;
	}
	
	
	
	
	
	
	// Sets courseTitle to string parameter userCourseTitle
	public void setCourseTitle(String userCourseTitle) {
		courseTitle = userCourseTitle;
	}

	
	
	
	

    // Returns courseNum
	public String getCourseNumber() {
		return courseNum;
	}

	
	
	

	
	// Returns courseTitle
	public String getCourseTitle() {
		return courseTitle;
	}
	
	
	
	
	
	
    // Outputs stored course information
	public void printInfo() {
		System.out.println("Course Information:");
			System.out.println("   Course Number: " + courseNum);
			System.out.println("   Course Title: " + courseTitle);
	}
 
}
