package learning.dataStructure.String;

public class PrintAllPermutationString {

	public static void printPerm(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < ques.length(); i++) {
			char c1 = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i+1);
 			printPerm(ros, ans + c1);
		}
	}

	public static void main(String[] args) {

		String s = "abc";
		printPerm(s, "");

	}

}
