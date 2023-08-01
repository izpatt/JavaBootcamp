package section_loops;

import java.util.Scanner;

public class JavaRolls {

	public static void main(String[] args) {
		System.out.println("Let's play Rolling Java. Type anything to start.");
		System.out.println("Great, here are the rules:"
				+ "\\n-If you roll a 6, the game stops. "
				+ "\n- If you roll a 4, nothing happens."
				+ "\n- Otherwise, you get 1 point."
				+ "\n\nYou must collect at least 3 points to win. Enter anything to roll:\n");
		
		Scanner sc = new Scanner(System.in);
    	int userInput = 0;

	    int points = 0;
	    
	    while(userInput != 6 || userInput != 4) {
	    	userInput = (int) (Math.random() * 6) + 1; 
	    	System.out.println("\nYou rolled " + userInput);
	    	
	    	if(userInput == 6) {
	    		System.out.println("End of game");
	    		break;
	    	} else if(userInput == 4) {
	    		System.out.println("Zero points. Keep rolling");
	    		continue;
	    	} else {
	    		points += 1;
	    		System.out.println("Points: " + points + "\n");
	    		
	    		if(points == 3) {
	    			System.out.println("You won!");
	    			break;
	    		}
	    	}
	    	
	    	
	    }
	}

}
