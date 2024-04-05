package learning.dataStructure.String;

import java.util.Arrays;

public class PrintAllSubStrings {

	//O[n2]
	public static void printAllSubStrings3(String str) {
		
		int n = str.length();
		for(int i=0 ; i < n ; i++) {
			
			String subStr = "";
			 for (int j = i; j < str.length(); j++) {
		            subStr += str.charAt(j);
		            System.out.print(subStr +"\n");
		        }
			
		}
	
	}
	
	//O(n2)
	public static void printAllSubStrings2(String s) {
		
		int n = s.length();
		for(int i=0;i<n;i++) {
			char [] temp = new char[n + 1 -i];
			int tempIndx = 0;
			
			for(int j=i;j<n;j++) {
//				System.out.println("i:"+i+" j:"+ j + " tempindx:" + tempIndx);
				temp[tempIndx++] = s.charAt(j);	
//				temp[tempIndx] = '\0';
				System.out.println(temp);
			}
			
			
		}
		
		
	}
	
	
	// O(n3)
	public static void printAllSubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	//O(N3)
	public static void printSubstrings(String str) {

		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(str.charAt(k));
				}

				System.out.println();
			}
		}
	}

	//O(N3)
	public static void printAllSubString1(String s) {
		char str[] = s.toCharArray();
		for (int i = 0; i <= str.length; i++) {
			for (int j = 0; j <= str.length - i; j++) {
				int k = i + j;
				for (int c = i; c < k; c++) {
					System.out.print(str[c]);
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		String s = "abc";
//		printAllSubString(s);
//		printAllSubString1(s);
		printAllSubStrings2(s);
		printAllSubStrings3(s);
//		printSubstrings(s);
	}

}
