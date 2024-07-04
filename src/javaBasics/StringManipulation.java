package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
		
		String name1 = "Micheal";
		String name2 = "Micheal";
		String name3 = new String ("Micheal");
		
		if(name1==name2) {
			System.out.println("1 & 2 are same person");
		}
		if(name1==name3) {
			System.out.println("1 & 3 are same person");
		}
		if(name2==name3) {
			System.out.println("2 & 3 are same person");
		}
		
		// equls() -> compare values, boolean output, case 
		System.out.println("1 & 2 are same person: "+ name1.equals(name2));
		System.out.println("1 & 3 are same person: "+ name1.equals(name3));
		System.out.println("2 & 3 are same person: "+ name2.equals(name3));
		
		// equalsIgnoreCase() -> compare values, boolean output, not case sensitive
		System.out.println("1 & 2 are same person: "+ name1.equalsIgnoreCase(name2));
		System.out.println("1 & 3 are same person: "+ name1.equalsIgnoreCase(name3));
		System.out.println("2 & 3 are same person: "+ name2.equalsIgnoreCase(name3));
		
		// compareTo() -> compare values,integer output, zero output -> same value
		System.out.println("1 & 2 are same person: "+ name1.compareTo(name2));
		System.out.println("1 & 3 are same person: "+ name1.compareTo(name3));
		System.out.println("2 & 3 are same person: "+ name2.compareTo(name3));
		
		// compareToIgnoreCase() -> non case sensitive
		System.out.println("1 & 2 are same person: "+ name1.compareToIgnoreCase(name2));
		System.out.println("1 & 3 are same person: "+ name1.compareToIgnoreCase(name3));
		System.out.println("2 & 3 are same person: "+ name2.compareToIgnoreCase(name3));
		
		// toUpperCase()
		System.out.println(name1.toUpperCase());
		System.out.println(name2.toUpperCase());
		System.out.println(name3.toUpperCase());
		
		//toLowerCase()
		System.out.println(name1.toLowerCase());
		System.out.println(name2.toLowerCase());
		System.out.println(name3.toLowerCase());
		
		

	}

//	Assignment:
//	1. Login Functionality -> username/password in DB variable username/password in
//	2. Library Book search functionality -> DB book, input book
//	3. Largest and smallest value out of 3 numerical values
//	4. Grading system - A, B, C, D, E, F
}
