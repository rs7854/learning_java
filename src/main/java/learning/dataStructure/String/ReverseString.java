package learning.dataStructure.String;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReverseString {
	
	
	public static String reverse(String s) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static void reverseUsingLamda(String s) {
		
		s = Stream.of(s).map(word->new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reverseUsing Lamda:" + s);
	}
	
	public static void main(String[] args) {
	
		String s = "Hello World";
		
		System.out.println("Reverse String Using Loop:-" + reverse(s));
		
		reverseUsingLamda(s);
		
		StringBuilder reverseWord = new StringBuilder(s).reverse();
		System.out.println("reverseWord: " + reverseWord);
	
		
		
		
		
	}
}
