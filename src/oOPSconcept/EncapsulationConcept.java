package oOPSconcept;

public class EncapsulationConcept {
	
	// Encapsulation -> data hiding
	
	// Achieving encapsulation:
		//1. create variable as private 
		//2. each variable 2 methods -> setter & getter method
	
	private String SSN;
	private String DOB;
	
	public void setSSN(String ssn) {
		SSN = ssn;
		
	}
	
	public String getSSN(){ // 123456789
		return SSN.substring(5);
		
	}
	 public void setDOB(String dob) {
		 DOB = dob;
		 
	 }
	 
	 public String getDOB() { // MM/DD/YYYY
		 return DOB.substring(6);
	 }
	
	

	
	
	public static void main(String[] args) {
//		int a = 10;
//		a = 1000;
//		System.out.println(a);

	}

}
