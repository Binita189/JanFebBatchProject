package oOPSconcept;

public class ChildClass extends ParentClass{
	
	void childMethod() {
		System.out.println("Child method");
	}
	
	public void sameMethod() {
		super.sameMethod();
		System.out.println("Method Overriding - child");
	}

	public static void main(String[] args) {
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass();
		cc.parentMethod1();
		
		// grandParent property
		 parentMethod2();
		 ChildClass.grandParentMethod2();
		 cc.grandParentMethod1();
		 
		 // polymorphism
		 ParentClass pc = new ChildClass();
		 cc.childMethod();
//		 pc.childMethod(); // not available
		 pc.parentMethod1();
		 pc.grandParentMethod1();
		 
		 GrandParentClass gpc = new ChildClass();
//		 gpc.childMethod(); // not available
//		 gpc.parentMethod1(); //not available
		 gpc.grandParentMethod1();
		
		 // Method Overriding
		 cc.sameMethod();
		 pc.sameMethod();
		 gpc.sameMethod();

	}

}
