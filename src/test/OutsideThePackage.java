package test;

import javaBasics.AccessModifierConcept;

public class OutsideThePackage {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept(); // import class if it belong to different package
		amc.a = "From outside the package";
		System.out.println(amc.upperCaseString());
		
		// private access: not visible
//		amc.b = amc.a;
//		System.out.println(amc.lowerCasingString());
		
		// default access: not visible
//		amc.c = 100;
//		amc.addition(5);
		//protected access: not visible
//		amc.d = 'D';
//		amc.printCharacter();
		
		//final
//		amc.e = "trying to change";
		System.out.println(amc.e);
	
		

	}

}
