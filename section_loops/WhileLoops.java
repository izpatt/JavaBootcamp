package section_loops;

public class WhileLoops {

	public static void main(String[] args) {
		/* Generate random numbers between 1 - 100 until x > 90 is generated
		int randomNumber = -1;
		while (randomNumber <= 90) {
			randomNumber = generateRandomNumber();
			System.out.println(randomNumber);
		}
		*/
		
		//Keep doubling a number until it's greater than 100
		int notHundred = 99;
		
		while (notHundred <= 100) {
			notHundred = generateRandomNumberHundred() * 2;
			System.out.println(notHundred);
		}
		
	}

//	public static int generateRandomNumber() {
//		return (int) (Math.random() * 91) + 1;	
//	}


	public static int generateRandomNumberHundred() {
		return (int) (Math.random() * 100) + 1;
	}

}
