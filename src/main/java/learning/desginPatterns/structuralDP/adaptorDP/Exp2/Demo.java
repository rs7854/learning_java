package learning.desginPatterns.structuralDP.adaptorDP.Exp2;

import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		StudentClient client = new StudentClient();
		
		List<Student> studentList = client.getStudentList();
		
		System.out.println(studentList);
	}

}

