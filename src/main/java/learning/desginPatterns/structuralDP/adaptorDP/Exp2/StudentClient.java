package learning.desginPatterns.structuralDP.adaptorDP.Exp2;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		
		CollegeStudent cs = new CollegeStudent("Rishabh","sharma","rs@gmail.com") ;
		SchoolStudent ss = new SchoolStudent("RIJF","irii","Gs@gmail.com");
		
		studentList.add(cs);
		studentList.add(new SchoolStudentAdaptor(ss));
		
		
		return studentList;
	}

}
