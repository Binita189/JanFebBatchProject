package javaBasics;

public class DataOperationConcept {
	// Data Operation:
		// 1. Mathematical Operation: -> +,-,*,/
		// 2. Comparative Operation: -> comparing numerical value -> boolean "true" of "false"
			// a. equals to - ==
			// b. not equal to - !=
			// c. greater than - >
			// d. less than - <

	public static void main(String[] args) {
//		
//		int a = 10;
//		int b = 20;
//		int c = a+b; // created variable c
//		c = a-b; // re-assigned the value
//		c = a*b;
//		c = a/b;
//		System.out.println("Addition between a & b: " +c);
//		System.out.println("Subtraction between a & b: "+c);
//		System.out.println("Multiplication between a & b: "+c);
//		System.out.println("Division between a & b: "+c);
		
//		float x = 10;
//		float y = 20;
//		float z = x/y;
//		z = x+y;
//		System.out.println(z);
		
//		double x = 10d;
//		double y = 20d;
//		double z = x/y;
//		z = 1/3d;
////		z = x/y;
//		System.out.println(z);
		
		// salary calculation
		float baseSalary = 80000f;
		float bonus = 5f;
		float tax = 8f;
		float actualFinalSalary;
		float expectedFinalSalary = 77800f;
		actualFinalSalary = baseSalary+((bonus*baseSalary)/100)-((8*baseSalary)/100);
		System.out.println(actualFinalSalary);
		System.out.println("correct calculation: "+(expectedFinalSalary==actualFinalSalary));
		
		//comparative operation
		
		int a = 10;
		int b = 10;
		int c = 30;
		boolean comparingAandB = a==b;
		comparingAandB = a!=b;
		comparingAandB = a!=b;
		comparingAandB = a>b;
		comparingAandB = a<b;
		boolean comparingAandC = a==c;
		comparingAandC = a!=c;
		comparingAandC = a>c;
		comparingAandC = a<c;
		System.out.println(comparingAandB);
		System.out.println(comparingAandC);
		
		
		// using comparative operation for string value -> String manipulation concept
		String newEmployeeName = "David";
		String employeeWalkedIn = "David";
		String maskedEmployeeWalkedIn = new String ("David");
		
		System.out.println("Allow him in: "+employeeWalkedIn==newEmployeeName);
		System.out.println("Deny access: "+employeeWalkedIn!=newEmployeeName);
		
		System.out.println("Allow him in: "+employeeWalkedIn==newEmployeeName);
		System.out.println("Deny access: "+employeeWalkedIn!=newEmployeeName);
		
		
	}
	
	// Assignment: Temperature conversion / Annual tax/ Mortgage calculation

}
