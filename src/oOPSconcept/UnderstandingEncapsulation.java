package oOPSconcept;

import java.util.Scanner;

public class UnderstandingEncapsulation {

	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter SSN: ");
		ec.setSSN(scan.nextLine());
		System.out.println("Enter DOB (MM/DD/YYY): ");
		ec.setDOB(scan.nextLine());
		scan.close();
		
		System.out.println("Your details provided: ");
		System.err.println("Last four SSN: "+ec.getSSN());
		System.out.println("Birth year: "+ec.getDOB());
		
		

	}

}
