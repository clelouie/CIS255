/*
Coco Louie
CIS 255
Dave Harden
06/19/2024
3.27 LAB: Login name
Program to convert user inputted firstName, lastName, and digits (four-digit integer).
Calculates lastDigit of digits using %.
First determines if firstName is less than 6 letters. If true, uses all letters.
If false, uses only first 6 letters.
Concatenates information to output loginName.
 */

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String firstName;
        String lastName;
        int digits;
        int lastDigit;
        String loginName;

        firstName = scnr.next();
        lastName = scnr.next();
        digits = scnr.nextInt();

        lastDigit = digits % 10;

        if (firstName.length() < 6) {
            loginName = firstName + lastName.charAt(0) + "_" + lastDigit;
        }
        else {
            loginName = firstName.substring(0, 6) + lastName.charAt(0) + "_" + lastDigit;
        }

        System.out.println("Your login name: " + loginName);
   }
}

