package oOPSconcept;

public class ParentClass extends GrandParentClass {
	
	public void parentMethod1() {
		System.out.println("Parent method - 1");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent method - 2");
	}
	
	public void sameMethod() {
		super.sameMethod();
		System.out.println("Method Overriding - Grand Parent");
	}


	public static void main(String[] args) {
		grandParentMethod2();
		ParentClass.grandParentMethod2();
		ParentClass pc = new ParentClass();
		pc.grandParentMethod1();
		

	}

}
