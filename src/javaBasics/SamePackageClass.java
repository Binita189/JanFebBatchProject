package javaBasics;

public class SamePackageClass {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		
		// public access:
		amc.a = "From different class of same package";
		System.out.println(amc.upperCaseString());
		
		// private access: not visible
//		amc.b = amc.a;
//		System.out.println(amc.lowerCasingString());
		
		// default access:
		amc.c = 100;
		amc.addition(5);
		
		//protected access:
		amc.d = 'D';
		amc.printCharacter();
		
		//final
//		amc.e = "trying to change";
		System.out.println(amc.e);

	}

}
