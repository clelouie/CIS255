/*
 * Name: Coco Louie
 * Date: 07/17/24
 * 
 * Class: CIS 255
 * Instructor: David Harden
 * 10.9: LAB: Students (generic class)
 * 
 * Stores student information.
 * Enables sorting of students.
 * Returns string representation of student information.
 */

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private double GPA;
	
	// Constructor, sets firstName to string parameter newFirstName
	// lastName to string parameter newLastName, GPA to double parameter newGPA
	public Student(String newFirstName, String newLastName, double newGPA) {
		firstName = newFirstName;
		lastName = newLastName;
		GPA = newGPA;
	}
	
	
	
	
	
	
	// Override, enables sorting of students. Preference:
	// GPA (highest first), last name (lowest), first name (lowest)
	public int compareTo(Student otherStudent) {
		if (GPA > otherStudent.GPA) {
			return -1;
		}
		else if (GPA < otherStudent.GPA) {
			return 1;
		}
		else {
			if (lastName.compareTo(otherStudent.lastName) < 0) {
				return -1;
			}
			else if (lastName.compareTo(otherStudent.lastName) > 0) {
				return 1;
			}
			else {
				if (firstName.compareTo(otherStudent.firstName) < 0) {
					return -1;
				}
				else if (firstName.compareTo(otherStudent.firstName) > 0) {
					return 1;
				}
				else { return 0; }
			}
		}
	}
	
	
	
	
	
	
	// Returns GPA, last name, first name as string
	public String toString() {
		 return String.format("%.2f", GPA) + " " + lastName + ", " + firstName;
	}
}
