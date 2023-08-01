package section_loops;

import java.util.Scanner;

public class WhileLoopSignIn {

	public static void main(String[] args) {

		String username = "p";
		String password = "p";
		String userEmail = "";
		String userPassword = "";
		
		System.out.println("Welcome to Javagram. Sign in below");
	
		while (!userEmail.equals(username) || !userPassword.equals(password)) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Username: ");
			userEmail = sc.next();
			System.out.print("Password: ");
			userPassword = sc.next();
			
			if(userEmail.equals(username) && userPassword.equals(password)) {
				System.out.println("Sign in successfully");
			} else {
				System.out.println("Incorrect, please try again");
			}
		}
		
		
				
	
		
	}
}
