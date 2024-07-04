package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	// ArrayList -> data table structure -> one column 

	public static void main(String[] args) {
		
		// creating ArrayList data, table -> creating instance/object ArrayList class
		ArrayList al = new ArrayList(); // raw type -> non-parameterized -> data type not defined
		
		// inserting data 
		al.add(100);
		al.add("Name");
		al.add(true);
		al.add("c");
		
		ArrayList<String> al1 = new ArrayList<String>(); // parameterized
		al1.add("David");
		al1.add("M.");
		al1.add("101010");
		al1.add("QA");
		al1.add("Manhattan");
		al1.add("QA Manager");
//		al1.add(120000); // not allowed any other type other than String
		al1.add("120000");
		System.out.println(al1);
		
		// extracting value
		System.out.println("Job location of "+al1.get(0)+" "+al1.get(1)+":"+al1.get(4));
		// total number of rows
	
		System.out.println("Number of rows: "+al1.size());
		
		// traversing through ArrayList:
		// 1. for loop
		System.out.println("Employee Detail: ");
//		for(int i=0; i<al1.size(); i++) {
//			System.out.println(al1.get(i));
//		}
		
		// 2. while loop
//		int i=0;
//		while(i<al1.size()) {
//			System.out.println(al1.get(i));
//			i++;
//			
//		}
		
		// 3. for each loop
		for(String a: al1) {
			System.out.println(a);
			
		}
		// 4. Iterator concept
		Iterator<String> it = al1.iterator();
//		System.out.println("Value in 1st row: "+it.next()); // to first row
//		System.out.println("Row 2nd present or not? "+it.hasNext());
//		System.out.println("Value in 2nd row: "+it.next()); // to second row
//		System.out.println("Row 3rd present or not? "+it.hasNext());
//		System.out.println("Value in 3rd row: "+it.next()); // to third row
//		System.out.println("Row 4rth present or not? "+it.hasNext()); // to forth row
//		System.out.println("Value in 4rth row: "+it.next()); // to forth row
//		System.out.println("Row 5th present or not? "+it.hasNext());
//		System.out.println("Value in 5th row: "+it.next()); // to fifth row
//		System.out.println("Row 6th present or not? "+it.hasNext()); 
//		System.out.println("Value in 6th row: "+it.next()); // to sixth row
//		System.out.println("Row 7th present or not? "+it.hasNext());
//		System.out.println("Value in 7th row: "+it.next()); // to seventh row
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// some method
		al1.add(1, "K."); // to insert value in specific row
		System.out.println(al1);
		al1.remove(4); // to remove value from specific row
		System.out.println(al1);
		System.out.println(al1.contains("M.")); // check if value is present
		System.out.println(al1.contains("david"));
		
		System.out.println(al1.indexOf("Manhattan")); //returns index of a row
//		al1.clear();
		System.out.println(al1);
		System.out.println(al1.isEmpty()); // check if arrayList is empty 
		
		Object al2 = al1.clone();
		System.out.println(al1.equals(al2)); // check if 2 table is exactly same
		al1.add(4, "QA");
		System.out.println(al1.equals(al2));
		
		

	}

}
