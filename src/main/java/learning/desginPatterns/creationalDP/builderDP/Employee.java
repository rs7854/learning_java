//package learning.desginPatterns.creationalDP.builderDP;
//
//final class Employee {
//	
//	
//	
//	    private final  int id;
//	     
//	    private final  String name;
//	     
//	    private final  int age;
//	     
//	    private final String gender;
//	     
//	    private final  String department;
//	     
//	    private final int yearOfJoining;
//	     
//	    private final double salary;
//	    
//	    
//	    private Employee(EmployeBuilder ep) {
//	    	this.id = ep.id;
//	        this.name = ep.name;
//	        this.age = ep.age;
//	        this.gender = ep.gender();
//	        this.department = ep.department();
//	        this.yearOfJoining = ep.yearOfJoining();
//	        this.salary = ep.salary();
//	    }
//	     
//	     
//	    @Override
//	    public String toString() 
//	    {
//	        return "Id : "+id
//	                +", Name : "+name
//	                +", age : "+age
//	                +", Gender : "+gender
//	                +", Department : "+department
//	                +", Year Of Joining : "+yearOfJoining
//	                +", Salary : "+salary;
//	    }
//	}
//
//
