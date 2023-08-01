package section_eight;

public class Area {
	
	public static void main(String[] args) {
		String explaining = explainArea("English");
		System.out.print(explaining);
		
		double area1 = calculateArea(2.3, 3.6);
		System.out.println(area1);
		printArea(2.3, 3.6);
		
		String explaining2 = explainArea("Hehe");
		System.out.print(explaining2);
		
		double area2 = calculateArea(-5.3, 3.6);
		System.out.print(area2);
		
	}
	
	public static double calculateArea(double length, double width) {
		
		if(length < 0 || width < 0) {
			System.out.println("Invalid Area");
			System.exit(0);
		}
		double area = length * width;
		return area;
	}
	
	public static String explainArea(String language) {
		switch(language) {
			case "English": 
				return "Area equals: ";
			case "French":
				return "La surface est egale: ";
			default:
				return "hello here ";
		}
	}
	
	public static void printArea(double length, double width) {
		System.out.println("The length is: " + length + " The width is: " + width);
	}
}

