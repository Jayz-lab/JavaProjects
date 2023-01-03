//JJ 2/01/2023
//Ternary Operator Practice

import java.util.Scanner;

public class TernaryOpScanner {

	public static void main(String[] args) {
		// TODO Ternary Operator with user input
		
		int myAge;
		String ageDescription;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		myAge = userInput.nextInt();
		
		//like if else statements where code block is assigning a value to a variable
		//Example: if(condition){variable = value1 } else{variable = value2 };
		//if 'condition' boolean expression evaluates to True ? assign 'variable' to value1 : else assign to value2;
		//this case ageDescription is assigned to the value from the right hand side
		//variable = condition ? someValue : someOtherValue;
		//you can declare and initialize in one line like so;
		//String ageDescription = myAge > 100 ? "Old" : "Young";
		
		ageDescription = myAge > 100 ? "Old" : "Young";
		System.out.println("You are " + ageDescription + " !!!");
		
		//Another Example:
		//Comparing 2 numbers, Max of the two
		/*
		int a = 11;
		int b = 12;
		int max = a> b ? a : b;
		//Ternary Operator helps code to be written more succinctly instead of using if else(){};
		*/
		
		//Another Example:
		//Null Checks
		//trying to get the value of an object if you are not sure if its Null.
		/*
		Cat myCat = new Cat();
		myCat.setAge(9);
		int myCatsAGe = myCat.getAge();
		//.getAge method call on the myCat object into the int variable.
		*/ 
		//calling a method on a variable where value is null gives NUll pointer Exception
		//Ternary operator is used as a code around to avoid that.
		/*
		cat myCat = Null;
		int myCatsAge;
		if (myCat != null){ 
			myCatsAge = myCat.getAge(); 
		}
		else{
			myCatsAge = 0;
		}
		*/
		//written in Ternary Operator: int myCatsAge = myCat != null ? myCat.getAge() : 0;
		//Helps to prevent Null Pointer Exception.
		
	}
}
