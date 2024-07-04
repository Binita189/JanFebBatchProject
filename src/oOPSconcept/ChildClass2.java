package oOPSconcept;

public class ChildClass2 extends ParentClass{

	public static void main(String[] args) {
		parentMethod2();
		ChildClass2.parentMethod2();
		ChildClass2 cc = new ChildClass2();
		cc.parentMethod1();
		// grandParent property
		 parentMethod2();
		 ChildClass2.grandParentMethod2();
		 cc.grandParentMethod1();
		

	}

}
