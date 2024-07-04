package oOPSconcept;

import test.UnderstandingProtestedVsDefault;

public class InheritanceConcept extends UnderstandingProtestedVsDefault{

	// Inheritance -> relation between classes(child parent) so property can be inherited
			// -> "extends" keyword in child class
	
	// child class -> sub-class
	// parent class -> super-class
	
	// Types Inheritance:
		// 1. Single Inheritance: child class <- parent class
		// 2. Multi-Layer Inheritance: grand child class<- child class <- parent class <- Grand Parent class
		// 3. Hierarchical Inheritance: child-1 <- parent -> child-2
		// 4. Multiple Inheritance: child class cannot have multiple parent class

	public static void main(String[] args) {
		InheritanceConcept ic = new InheritanceConcept();
		// default access: - not visible
//		ic.defaultMethod();
		// protected access:
		ic.protectedMethod();
		
	
		

	}

}
