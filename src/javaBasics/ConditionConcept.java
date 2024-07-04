package javaBasics;

public class ConditionConcept {
	
//	 Conditions: -> situation(comparision)-> boolean output-> true/false
	// if: ->if(condition-1){code-1}
	// else if: -> else if(condition-2) {code_2}
	// else: -> else {code_3}
	
//	 operator to increase conditions -> 1. && -> and 2. || -> or


	public static void main(String[] args) {
		
		int a = 76;
		
//		 checking 1 condition
		if(a<50) {
			System.out.println("value of a is less then 50");
		}

	else {
		
		System.out.println("value of a is more then 25");
			
	}
	
	// checking 2 conditions
	if(a<25) {
		System.out.println("value of a is less then 25");
	}
		
	else if(a==25) {
		System.out.println("value of a is 25");
	}
	
	else {
		System.out.println("value of a is more then 25");
	}
//	 checking conditions 3
	if(a<25) {
		System.out.println("value of a is less then 25");
		
	}
	
	else if (a==25){
		System.out.println("value of a is 25");
		
		
		
	}
	else if (a==50){
		System.out.println("value of a is 50");
		
	
	}
	else {
		
		System.out.println("value of a is more then 25");
		}
	if(a<=25) {
		System.out.println("value of a is in 1st quarter");
	}
	
	else if (a>25 && a<=50){
		System.out.println("value of a is in 2nd quarter");
	}
	else if(a>50 && a<=75) {
		System.out.println("value of a is in 3rd quarter");
	}
	
	else if(a>75 || a<=100) {
		System.out.println("value of a is in 4rth quarter");
	}
	else {
		System.out.println("invalid value");
	}
	
	
	// 1-100 -> 1-25
	for(int i=1; i<100; i++) {
		if(i>=1 && i<=25) {
			System.out.println(i);
		}
	}
	
	int a1 = 15;
	while(a1<=100) {
		if(a1>=1 && a1<=25) {
			System.out.println("First quarter");
			break;
		}
		
		else if(a1>25 && a1<=75) {
			System.out.println("Second quarter");
			break;
		}
		
		else if(a1>50 && a1<=75) {
			System.out.println("Third quarter");
		}
		
		else {
			System.out.println("Fourth quarter");
		}
	}
	
	
	}
	
	
	

}
