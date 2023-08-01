package section_objects;

public class StudentMain {

	public static void main(String[] args) {
		Student patricia = new Student("Patricia Anne Valenzuela", "4-ITG", 22);
		patricia.notaconstructor = "not a constructor";
		
		System.out.println("My name is " + patricia.fullName + " and I am " + patricia.age + " years old " +
		"from section " + patricia.section + "\n" + patricia.notaconstructor);
		
		System.out.println(patricia.getPrivateInt());
		patricia.setPrivateInt(100);
		System.out.println(patricia.getPrivateInt());

	}

}
