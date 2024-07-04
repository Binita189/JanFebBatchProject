package javaBasics;

public class CalculatorClass {
	static int a;
	int b;
	
//	public void addition() {
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
//		
//	}

	public static void addition(int a, int b) {
		System.out.println(a+b);
		
	}
	CalculatorClass(){
		System.out.println("Calculation");
	}
	
	
	
	CalculatorClass(int a, int b){
		CalculatorClass.a = a; // class variable -> calling by ClassName
		this.b = b; // instance variable -> "this" keyword
		
		
	}
	void addition() {
		System.out.println(a+b);
	}
	
	void substraction() {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		CalculatorClass cc1 = new CalculatorClass(115, 250);
		cc1.addition();
		cc1.substraction();
		CalculatorClass cc2 = new CalculatorClass(1150, 250343);
		cc2.addition();
		cc2.substraction();
		
		

	}

		
		
	}


