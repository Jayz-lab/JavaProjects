//while loop
//practice project from course
//JJ 1/01/2023

import java.util.Random;
import java.util.Scanner;



public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//System.in get keyboard input
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100) + 1;//+1 adds up to the hundred
		
		//can be done using boolean expression
		///////////////////////////////////////
		//boolean playerGuessCorrectly = false; -> boolean variable initialsed to false
		//while (!playerGuessCorrectly) { !false is true, while the player has yet to guessed correctly continue loop
		//	code block
		//};
		
		while (true) {
			System.out.println("Enter your guess (1-100):");
			int playerGuess = scanner.nextInt();
			
			if (playerGuess == randomNum) {
				System.out.println("Correct! You Win!");
				break;//break out the loop
				//playerGuessedCorrectly = true; break out loop when true
			}
			else if(randomNum > playerGuess) {
				System.out.println("Nope! The number is higher.");
			}
			else {
				System.out.println("Nope! The number is lower.");
			}
		}
	}
}
