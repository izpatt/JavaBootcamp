package section_loops;

public class ForLoop {
	
	static String _d = "\n*************************";
	
	public static void main(String args[]) {
		
		System.out.println("Multiplication Table for Multiples of 5 \n");
		for(int i = 1; i < 11; i++) {
			System.out.println("5 x " + i + " = " + (i * 5));

		}
		
		System.out.println(_d);
		
		System.out.println("\nPrint numbers from 10 to 1 \n");
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println(_d);
		
		System.out.println("\nPrint first 10 even numbers \n");
		for(int i = 0; i < 10; i++) {
			System.out.println(i * 2);
		}
		
		System.out.println(_d);
		
		System.out.println("\nPrint first 10 even numbers \n");
		for(int i = 0; i < 19; i+=2) {
			System.out.println(i);
		}

	}

}
