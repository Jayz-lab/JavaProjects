//11/12/2022
//JJ Chang
//Project from Java Bootcamp with John
//Scanner class, getting user input practice

import java.util.Scanner;

public class heightInInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float hInInch ;
		float hInFeet ;
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter your height in feet: ");
		hInFeet = userInput.nextFloat();
		System.out.println("Your height in feet is: " + hInFeet + "Feet.");
		
		System.out.println("I will convert your height in feet to inches.");
		hInInch = hInFeet * 12;
		System.out.println("Your height in inches is: " + hInInch + "Inches.");
	}

}
