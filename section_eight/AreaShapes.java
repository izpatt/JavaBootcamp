package section_eight;

public class AreaShapes {
	
	static double area;

	public static void main(String[] args) {
		double square = areaSquare(2);
		double rectangle = areaRectangle(1, 2);
		double triangle = areaTriangle(1, 2);
		double circle = areaCircle(2);
		
		printAreas(square, rectangle, triangle, circle);
	}
	

	public static double areaSquare(double side) {
		area = side * side;
		return area;
		
	}
	
	public static double areaRectangle(double length, double width) {
		area = length * width;
		return area;
	}
	
	public static double areaTriangle(double base, double height) {
		area = (base * height) / 2;
		return area;
	}
	
	public static double areaCircle(double radius) {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public static void printAreas(double square, double rectangle, double triangle, double circle) {
		System.out.println("\n Square area: " + square + "\n Rectangle area: " + rectangle +
				"\n Triangle area: " + triangle + "\n Circle area: " + circle);
	}

}
