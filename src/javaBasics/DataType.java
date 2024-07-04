package javaBasics;

public class DataType {
	
	// Data Types:
				// 1. Primitive Data Types: pre-defined data types, these data types are supported by class
					// Numerical Data Types:
						// a. byte: small whole number, +/-
						// b. short: bigger whole number, than byte, +/-
						// c. int: integer, bigger whole number than short, +/-
						// d. long: bigger whole number than integer, +/-, L at the end
						// e. float: small decimal numbers, +/- f at the end
						// f. double: big decimal numbers, +/- d at the end
					// Non-numerical data types:
						// g. char: character, single alphabetic character of numerical character, value has to be inside single quotation -> ''
						// h. boolean: either true or false
			
			// 2. Object/Class reference Data Types: class to refer to
						// String: alphabetic, numerical special character, blank spaces or combination of these value has to be inside double quotation -> ""
			
					// Creating variable -> Creating data using specific data types
					// Requirement to creating variable -> dataTypes referenceName = valueAssigned;
			

	public static void main(String[] args) {
		
		// Creating Variable
		byte byteData = 10;  
		System.out.println(byteData);
		short shortData = 200;
		System.out.println(shortData);
		int intData = 2000; // duplicate variable not allowed
		intData = 5000; //reassigning value
//		int intData = 3000; // duplicate variable not allowed
		System.out.println(intData);
		long longData = 100000L;
		System.out.println(longData);
		float floatData = 3.45F;
		System.out.println(floatData);
		double doubleData = (5.835388D);
		System.out.println(doubleData);
		
		
		char characterData1 = 'a';
		char characterData2 = '1';
		char characterData3 = 'A';
		System.out.println(characterData1+" "+characterData2+" "+characterData3);
		boolean booleanDataT = true; // condition ??
		boolean booleanDataF= false;
		System.out.println(booleanDataT+"\t\t"+booleanDataF);
		
		String name = "David Mike"; // 1.creating regular variable format
		System.out.println(name);
		
		String address = new String ("3691 Peacock Ct Santa Clara, CA 95051"); // 2. creating in object creation format 
		System.out.println(address);
		
	
	
		

		

	}

}
