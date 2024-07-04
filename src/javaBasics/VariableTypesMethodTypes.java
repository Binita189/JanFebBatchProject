package javaBasics;

public class VariableTypesMethodTypes {

	// Variable -> state of an object
	// Types of Variable:
		// 1. Class variable: defined outside any method but inside the class, static keyword -> Static variable
		// 2. Instance variable: defined outside any method but inside the class, no static keyword -> non-static variable
		// 3. Local variable -> variable created inside a method
		
		// Parameter: ??
	static int x = 10; // class variable/static variable
	int y = 20; // Instance variable/ non-staic variable
	
	
	public static void addition() {
		int a = 50;
		int b = 25;
		System.out.println(a+b);
		
	}
	
	public void substraction() { // Non-Static method -> static - Non-Static mismatch
		// Static & non-Static mismatch
			// 1. Non-Static properties can be directly called in non-static method
			// 2. static properties can be accessed directly
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		System.out.println(a+b);
		addition();
		
		VariableTypesMethodTypes vtm = new VariableTypesMethodTypes();
		// calling class variable/Static variable
		System.out.println(x); //#1 Direct calling
		System.out.println(VariableTypesMethodTypes.x); //#2 by ClassName
		System.out.println(vtm.x); //#3 By object/instance referenceName
		
		// Calling instance variable/Non-Static variable
		System.out.println(vtm.y);

	}

}
