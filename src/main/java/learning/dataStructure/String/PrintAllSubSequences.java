package learning.dataStructure.String;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequences {
	
	
	
	/*========================================
	Time Complexity: O(2^n)
	The time complexity of this approach is O(2^n),where n is the length of the given string. 
	This is because, for a string of length n, we are generating a total of 2^n subsequences.

	Space Complexity: O(n)
	The recursive function call stack requires O(n) space for the worst case, 
	where n is the length of the given string.*/
	public static void printAllSubSequence(String s,String ans,List<String> list) {
		
		if(s.length()==0 ) {
			list.add(ans);
			return;
		}
		
		printAllSubSequence(s.substring(1), ans+s.charAt(0),list);
		printAllSubSequence(s.substring(1), ans, list);
		
	}
	
	

	public static void main(String[] args) {
		
		String s = "abc";
		List<String> list = new ArrayList<>();
		printAllSubSequence(s, "", list);
		System.out.println(list);
	
	}

}
