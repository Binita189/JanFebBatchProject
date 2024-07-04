package javaBasics;

import java.util.Scanner;

public class ArrayConcept {
	
	// Array Concept -> data table -> 1D Array(1 column, more rows) | 2D Array (multiple rows & columns)
			// 1D Array 
			// Creating Array  -> #1 dataType[] refName = new dataType[RowCount]; | dataType refName[] = new dataType
	     	//                    #2 dataType[] rfName = {value1, value2}
			
			// 2D Array
			// Creating Array  ->  #1 dataType[][] refName = new dataType[rowCownt][ColomnCount]
			

	public static void main(String[] args) {
		
		// #1 creating 1D - array 
//		String[]customerName = new String[3];
//		String customerName[] = new String[5];
		// Inserting value
//		 customerName[0] = "Tom";
//		 customerName[1] = "David";
//	     customerName[2] = "Micheal";
//		 customerName[3] = "Jerry"; // ArrayIndexOutOfBoundExeption
//		 customerName[4] = "Mary";
		
		// #2 creating 1D-array
		String[] customerName = {"Tom","David","Micheal","Jerry","Mary","Jessica"};
		

//		System.out.println(customerName[1]);
//	    System.out.println(customerName[2);
		
		// Number of rows
		System.out.println("Number of rows: "+customerName.length);
		
		//traversing through array
		for(int i=0; i<customerName.length; i++) {
			System.out.println(customerName[i]);
			
		}
		Scanner scan  = new Scanner(System.in);
		String[] grading = new String[5];
		for(int i=0; i<5; i++) {
		System.out.println("Insert your current grade: ");
//		String grade = scan.nextLine();
//		grading[i]= grade;
		
		
		}
//		System.out.println(grading.length);
//		System.out.println(grading[0]);
		
		// #1 creating 2D array
//		String[][] customerLoginCredentials = new String[3][2];
		
		// 1st row
//		customerLoginCredentials[0][0] = "tom1";
//		customerLoginCredentials[0][1] = "t@123";
	
		// 2nd row
//		customerLoginCredentials[1][0] = "david1";
//		customerLoginCredentials[1][1] = "d@123";
		
		//3rd row
//		customerLoginCredentials[2][0] = "jessica1";
//		customerLoginCredentials[2][1] = "j@123";
//		System.out.println("David's username: "+customerLoginCredentials[1][0]);
		// #2
		String[][] customerLoginCredentials = {{"tom1"},{"t@123"},{"david1"},{"d@123"},{"jessica1"},{"j@123"}};
		System.out.println("Row count: "+customerLoginCredentials.length);
		System.out.println("Column count: "+customerLoginCredentials[0].length);
	
		// traversing 2D array
		for(int i=0; i<customerLoginCredentials.length; i++) { //traversing row
			for(int j=0; i<customerLoginCredentials[i].length; j++) { //traversing column
				System.out.println(customerLoginCredentials[i][j]+" | ");
				
			}
			System.out.println();
		}
	}

}
