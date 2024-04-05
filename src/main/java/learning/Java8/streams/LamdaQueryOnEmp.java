package learning.Java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import learning.Java8.streams.entity.Employee;

public class LamdaQueryOnEmp {

	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
        
		empList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		empList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		empList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		empList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		empList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		empList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		empList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		empList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		empList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		empList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		empList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		empList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//====================================================================================================================================================
		
//Query 3.1 : How many male and female employees are there in the organization?
		
		
		Map<String, Long> ans = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		Map<String, Long> ans1 = empList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting()));
		
//		System.out.print(ans1);
		
		
//====================================================================================================================================================
//		Query 3.2 : Print the name of all departments in the organization?
		
		
//		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
//====================================================================================================================================================
//		Query 3.3 : What is the average age of male and female employees?
		
		
		Map map = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//		System.out.println(map);
		
//====================================================================================================================================================
//		Query 3.4 : Get the details of highest paid employee in the organization?
		
		Employee emp = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
//		Employee d =empList.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).skip(0).findFirst().get();
		
		System.out.println(emp.salary);
		   
//		System.out.println(d.salary);
		
//====================================================================================================================================================
//		Query 3.5 : Get the names of all employees who have joined after 2015?	
		
//		empList.stream().filter(emp1 -> emp1.getYearOfJoining()>2015).forEach(System.out::println);
		
//====================================================================================================================================================
//		Query 3.6 : Count the number of employees in each department?	
		
		Map map2=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(map2);
		
		
//====================================================================================================================================================
//		Query 3.7 : What is the average salary of each department?
		
//		empList.stream().collect(
//								Collectors.groupingBy(
//								Employee::getDepartment,
//								Collectors.averagingDouble(
//								Employee::getSalary))
//								).forEach((key, value) -> System.out.println(key + "=" + value));;
//		

		
//		System.out.println(map3);
//====================================================================================================================================================
//		Query 3.8 : Get the details of youngest male employee in the product development department?
		
		
		
		Optional<Employee> emp2 = empList.stream()
									.filter(e -> e.getDepartment().equals("Product Development") &&  e.getGender().equals("Female"))
									.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
//		System.out.println(emp2);
		
		
		
//====================================================================================================================================================
//		Query 3.9 : Who has the most working experience in the organization?
		
		
		Optional<Employee>  emp4   = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		  
//		System.out.println(emp4);
		
//====================================================================================================================================================
//		Query 3.10 : How many male and female employees are there in the sales and marketing team?	
		
		Map<String, Long> e6 = empList.stream().filter(emp5->emp5.getDepartment().equalsIgnoreCase("Sales And Marketing"))
						.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
//		System.out.println(e6);
		
//====================================================================================================================================================
//		Query 3.11 : What is the average salary of male and female employees?
		
		Map map4 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(map4);
 		
		
		
//====================================================================================================================================================
//		Query 3.12 : List down the names of all employees in each department?		
		
//	empList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//	.forEach((key,value)->{
//		 System.out.println("--------------------------------------");
//         
//		    System.out.println("Employees In "+ key + " : ");
//		             
//		    System.out.println("--------------------------------------");
//		             
//		    List<Employee> list = value;
//		             
//		    for (Employee e : list) 
//		    {
//		        System.out.println(e.getName());
//		    }
//	});	
		
//====================================================================================================================================================
//		Query 3.13 : What is the average salary and total salary of the whole organization?		
		
		
		DoubleSummaryStatistics list6 =  empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//		System.out.println(list6.getAverage()+" "+ list6.getSum() );
		
		
//====================================================================================================================================================
//		Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.		
		
		
//		Map<Boolean, List<Employee>> partitionEmployeesByAge=
//				empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
//		
//		System.out.println(partitionEmployeesByAge);
//				         
//				Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();
//				         
//				for (Entry<Boolean, List<Employee>> entry : entrySet) 
//				{
//				    System.out.println("----------------------------");
//				             
//				    if (entry.getKey()) 
//				    {
//				        System.out.println("Employees older than 25 years :");
//				    }
//				    else
//				    {
//				        System.out.println("Employees younger than or equal to 25 years :");
//				    }
//				             
//				    System.out.println("----------------------------");
//				             
//				    List<Employee> list = entry.getValue();
//				             
//				    for (Employee e : list) 
//				    {
//				        System.out.println(e.getName());
//				    }
//				}
//		
		
		
//====================================================================================================================================================
//		Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?		
		
		
		Employee e7 =  empList.stream().max(Comparator.comparingInt(x->x.getAge())).get();
		System.out.println(e7.getAge() +" "+ e7.getDepartment() );
		
		
		
		
		
//====================================================================================================================================================
		
		
		
		
//====================================================================================================================================================
		
		
		
		//====================================================================================================================================================
		
		
		
		//====================================================================================================================================================
		
		
		
		
		//====================================================================================================================================================
		
		
		
		
		//====================================================================================================================================================
		
		
		
		//====================================================================================================================================================
		

		
		
		
	}

}
