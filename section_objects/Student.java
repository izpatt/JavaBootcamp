package section_objects;

public class Student {

	String fullName;
	String section;
	int age;
	String notaconstructor;
	
	
	
	public Student(String fullName, String section, int age) {
		this.fullName = fullName;
		this.section = section;
		this.age = age;
	}
	
	private String privateString;
	
	private double privateDouble;
	
	public String setPrivateString(String privateString) {
		return privateString;
	}
	
	public double setPrivateString(double privateDouble) {
		this.privateDouble = privateDouble;
		return privateDouble;
	}
	
	private int privateInt;
	public int getPrivateInt() {
		return privateInt; //automatically read as this.privateInt
	}
	
	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt; //field-params
	}
	
	
	
	
}
