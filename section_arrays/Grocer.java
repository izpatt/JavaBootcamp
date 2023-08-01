package section_arrays;

import java.util.Scanner;

public class Grocer {

	public static void main(String[] args) {
		String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
		
		System.out.println("Welcome to Java Grocers, what can I help you find? ");
		
		Scanner sc = new Scanner(System.in);
	    String grocery = sc.nextLine();
		System.out.println("\nDo you sell " + grocery + "?");
		
		for(int i = 0; i < aisles.length; i++) {
			String aisleNumber = aisles[i].equals(grocery) == true ?  
				"\nWe have that in aisle: " + i : "";
			System.out.println(aisleNumber);
			
		}
	}

}
