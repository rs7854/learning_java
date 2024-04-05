package learning.dataStructure.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatingCharacter {
	static int count =0;
	
	static char countUsingMap(String s) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
		for(Character c : map.keySet() ) {
//			System.out.println(c);
			if (map.get(c)==1) return c;
		}
		
	
		return 0;
	}
	
	static char findUsingIndexMethod(String s) {
		
		for(char ch : s.toCharArray()) {
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				return ch;
			}
		}
		
		return 0;
	}
	
	static void findUsingLamda(String s) {
		
		Character result =  s.chars()         // IntStream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
	             .entrySet().stream()               // EntrySet stream
	             .filter(x -> x.getValue() == 1L)   // extracts characters with a count of 1
	             .map(x -> x.getKey())              // get the keys of EntrySet
	             .findFirst().get();    

		
	}
	

	public static void main(String[] args) {
		String s = "elephant are cool";
		String s1 = "geeksforgeeks";
		String input = "Java articles are Awesome";
		
//		System.out.println(countUsingMap(s));
//		System.out.println("findUsingIndex:->"+findUsingIndexMethod(s));
		
		Character res =  s1.chars()
						.mapToObj(c->Character.valueOf((char) c))
						.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
						.entrySet()
						.stream()
						.filter(x->x.getValue()==1L)
						.map(x->x.getKey())
						.findFirst().get();
		
		System.out.println(res);
	}

}
