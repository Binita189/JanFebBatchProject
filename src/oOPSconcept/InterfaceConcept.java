package oOPSconcept;

public interface InterfaceConcept {
	
	// Interface -> defining high level information 
	
		// 1. all method is default abstract(no need abstract keyword), no regular method
		// 2. creating relation of inheritance between Interface & class -> "implements" keyword | class can implement multiple interface-> multiple Interface
		// 3. Interface can also inherit another Interface -> "extends" keyword
		// 4. instance/object cann't be created for Inheritance
	
	// Interface vs class vs abstract class??
	
	void test1();
	void test2();
	String test3(String a); // not required but not throwing error
	
}
