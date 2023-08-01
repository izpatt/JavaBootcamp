package section_arrays;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] grades = new int[3][4];
		
		//Update 2D Arrays
		grades[0][0] = 72;
		grades[0][1] = 74;
		grades[0][2] = 78;
		grades[0][3] = 76;
		
		grades[1][0] = 65;
		grades[1][1] = 64;
		grades[1][2] = 61;
		grades[1][3] = 67;
			
		System.out.println("A: \t" + Arrays.toString(grades[0]));
		System.out.println("B: \t" + Arrays.toString(grades[1]));

		int[][] grades2 = 
			{
				{72, 74, 78, 76},
				{65, 64, 61, 67}
			};
		
		System.out.println("A2: \t" + Arrays.toString(grades2[0]));
		System.out.println("B2: \t" + Arrays.toString(grades2[1]));
		
		

	}
		

}
