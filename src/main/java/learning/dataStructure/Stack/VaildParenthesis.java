package learning.dataStructure.Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class VaildParenthesis {
	
	
	 static boolean ispar(String x)
	    {
	       
	       Stack<Character> s = new Stack<Character>();
	       
	       for(int i=0;i<x.length();i++){
	           
	           char ch = x.charAt(i);
	           if( ch=='}' ){
	               if(!s.empty() && s.peek()=='{'){
	                   s.pop();
	               }else{
	                   return false;
	               }
	           }
	           else if(ch==']'){
	               if(!s.empty() && s.peek()=='['){
	                   s.pop();
	               }else{
	                   return false;
	               }
	           }
	           else if(ch==')'){
	               if(!s.empty() && s.peek()=='('){
	                   s.pop();
	               }else{
	                   return false;
	               }
	           }else{
	               s.push(ch);
	           }
	           
	           
	       }
	       
	       return s.empty();
	    }
	
	
		static boolean isValid(String s) {
			
			Stack<Character> st = new Stack<Character>();
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='{') st.push('}');
				else if(ch=='(') st.push(')');
				else if(ch=='[') st.push(']');
				else if(st.empty() || st.pop() != ch ){
					return false;
				}
			}
			
			return st.empty();
		}
	
		public static void main(String[] args) {
			
			String s = "()";
			String s1= "()[][]([]){}";
			System.out.println(isValid(s1));
			
			
			
		}
	
	
	

}
