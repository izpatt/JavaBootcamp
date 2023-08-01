package section_loops;

import java.util.Scanner;

public class Beshie {

	public static void main(String[] args) {
		
		System.out.print("Type anything beshiewapss: ");
		System.out.println(typeAnything());
	}
	
	public static String typeAnything() {
		Scanner sc = new Scanner(System.in);
	    String userInput = sc.nextLine();
	    userInput = userInput.replace(" ", " 🤸 ");
	    return userInput;
	}

	
}
