package section_arrays;

public class Hundred {

	public static void main(String[] args) {
		// combines nested loops and 2D arrays to print 100 rows and 10 columns of random numbers.
		int[][] hundred = new int [100][10];
		
		for(int i = 0; i < hundred.length; i++) { //0-100
			for (int j = 0; j < hundred[0].length; j++) { //0-10
				hundred[i][j] = (int) (Math.random() * 101);
				System.out.print( (i+1) + "== " + hundred[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
