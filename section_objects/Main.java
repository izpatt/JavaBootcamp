package section_objects;

public class Main {

	public static void main(String[] args) {
		// Create 2 Car objects
		Car nissan = new Car("Nissan", 1000, 2020, "Green");

		System.out.println("This " + 
		nissan.make + " is worth $" + nissan.price
		+ ". It was built in " + nissan.year + " with color " 
		+ nissan.color);
		
		
	}

}
