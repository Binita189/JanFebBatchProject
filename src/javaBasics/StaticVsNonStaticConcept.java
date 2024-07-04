package javaBasics;

public class StaticVsNonStaticConcept {
	// class properties can be static or non-static
	// static properties -> will have static key word
	// Non-static property -> will not have static keyword -> connected with instance/ object of class
	
	public static void addition() { // static method
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	}
	public void substraction() { // non-static method
		int a = 10;
		int b = 20;
		System.out.println(a-b);
		
	}
	

	public static void main(String[] args) {
		StaticVsNonStaticConcept svn = new StaticVsNonStaticConcept();
		// calling static properties
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
		addition(); // direct calling
		StaticVsNonStaticConcept.addition(); // calling with className
		svn.addition(); //# calling by object RefernceName -> warning sign the method is for calling non-static property
		// calling non-static property
//		substraction(); // direct calling not allowed
//		StaticVsNonStaticConcept.substraction(); // calling with className also not allowed
		svn.substraction(); //#only way to call non-static propert -> calling by object referenceName
		

	}

}
