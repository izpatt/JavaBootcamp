package section_arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// Create an array called seats
		
		String[] seats = {"Harry", "Neville", "Ron","Hermione", "Seamus"};
		System.out.println("It's time to take your 5th year exams. Please take your seats,");
		System.out.println(seats[0] + ", you will take seat 0");
		System.out.println(seats[1] + ", you will take seat 1");
		System.out.println(seats[2] + ", you will take seat 2");
		System.out.println(seats[3] + ", you will take seat 3");
		System.out.println(seats[4] + ", you will take seat 4");
		
		for (String seating : seats) {
			System.out.println(seating);
		}

	}

}
