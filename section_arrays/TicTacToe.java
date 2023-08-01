package section_arrays;

import java.util.Arrays;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic-tac Toe!");
		char[][] board = 
			{
				{ '_', '_', '_' },
				{ '_', '_', '_' },
				{ '_', '_', '_' }
			};
		
		for(char[] boards: board) {
			System.out.print(Arrays.toString(boards) + "\n");
		}
		
		
	}

}
