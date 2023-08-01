package section_loops;

public class Break {

	public static void main(String[] args) {
		System.out.println("Prints 1-10 and break the loop when it's 5");
		for(int i = 1; i < 6; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("\nFind the smallest number greater than 20 that is divisible by 3 ");
		for (int i = 20; i < 31; i++) {
			if(i % 3 == 0) {
				System.out.println("Smallest number greater than 20 that is divisible by 3 is " + i);
				break;
			}
		}
	}

}
