package learning.dataStructure.String;

public class FindLCS_and_LRS {
	
	
	
	 public static int LongestRepeatingSubsequence(String str)
	    {
	            int[][] dp = new int[str.length()+1][str.length()+1];
	            for(int i=dp.length-2;i>=0;i--){
	                for(int j=dp[0].length-2;j>=0;j--){
	                    
	                    if(str.charAt(i)==str.charAt(j) && i!=j){
	                        dp[i][j] = dp[i+1][j+1] +1;
	                    }else{
	                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
	                    }
	                    
	                }
	            }
	            
	            return dp[0][0];
	    }

	
//	Time Complexity: O(m * n) where m and n are the string lengths.
//	Auxiliary Space: O(m * n) Here the recursive stack space is ignored.
	public static int longestCommonSubSeq(String s1,String s2){
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i = dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j] = 1 + dp[i+1][j+1];
				}else {
					dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		
		return dp[0][0];
	}
	
//	Time Complexity: O(2^m+n) ( power of 2 (M+N))
//	Auxiliary Space: O(1)
	public static int lcs(String s1, String s2, int m, int n) 
	    { 
	        if (m == 0 || n == 0) 
	            return 0; 
	        if (s1.charAt(m - 1) == s2.charAt(n - 1)) 
	            return 1 + lcs(s1, s2, m - 1, n - 1); 
	        else
	            return Math.max(lcs(s1, s2, m, n - 1),lcs(s1, s2, m - 1, n)); 
	    } 
	
	
	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "abed";
		System.out.println("ans:->"+longestCommonSubSeq(s1, s2));
		System.out.println("ans:->"+lcs(s1, s2,s1.length(),s2.length()));
	}

}
