package section_objects;

public class Person {

	private String name;
	private String nationality;
	private String dateOfBirth;
	private String[] passport;
	private int seatNumber;
	
	//Name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Nationality
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	//Date Of Birth
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//Passport
	public String[] getPassport() {
		return passport;
	}
	
	public void setPassport(String[] passport) {
		this.passport = passport;
	}
	
	//Seat Number
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}

