package learning.Java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingQStreams {

	public static void main(String[] args) {
		
		
		 List<Integer> list = Arrays.asList(10,98,15,8,49,25,98,32,8,10,283);
		 
		 
//		 find all even numbers;
//		 List ans = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		 
//		 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//		List ans = list.stream().map(x->x+"").filter(x -> x.startsWith("1")).collect(Collectors.toList());
		 
//		3. How to find duplicate elements in a given integers list in java using Stream functions?
		Set set = new HashSet();
//		list.stream().filter(x-> !set.add(x)).forEach(System.out::println);
		
//		4. Given the list of integers, find the first element of the list using Stream functions?
//		System.out.println(list.stream().findFirst().get());
//		list.stream().findFirst().ifPresent(System.out::println);
		
		
//		5. Given a list of integers, find the total number of elements present in the list using Stream functions?
		long count =  list.stream().count();
//		System.out.println(count);      
		
//		6. Given a list of integers, find the maximum value element present in it using Stream functions? 
		int ans = list.stream().max((x,y)->Integer.compare(x, y)).get();
//		System.out.println(ans);
		
//		7. Given a String, find the first non-repeated character in it using Stream functions?
		String input = "Java articles are Awesome";
			Character c = input.chars()
					.mapToObj(s -> Character.valueOf((char) s))
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x->x.getValue()==1L)
					.map(x->x.getKey())
					.findFirst()
					.get();

					
//		System.out.println(c);
		
		
		 List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
         
	     List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
	          
	     List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
	  
	     List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		
//		listOfListofInts.stream().flatMap(x->x.stream()).forEach(System.out::print);
//		 System.out.println(ans);
		 
		 
		 
		String a = "abcdas";
		
		String b = a.chars().mapToObj(ch->String.valueOf((char) ch)).reduce((s1,s2)->s2 + s1).orElse("");
		 

			Character ch =  a.chars()
							.mapToObj(s1 -> Character.valueOf((char) s1))
							.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(x-> x.getValue()==1L)
							.map(x->x.getKey())//.forEach(x->System.out.println("key:"+x));
							.findFirst()
							.get();
							
							
		
		System.out.println(ch);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
