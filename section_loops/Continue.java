package section_loops;

public class Continue {
//Allows you to skip
	
	public static void main(String[] args) {
		
		System.out.println("Print 1-10 and skip 5");
		for(int i = 1; i < 11; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

		
		System.out.println("Print 1-20 and skip odd numbers = 1 3 5 7 9 11 13 15 17 19");
		for(int i = 1; i < 21; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
