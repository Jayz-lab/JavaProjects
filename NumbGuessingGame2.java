/JJ 4/01/2023
//putting it all together- Programming logic Section
//classes, loops, conditionals, operators

import java.util.Random;
import java.util.Scanner;

public class NumbGuessingGame2 {

	public static void main(String[] args) {
		
		Random rand = new Random();//initialize a Random class
		int randomNumber = rand.nextInt(100)+1;//initialize a variable 'randomNumber' to store the value Rand
		
		Scanner userInput = new Scanner(System.in);//initialize Scanner class
		
		//System.out.println("Random number: " + randomNumber);// to test if/else
		
		while(true) {
			
			System.out.println("please enter a number between 1-100 : ");
			int numb = userInput.nextInt();//initialize a variable 'numb' to hold the input value
			
			if(numb == randomNumber ) {
			System.out.println ("Congratulations! You Win!");
			break;//program ends when its correct
			}
			else if (numb < randomNumber ) {
			System.out.println ("Your guess was too low, try again!");
			}
			else {
			System.out.println("Your guess was too high, try again!");
			}
		}
	}
}
