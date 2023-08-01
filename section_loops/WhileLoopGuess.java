package section_loops;

import java.util.Scanner;

public class WhileLoopGuess {

	public static void main(String[] args) {
				
		System.out.print("Choose a number between 1 to 20. Try to guess it: ");
		
		int userGuess = 0;
		
	    while(userGuess != 18) {
	    	Scanner sc = new Scanner(System.in);
		    userGuess = sc.nextInt();
		    System.out.print("Guess again: ");
	    }
	    
	    System.out.println("Nice, you've guessed the number: " + 18);
	    
	    
	
	}
	
	
	
}
