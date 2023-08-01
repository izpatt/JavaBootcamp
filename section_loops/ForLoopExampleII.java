package section_loops;

import java.util.Scanner;

public class ForLoopExampleII {

	public static void main(String[] args) {
//		beerCount();
//		countNumber();
		evenOdd();
		fizzBuzz();
	}
	
	//Create a for loop that steps down
	public static void beerCount() {
		for(int i = 99; i > 0; i--) {
			System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer! \n" +
			"take one down, pass it around, " + (i-1) + " bottles of beer on the wall! \n" );
		}
	}
	
	//User picks number to count by, start from, end from
	public static void countNumber() {
		
		System.out.println("\n\nI've heard you like to count by threes \nJimmy: It depends \nOh ok... \n\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Pick a number to count by: ");
	    int step = sc.nextInt();
	    
		System.out.print("2. Pick a number to start counting from: ");
	    int start = sc.nextInt();
	    
		System.out.print("3. Pick a number to count to: ");
	    int stop = sc.nextInt();
	    
	    for(int i = start; i <= stop; i+=step) {
	    	System.out.print(i + " ");
	    }
	    System.out.print("% \n\n\n");
	}
	
	//Uses counter flow to check if numbers are odd or even 
	public static void evenOdd() {
		for(int i = 0; i < 20; i++) {
			System.out.println(i + ((i % 2 == 0) ? " is even" : " is odd"));
		}
		System.out.println("\n\n");
	}
	
	//FizzBuzz: Print Fizz if multiples of 3, Buzz if multiples of 5 and FizzBuzz for both
	public static void fizzBuzz() {
		for (int i = 0; i < 19; i++) {		
			if(i % 3 == 0) {
				System.out.println(i + " Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			} else if (i % 3 == 0 & i % 5 == 0) {
				System.out.println(i + " FizzBuzz");
			}
		}
		
	}
}
