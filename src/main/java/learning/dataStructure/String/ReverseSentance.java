package learning.dataStructure.String;

import java.util.Arrays;

public class ReverseSentance {
	
	static String reverseString(String s){
		
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "Hello World";

		String[] arr  = s.split(" ");
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(reverseString(arr[i])+" ");
		}
		
//		System.out.println(Arrays.toString(arr));
	}

}
