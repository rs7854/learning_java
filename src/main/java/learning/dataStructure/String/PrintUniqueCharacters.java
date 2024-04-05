package learning.dataStructure.String;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueCharacters {

	static void printUniqueCharacter1(String s){
		String t ="";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(t.indexOf(ch)<0) {
				t=t+ch;
			}else {
				 t = t.replace(String.valueOf(ch), "");
//				System.out.println(ch);
			}
		}
		
		System.out.println(t + " ");
	}

	static void printUniqueCharacter(String s){
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c : map.keySet()) {
			if(map.get(c)==1) {
				System.out.print(c+" ");
			}
		}
		
		
//		set.stream().forEach(System.out::println);
//		System.out.println(set);
	}
	
	public static void main(String[] args) {
	
		String s = "elephhanpt";
		printUniqueCharacter1(s);
		
	}

}
