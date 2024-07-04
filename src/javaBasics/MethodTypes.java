package javaBasics;

import java.util.Scanner;

public class MethodTypes {
	
//	public MethodTypes(String String) {
		
//	}
//	public MethodTypes() {
		
		// Auto-generated constructor stub
			// Basic requirement to create method -> 1. Return type (though void) | 2. Method signature | 3. method body
		void testMethod() {
			
		}
//	}
	// Method -> behaviour of an object
	
		// Parameter -> variable defined inside the method signature
	
//	 Method Types: based on parameter 
		// 1. Method without parameter:
	public static void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	}
		// 2. Method with single parameter
	public static void substraction(int a) {
		System.out.println("your provided: "+a);
		
	}
	
		// 3. Method with multiple parameter:(same type or different)
	public static void multiplication(int a, double b) {
		System.out.println(a*b);
		
	}
	// Method Overloading vs Method Overriding
		// -> multiple methods with same name but with different number or types of parameter
	
	public void addition(double a, double b) {
		System.out.println(a+b);
		
	}

	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
// Duplicate Method - not allowed	
//	void test() {
//		
//	}
//	void test() {
//		
//	}
	
	// Constructor: special method-> name of the class | no return type (even void) | no need call and will be called as soon as instance/object is created
	MethodTypes(){
		System.out.println("I am in constructor");
	}
	
	// constructor overloading 
	MethodTypes(String a){
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		addition();
		MethodTypes mt = new MethodTypes();
		mt.addition(100, 200);
		mt.addition(10.77, .14823482472);
		mt.addition(10, 3443, 32424);
		substraction(100);
		multiplication(10,20.55d);
		multiplication (100, 4.55656d);
		
		MethodTypes mt1 = new MethodTypes("Understanding Constructor");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name in format(FirstName LastName): ");
		String custName = scan.nextLine();
		scan.close();
		ReturnType rt = new ReturnType(custName);
		rt.NameInitial();
		System.out.println(rt.NameInitial());
		
		//

	}

}
