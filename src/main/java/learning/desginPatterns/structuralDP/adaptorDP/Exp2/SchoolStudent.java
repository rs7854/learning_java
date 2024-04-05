package learning.desginPatterns.structuralDP.adaptorDP.Exp2;

public class SchoolStudent {
	
	private String fName;
	private String lName;
	private String emailId;
	
	
	@Override
	public String toString() {
		return "SchoolStudent [fName=" + fName + ", lName=" + lName + ", emailId=" + emailId + "]";
	}


	public SchoolStudent(String fName, String lname, String emailId) {
		super();
		this.fName = fName;
		this.lName = lname;
		this.emailId = emailId;
	}


	public String getfName() {
		return fName;
	}


	public String getlName() {
		return lName;
	}


	public String getEmailId() {
		return emailId;
	}
	
	
	

}
