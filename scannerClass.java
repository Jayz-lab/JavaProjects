//11/12/2022
//JJ Chang
//Project from Java Bootcamp with John
//Scanner class, getting user input practice

import java.util.Scanner;

public class heightInInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float heightInFeet;
		int heightInFeet1;
		float remainingHeightInches ;
		float heightInInch ;
		
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter your height in feet: ");
		heightInFeet1 = userInput.nextInt();
		
		System.out.println("Please enter your remaining height in decimal: ");
		remainingHeightInches = userInput.nextFloat();
		
		heightInFeet = heightInFeet1 + remainingHeightInches;
		System.out.println("Your height in feet is: " + heightInFeet + " Feet.");
		
		System.out.println("I will convert your height in feet to inches.");
		
		heightInInch = heightInFeet * 12;
		System.out.println("Your height in inches is: " + heightInInch + "Inches.");
	}

}
