package practice;

import java.util.Arrays;

public class LargestDivisiblePairsSubset {
	 static int largestSubset(int[] a, int n)
	    {
	        
	        int[] dp = new int[n];       
	        dp[n - 1] = 1;
	        for (int i = n - 2; i >= 0; i--) {
	            int mxm = 0;
	            for (int j = i + 1; j < n; j++) {
	                if (a[j] % a[i] == 0 || a[i] % a[j] == 0) {
	                    mxm = Math.max(mxm, dp[j]);
	                }
	            }
	 
	            dp[i] = 1 + mxm;
	        }
	 
	        return Arrays.stream(dp).max().getAsInt();
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] a = {10, 5, 3, 15, 20};
	        int n = a.length;
	        System.out.println(largestSubset(a, n));
	    }
}
