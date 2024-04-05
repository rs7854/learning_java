package learning.desginPatterns.structuralDP.adaptorDP.Exp2;

public class CollegeStudent implements Student{

	String firstname;
	String lastName;
	String email;
	
	
	public CollegeStudent() {
		
	}


	public CollegeStudent(String firstname, String lastName, String email) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
	}


	public String getFirstName() {
		return this.firstname;
	}


	public String getLastName() {
		return this.lastName;
	}


	public String getEmail() {
		return this.email;
	}


	@Override
	public String toString() {
		return "CollegeStudent [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	

}
