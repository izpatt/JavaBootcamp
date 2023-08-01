package section_arrays;

public class HighestValueArray {

	public static void main(String[] args) {
		//Generate 10 random numbers and get the highest among them all
		int highScore = 0;
		int[] arrays = { randomNumbers(), randomNumbers(), randomNumbers(), 
				randomNumbers(), randomNumbers(), randomNumbers(), randomNumbers(), 
				randomNumbers(), randomNumbers(), randomNumbers()};
		
		for(int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
			if(arrays[i] > highScore) {
				highScore = arrays[i];
			}
		}
		
		System.out.println("\nHighscore is " + highScore);
	}
	
	public static int randomNumbers() {
		return (int) (Math.random() * 500);
	}

}
