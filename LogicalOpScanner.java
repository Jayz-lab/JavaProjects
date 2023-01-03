import java.util.Scanner;

//JJ 2/01/2023 
//Logical Operator //&& || !
//Practice with user input

public class logicalOpScanner {

	public static void main(String[] args) {
		// TODO user inPut

		int age1;//initialise variable without value
		int age2;
		int age3;
		int age4;
		
		//utilizing scanner class, user input via keyboard, system.in
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		age1 = userInput.nextInt();
		System.out.println("Age1 is :" + age1);
		
		System.out.println("Please enter your age: ");
		age2 = userInput.nextInt();
		System.out.println("Age2 is :" + age2);
		
		System.out.println("Please enter your age: ");
		age3 = userInput.nextInt();
		System.out.println("Age3 is :" + age3);
		
		System.out.println("Please enter your age: ");
		age4 = userInput.nextInt();
		System.out.println("Age4 is :" + age4);
		
		// logical 'or' operator ||
		// either A or B evaluates to True is True
		if (age1 >=17 || age2 >= 17){
			System.out.println("This group can go to the movie.");
		}
		else {
			System.out.println("This group cannot go to the movie.");
		}
				  
		// logical 'and' && both A && B must evaluate to True
		// Java evaluates from left to right
		// You can group them for Java to evaluate with parenthesis ()
		// like so -> (age1 >=21 && (age2 >= 21 && age3 >= 21))
				    
		if (age1 >=21 && age2 >= 21 && age3 >= 21){
			System.out.println("This group can go to the bar.");
		}
		else {
			System.out.println("This group cannot go to the bar.");
		}

		// logical 'not'!()
		// use the '!' sparingly
		// not under 18
		if (!(age3 < 18)){
			System.out.println("This person cannot vote.");
		}
		else {
			System.out.println("This person can vote.");
		}

		//equals ==
		if (age3 == 18){
			System.out.println("This person is 18.");
		}
		else {
			System.out.println("This NOT 18.");
		}
				    
		//not equals !=
		if (age4 != 18){
			System.out.println("This person is NOT 18.");
		}
		else {
			System.out.println("This person is 18.");
		}	    
	}
}


