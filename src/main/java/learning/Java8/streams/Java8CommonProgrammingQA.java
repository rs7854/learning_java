package learning.Java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import learning.Java8.streams.entity.Student;


public class Java8CommonProgrammingQA {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Stream.of(1,11,111,11111);
		 List<Student> studentList = Arrays.asList(
	                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
	                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
	                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
	                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
	                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
	                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
	                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
	                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
	                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
	                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")));
	
	
		 // 1. Find the list of students whose rank is in between 50 and 100
	
	List list  = studentList.stream().filter(s->(s.getRank()>50 && s.getRank()<100)).collect(Collectors.toList());
//	System.out.println(list);
	
	
	 //2. Find the Students who stays in Karnataka and sort them by their names
	
	List list2 = studentList.stream().filter(s->s.getCity().equals("Karnataka"))
						.sorted(Comparator.comparing(Student::getFirstName))
						.collect(Collectors.toList());
//	System.out.println(list2);
	
	
//	System.out.println(studentList.stream().map(s->s.getDept()).distinct().collect(Collectors.toList()));
	
	int maxageStudent = (studentList.stream().max(Comparator.comparing(Student::getAge)).get()).getAge();
	int maxage        =	(studentList.stream().max((i1,i2)->i1.getAge()-i2.getAge()).get()).getAge();
//	System.out.println("maxage:"+maxageStudent);
//	System.out.println("max:"+maxage);
	
		studentList.stream().collect
							(Collectors.groupingBy
							(Student::getFirstName,
									Collectors.maxBy(Comparator.comparing(Student::getAge))));

	
		//2nd Highest
	int shs = studentList.stream().map(s->s.getAge()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
//	System.out.println(shs);
	
	
	
	
	
	//
//	find duplicate element with java 8 streams
	List<Integer> list1= Arrays.asList(1,2,3,4,2,5,4);
	
	Set set = new HashSet();
//	list1.stream().filter(x ->  !set.add(x)).forEach(x->System.out.println(x));
//	 
	
	
	
	
	
	
	
	//Frequency of each character in String
	
	String s = "abcdabc";
//	s.chars().collect(Collectors.groupingBy( c->c , Collectors.counting()));
	
	Map<Character, Long> list3 =s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	System.out.println(list3);
	
	List<Integer> arr =  Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	listOfString =listOfString.stream()
						.sorted(
								Comparator.comparing(String::length)).collect(Collectors.toList());
	
	
	 List<Integer> l1 = Arrays.asList(71, 21, 34, 89, 56, 28);
     
     List<Integer> l2 = Arrays.asList(12, 56, 17, 21, 94, 34);
      
     l1.stream().filter(l2::contains).forEach(System.out::println);
	
	
	int l   = arr.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	System.out.print(listOfString);
	
	
	
//	List<Integer> an1s = arr.stream().sorted().limit(3).collect(Collectors.toList());
//	System.out.println(an1s);
	
	
//	arr.stream().filter(x->x%5==0).forEach(x->System.out.print(x+" "));
	int ans = arr.stream().max(Comparator.naturalOrder()).get();
	
	//partion odd and even numbers
	 arr.stream().collect(Collectors.partitioningBy(i->i%2==0));
	
//	System.out.println(ans);
//	 arr.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.print(x +" "));
	 Map map = arr.stream()
			 	.collect(Collectors.groupingBy
			 			(Function.identity(),Collectors.counting()));
//	 System.out.println(map);
	 
	 List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
     
//	 String ans = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
	 
	 String s1 = "RaceCar";
     String s2 = "CarRace";
     
     int i = 15623;
     
     int list5 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(x->Integer.parseInt(x)));
//     System.out.println(list5);
     
     
     boolean b = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.joining())
     .equals(Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.joining())); 
    		 
     
	 
	 int[] a = new int[] {4, 2, 5, 1};
     
     int[] d = new int[] {8, 1, 9, 5};
     
//   int[] listva =  IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct()
//    				.sorted().toArray();
	 
//	System.out.println(Arrays.toString(lista));
	
	
	
	
	
	
	
	
	
	
	}
}
