package practice;

public class SubsetSum {
	static boolean isSubsetSum(int[] a,int n,int sum) {
		boolean [][]dp=new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(int j=1;j<=sum;j++) {
			dp[0][j]=false;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(a[i-1]>j) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
			}
		}
		
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int arr[]= {3,4,5};
		int n=3;
		int sum=6;
		System.out.println(isSubsetSum(arr,n,sum));

	}

}
