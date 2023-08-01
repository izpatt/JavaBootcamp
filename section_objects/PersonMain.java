package section_objects;

public class PersonMain {

	public static void main(String[] args) {
		Person rayanSlim = new Person();
		rayanSlim.setName("Rayan Slim");
		rayanSlim.setNationality("Canadian");
		rayanSlim.setDateOfBirth("01/0﻿1/1111");
		rayanSlim.setSeatNumber(5);
		
		System.out.println("Name: " + rayanSlim.getName());
		System.out.println("Nationality: " + rayanSlim.getNationality());
		System.out.println("Date of Birth: " + rayanSlim.getDateOfBirth());
		System.out.println("Seat Number: " + rayanSlim.getSeatNumber());
	
		System.out.println("\nUpdating the fields...\n");
		
		rayanSlim.setSeatNumber(10);
		System.out.println("Name: " + rayanSlim.getName());
		System.out.println("Nationality: " + rayanSlim.getNationality());
		System.out.println("Date of Birth: " + rayanSlim.getDateOfBirth());
		System.out.println("Seat Number: " + rayanSlim.getSeatNumber());
	}

}
