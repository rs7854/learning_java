package learning.dataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		ArrayList<int[]> ansList = new ArrayList<>();
		
		printAllPermutation(ansList,arr,0,arr.length);
		for (int[] x : ansList) { 
            for (int y : x) { 
                System.out.print(y + " "); 
            } 
            System.out.println(); 
        } 

	}
	
	private static void printAllPermutation(List<List<Integer>> list, int[] arr,int l,int len){
		
		
		for(int i=0;i<len;i++) {
			
			swap(arr,l,i);
			printAllPermutation(list, arr, l+1, len);
		}
	}

	private static void printAllPermutation(ArrayList<int[]> ans,int[] arr,int ch ,int len) {

		 if (len == ch) { 
	            ans.add(Arrays.copyOf(arr, arr.length)); 
	            return; 
	        } 
		
		for(int i=ch;i<len;i++) {
			
			swap(arr,ch,i);
			
			printAllPermutation(ans,arr, ch+1,len);
			
			swap(arr,ch,i);
		}
		
	}

	 static void swap(int nums[], int l, int i) 
	    { 
	        int temp = nums[l]; 
	        nums[l] = nums[i]; 
	        nums[i] = temp; 
	    } 


}
