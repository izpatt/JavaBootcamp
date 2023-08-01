package section_loops;

import java.util.Scanner;

public class ForLoopExampleI {
	
	static String _d = "\n\n";

	public static void main(String[] args) {
		printSentence();
		System.out.println(_d);
		userInputSentence();	
		System.out.println(_d);
		userInputCount();
		
	}
	
	//Print 10 times - If Java was easy, they would call it Python!
	public static void printSentence() {
		for(int i = 1; i < 11; i++) {
			System.out.println(i + ". If Java was easy, they would call it Python!");
		}
	}
	
	//User inputs sentence and program will write it 99 times
	public static void userInputSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you. \nWhat do you want me to write?");
        String userInput = scanner.nextLine();
        
        for(int i = 1; i < 100; i++) {
        	System.out.println(i + ". " + userInput);
        }
        
	}
	
	//User inputs n and that will count from 0 - n
	public static void userInputCount() {
		
        System.out.println("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        int userInput = scn.nextInt();
        scn.nextLine();

        for(int i = 0; i <= userInput; i++) {
        	System.out.print(i + " ");
        }
        
	}

}
