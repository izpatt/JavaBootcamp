package section_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Toppings {

	public static void main(String[] args) {
		String[] toppings = new String[3];
		System.out.println(Arrays.toString(toppings));
		
		System.out.println("Great, enter each topping!");
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < toppings.length; i++) {
			System.out.print(i + ". ");
			String userInput = scn.nextLine();
			toppings[i] = userInput;
		}
		
		System.out.println("Thank you, here are the toppings you've entered: ");
		for(int i = 0; i < toppings.length; i++) {
			System.out.println(i + ". " + toppings[i]);
		}
		
		scn.close();
	}

	
}
