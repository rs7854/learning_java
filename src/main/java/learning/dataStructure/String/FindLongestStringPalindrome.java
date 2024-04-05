package learning.dataStructure.String;

public class FindLongestStringPalindrome {

	public static String longestPalindrome(String s) {
		int maxLength = 0;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (checkPalindrome(str)) {
					if (str.length() > maxLength) {
						ans = str;
						maxLength = str.length();
					}
				}
			}
		}
		return ans;
	}

	static boolean checkPalindrome(String S) {

		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) != S.charAt(S.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String s = "aaaabbaa"; // aabbaa
		System.out.println(checkPalindrome(s));
		System.out.println("longestPalindrome:-"+longestPalindrome(s));
	}

}
