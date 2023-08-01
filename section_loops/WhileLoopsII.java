package section_loops;

public class WhileLoopsII {

	public static void main(String[] args) {
		String greet = greeting();
		System.out.println(greet);
	}
	
	public static String greeting() {
		while(true) {
			return "hi";
		}
		
		//return "hello";		--unreachable code
	}

}
