//JJ 6/01/2023
//Personal coding challenge

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner player = new Scanner (System.in);
		Random rand = new Random ();
		
		String[] choices = {"rock", "Paper", "Scissors"};
		
		String compGuess = choices[rand.nextInt(3)];
		
		while(true) {
			System.out.println("Please enter your choice between rock, paper or scissors: ");
			String player = player.nextLine();
		}	
		if(player == compGuess) {
			System.out.println("Congratulations, you guessed the right one!" + rand);
			break;
		}
		else if(player != compGuess) {
			System.out.println("Please guess again!");
		}

	}

}
//to be completed..
