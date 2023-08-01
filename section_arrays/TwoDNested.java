package section_arrays;

import java.util.Arrays;

public class TwoDNested {

	public static void main(String[] args) {
		double[][] prices2 = 
			{
					{12.99, 8.99, 9.99, 0.50},
					{0.99, 1.99, 2.49},
					{8.99, 7.99, 9.49}
			};
		
		System.out.println("Print all using Arrays To String");
		System.out.println(Arrays.toString(prices2[0]));
		System.out.println(Arrays.toString(prices2[1]));
		System.out.println(Arrays.toString(prices2[2]));
		
		System.out.println("\nPrint Row 2");
		for(int i = 0; i < prices2[2].length; i++) {
			System.out.print(prices2[2][i] + "  ");
		}
		
		System.out.println("\nPrint all using nested for loop");
		for(int i = 0; i < prices2.length; i++) { //0-2
			for(int j = 0; j < prices2[i].length; j++) {
				System.out.print(prices2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] table = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			}; 
			        
			for (int i = 0; i < table.length; i++) {
			    for (int j = 0; j < table.length; j++) {
			        System.out.print(table[i][i]);
			    }
			}
		
	}

}
