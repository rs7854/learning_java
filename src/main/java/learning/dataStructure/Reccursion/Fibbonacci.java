package learning.dataStructure.Reccursion;

public class Fibbonacci {
	
	// 0 1 2 3 5 8 13
	static void printFiboByLoop() {
		
		int n1=0,n2=1;
		int n3=0;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<10;i++) {
			
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1 = n2; 
			n2 = n3;
			
		}
		
		// added space for testing
		
		
		System.out.println();
	}
	
//	static int n1=0,n2=1,n3=0;    
	static void printFiboUsingRecu(int range,int n1,int n2,int n3){	
		
		if(range>0) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);  
			printFiboUsingRecu(range-1,n1,n2,n3);
		}
	}

	
	static int fiboNthNo(int n) {
		if(n==0 || n==1) return n;
		return fiboNthNo(n-1) + fiboNthNo(n-2);
	}
	
	
	
//	find nth no of fibonacci series using DP
	 static int fiboNthNoOptimzed(int n,int[] dp) {
	        
	        if(dp[n] != 0) return dp[n];
	        if(n==0 || n==1) return n;
	        
	        int nthValue =  fiboNthNoOptimzed(n-1,dp) + fiboNthNoOptimzed(n-2,dp);
	        dp[n] = nthValue;
	        
	        return nthValue;
	    }
	
	public static void main(String[] args) {
		
		int range = 10;
		
		printFiboByLoop();
		
		System.out.print(0+" "+ 1);
		printFiboUsingRecu(8,0,1,0);
		
		System.out.println("");
		System.out.println("fiboNthNo: "+fiboNthNo(range-1));
		
		
		int dp[] = new int[range+1];
		System.out.println("fiboNthNoOptimzed: "+fiboNthNoOptimzed(range-1, dp));
		
		
	}

}
