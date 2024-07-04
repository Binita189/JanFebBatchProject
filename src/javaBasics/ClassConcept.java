package javaBasics;

import java.util.Scanner;


public class ClassConcept {
	
//	scanner concept -> allows to accept user value -> Scanner class

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner (System.in);
		
		String usernameDB = "test12";
		String passwordDB = "123";
		
		System.out.println("Enter username:");
		String username = scan.nextLine(); // next() or nextLine - scan String value
		System.out.println("Enter password:");
		String password = scan.nextLine();
		
		scan.close();
		
		if(username.isBlank() || password.isBlank()) {
			System.out.println("Login successful!");
			
		}
		else {
			
			System.out.println("Login denied!:");
		}
		

	}

}
