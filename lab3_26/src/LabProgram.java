/*
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.26 LAB: Name format
Program to convert user inputted name of the format firstName middleName lastName to lastName, firstInitial.middleInitial.
First detects spaces to determine if a middle name exists.
If a middle name exists, outputs lastName, firstInitial.middleInitial.
If not, outputs lastName, firstInitial.
 */

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String fullName;
        String firstName;
        String middleName;
        String lastName;
        char firstInitial;
        char middleInitial;

        fullName = scnr.nextLine();

        int spaceOne = fullName.indexOf(" ");
        firstName = fullName.substring(0, spaceOne);
        firstInitial = firstName.charAt(0);

        int spaceTwo = fullName.indexOf(" ", spaceOne + 1);
        
        if (spaceTwo < 0) {
            lastName = fullName.substring(spaceOne + 1, fullName.length());
            System.out.println(lastName + ", " + firstInitial + ".");
        }
        else {
            middleName = fullName.substring(spaceOne + 1, spaceTwo);
            middleInitial = middleName.charAt(0);
            lastName = fullName.substring(spaceTwo + 1, fullName.length());
            System.out.println(lastName + ", " + firstInitial + "." + middleInitial + ".");
        }
   }
}

