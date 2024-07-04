package javaBasics;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String firstName = "Micheal";
		String middleName ="K";
		String lastName = "Jordan";
		String fullName = firstName+" "+ lastName;
		
		
		System.out.println(firstName+" "+ lastName);
		System.out.println(fullName);
		System.out.println(fullName.toUpperCase());
		System.out.println(fullName.toLowerCase());
		
		// concat() -> joins strings together
		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);
		
		
		System.out.println(middleName.concat(" "+middleName.concat(" "+lastName)));
		String fullName3 = firstName.concat(" "+middleName.concat(" "+lastName));
				
		//indexOf() -> index of a character, starts from 0 | index Vs position
		int index = fullName3.indexOf('K');
		System.out.println("IndexOfK: "+index);
		System.out.println("position of K: "+(index+1));
		
	
		int indexOfLastName = fullName3.indexOf(lastName);
		System.out.println("last starts from index: "+indexOfLastName);
		
		//multiple occurrence of a character 
		fullName3 = fullName3.concat("a a a a");
		System.out.println(fullName);
		System.out.println("first occurance of a: "+fullName3.indexOf('a')); //first occurrence of a
		System.out.println("first occurance of a: "+fullName3.indexOf('a', 6)); //  second occurrence a
		System.out.println("first occurance of a: "+fullName3.indexOf('a', fullName.indexOf('a')+1)); // second occurrence of a 
		int firstOccuranceOfa = fullName.indexOf('a');
		int secondOccuranceOfa = fullName.indexOf('a', firstOccuranceOfa+1);
		int thirdOccuranceOfa = fullName.indexOf('a', secondOccuranceOfa+1);
		System.out.println("Second occurance of a: "+thirdOccuranceOfa);
		
		// last occurrence of character 
		int lastOccuranceOfa = fullName3.lastIndexOf('a');
		System.out.println("Last occurance of a: "+lastOccuranceOfa);
		
		// character at a specific index 
		char characterAt5 = fullName3.charAt(5);
		System.out.println("Character at 5th index: "+characterAt5);
		
		// substring() -> get section of a String
		String address = "123 Court sq, LIC, NY 11000";
		int indexOfCharacter = address.indexOf('L');
		String address2 = address.substring(indexOfCharacter);
		System.out.println(address2);
		int zipCodeIndex = address.indexOf('1', address.indexOf('1')+1);
		String zipCode = address.substring(zipCodeIndex);
		System.out.println(zipCode);
		
		String city = address.substring(14, 17);
		System.out.println(city);
		
		// trim() -> clear  blank space from front & back of String
		String custFirstName = "     David   ";
		System.out.println(custFirstName.length()); //
		custFirstName = custFirstName .trim();
		System.out.println(custFirstName .length());
		System.out.println("Welcome "+custFirstName+"!");
		
		// replace() -> replace char/s from the String
		address = address.replace("123", "321");//replace("123", 321);
		System.out.println(address);
		System.out.println(address.replace(" ", " "));
		System.out.println(address.replace(" sq", "")); // since no direct remove() present in string class
		
		String a = "";
		String b = "";
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("Is a empty? "+a.isEmpty());
		System.out.println("Is a empty? "+a.isBlank());
		System.out.println("Is b empty? "+b.isEmpty());
		System.out.println("Is a empty? "+b.isBlank());
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		

	}

}
