/*
 * Name: Coco Louie
 * Date: 07/17/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.9: LAB: Students (generic class)
 * 
 * Stores course information.
 * Enables sorting of course objects.
 * Returns string represenation of course information.
 */

public class Course implements Comparable<Course> {
	private String department;
	private int number;
	
	// Constructor, set department to string parameter newDepartment 
	// and number to integer parameter newNumber
	public Course(String newDepartment, int newNumber) {
		department = newDepartment;
		number = newNumber;
	}
	
	
	
	
	

	// Override, enables sorting of courses.
	// Preference: department (lowest first), number (lowest first)
	public int compareTo(Course otherCourse) {
		if (department.compareTo(otherCourse.department) < 0) {
			return -1;
		}
		else if (department.compareTo(otherCourse.department) > 0) {
			return 1;
		}
		else {
			if (number < otherCourse.number) {
				return -1;
			}
			else if (number > otherCourse.number) {
				return 1;
			}
			else { return 0; }
		}
	}
	
	
	
	
	
	
	// Returns course department and number as string
	public String toString() {
		return department + " " + number;
	}
}