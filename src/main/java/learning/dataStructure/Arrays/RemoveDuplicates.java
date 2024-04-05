package learning.dataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	 static List<Integer> removeD(List<Integer> list) {
		 
		 int j=0;
		 for(int i=0;i<list.size()-1;i++) {
			 for(j=i+1;j<list.size();j++) {
				 	if(list.get(i)==list.get(j)) {
				 		list.remove(j);
				 	}
			 }
		 }
		 
		 
		 return list; 
	 }
	

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList (Arrays.asList(10,20,33,41,20,19,10,19,10,28,28,55));
		
//		System.out.println("before:" + list);
//		list.remove(0);
//		System.out.println("after:"+list);
//		
		System.out.println(removeD(list));
		
		
	}

}
