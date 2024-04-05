package learning.dataStructure.String;

import java.util.Arrays;

public class FindFrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		
		
		String str = "scaler by interviewbit";
		   // counter array to store frequency of each character.
		   int frequency[] = new int [256];
			
		   // iterate through the string
	        for (int i = 0; i < str.length(); i++) 
	        {
	     	    // increase count by 1 in the array 
	     	    // at index based on the character
	     	    frequency[(int) str.charAt(i)]++;
	        }
	        
	        System.out.println(Arrays.toString(frequency));
		
	}
	

}
