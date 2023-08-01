package section_eight;

import java.util.Scanner;


public class DiceJack {

	public static void main(String[] args) {
	
	//----- User enters 3 numbers
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter three numbers between 1 to 6: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
	   
	System.out.println("Three numbers: " + num1 + " " + num2 + " " + num3);
	
	//----- Checks if user input is valid
	
	boolean isHigherSix = isHigherThanSix(num1, num2, num3);
	boolean isLowerOne = isLowerThanOne(num1, num2, num3);
	if(isHigherSix || isLowerOne) {
		System.out.println("Incorrect user input");
		System.exit(0);
	}
	
	//----- Dice rolls 3 times
	int roll1 = rollDice();
	int roll2 = rollDice();
	int roll3 = rollDice();
	
	System.out.println("Rolled Dice: " + roll1 + " " + roll2 + " " + roll3);
	

	int sumNumbers = num1 + num2 + num3;
	int sumDiceRolls = roll1 + roll2 + roll3;
	
	System.out.println("Sum Numbers: " + (num1 + num2 + num3));
	System.out.println("Sum Dice Rolls: " + (roll1 + roll2 + roll3));

	
	if (userWon(sumNumbers, sumDiceRolls)) {
		System.out.println("Congratulations, you won!");
	} else {
		System.out.println("Better luck next time!");
	}
	}
	

	public static int rollDice() {
		double randomNumber = Math.random() * 6 + 1;
		return (int)randomNumber;
	}
	
	public static boolean isHigherThanSix(int num1, int num2, int num3) {
		return (num1 > 6 | num2 > 6 | num3 > 6);
	}
	
	public static boolean isLowerThanOne(int num1, int num2, int num3) {
		return (num1 < 1 | num2 < 1 | num3 < 1);
	}
	
	public static boolean userWon(int sumNumbers, int sumDiceRolls) {
		return (sumNumbers > sumDiceRolls && ((sumNumbers - sumDiceRolls) < 3));
	}

}

