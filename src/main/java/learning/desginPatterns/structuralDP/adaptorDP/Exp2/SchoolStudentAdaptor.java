package learning.desginPatterns.structuralDP.adaptorDP.Exp2;

public class SchoolStudentAdaptor implements Student{
	
	private SchoolStudent ss;
	
	public SchoolStudentAdaptor(SchoolStudent ss) {
		this.ss = ss;
	}

	public String getFirstName() {
		return ss.getfName();
	}

	public String getLastName() {
		return this.ss.getlName();
	}

	public String getEmail() {
		return this.ss.getEmailId();
	}

	@Override
	public String toString() {
		return "SchoolStudentAdaptor [ss=" + ss + "]";
	}

	

}
