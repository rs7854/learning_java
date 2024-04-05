package learning.dataStructure.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordBreakProblem {

	  public static int wordBreak(int n, String s, ArrayList<String> dictionary )
	    {
	       
	        HashSet<String> hs = new HashSet<>(dictionary);
	        return helper(s,hs)?1:0;
	    }
	    
	    private static boolean helper(String s,HashSet<String> hs){
	        if(s==null || s=="" || hs.contains(s))
	            return true;
	        
	        for(int i=1;i<s.length();i++){
	            String part1 = s.substring(0,i);
	            String part2 = s.substring(i);
	            if(hs.contains(part1) && helper(part2,hs))
	                return true;
	        }
	        
	        return false;
	        
	    }
	 public static int wordBreak(String s, ArrayList<String> dictionary )
	    {
	       return helper(s,"",dictionary) ;
	    }
	    
	    static int helper(String str,String part1,ArrayList<String> dic){
	        
//	    	System.out.println("len:"+str.length());
	         if(str.length()==0) {
	        	 return 1;
	         }
	         
	        for(int i=0;i<str.length();i++){
	            
	        	part1 += str.charAt(i);
	        	str = str.substring(i+1);
//	             System.out.println("dic:"+dic+" word:"+part1);
	             if(dic.contains(part1) ){
//	                 System.out.println("str:"+str+" word:"+part1);
	                 helper(str,"",dic);
	                 return 1;
	             }
	        }
			return 0;
	        
	        
	    }
	public static void main(String[] args) {
//		ArrayList dic = new ArrayList(Arrays.asList("i","like","india","country","my"));
		ArrayList dic = new ArrayList(Arrays.asList("lrbbmqb","cd","r","owkk"));
//		String s = "ilike"; // op:-> 1
		String s = "lrbbmqbabowkkab"; //OP-> 0
		
		System.out.println(wordBreak(s, dic));
	}

}
