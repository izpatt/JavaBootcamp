package section_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {

	public static void main(String[] args) {
		// Register how many figures - name, dob, occ
		// Print all the values you stored
		// View information based on name
		
		String[][] lol = storeFigures();
		viewFigures(lol);
	}
	
	public static int printMenu() {
		System.out.println("Welcome to Javapedia, what do you like to do? Press.. \n"
				+ "1 - Store figures \n"
				+ "2 - View all figures");
		
		Scanner scan = new Scanner(System.in);
	    int userInput = scan.nextInt();
	    return userInput;
	}

	
	public static String[][] storeFigures() {
		
		System.out.println("How many figures you want to store?");
		Scanner scan = new Scanner(System.in);
	    int userInput = scan.nextInt();
	    
	    scan.nextLine();
	    
	    String[][] dataaa = new String [userInput][3];
	    
	    for(int i = 0; i < dataaa.length; i++) { //0
	    	
    		System.out.println("Figure " + (i + 1));
	    	for(int j = 0; j < dataaa[0].length; j++) { 
	    		
	    		switch (j) {
				case 0: 
					System.out.print("- Name: " + i + j );
					String name = scan.nextLine();
					dataaa[i][j] = name;
					System.out.println(dataaa[i][j]);
					break;
				case 1: 
		    		System.out.print("- Date of birth: " + i + j );
					String dob = scan.nextLine();
					dataaa[i][j] = dob;
					System.out.println(dataaa[i][j]);
					break;
				case 2:
					System.out.print("- Occupation: " + i + j );
					String occupation = scan.nextLine();
					dataaa[i][j] = occupation;
					System.out.println(dataaa[i][j]);
					break;
				default: System.out.println("lol");
			}		
	    		
	    }
	    	
	    		
	    }	    
	    for(int k = 0; k < dataaa.length; k++) {
    		System.out.println("\nFigure " + (k + 1));

    		for(int l = 0; l < dataaa[0].length; l++) { 
	    		switch (l) {
				case 0: 
					System.out.print("- Name: ");
					System.out.println(dataaa[k][l]);
					break;
				case 1: 
		    		System.out.print("- Date of birth: ");
		    		System.out.println(dataaa[k][l]);
					break;
				case 2:
					System.out.print("- Occupation: ");
					System.out.println(dataaa[k][l]);
					break;
					
	    	}
    	}
	    }
	
	    return dataaa;
	    
	}
	
	public static void viewFigures(String[][] storeData) {
		System.out.println(Arrays.toString(storeData[0]));
		System.out.println("Name of data you want to view?");
		Scanner scan = new Scanner(System.in);
	    String dataName = scan.nextLine();
	    
	    for(int k = 0; k < storeData.length; k++) {
	    	if(storeData[k][1].equals(dataName)) {
	    		System.out.println(Arrays.toString(storeData[k]));
	    	} else {
	    		System.out.println("No data found");
	    	}
	    }
	   scan.close();
	}
	
	
	


}
