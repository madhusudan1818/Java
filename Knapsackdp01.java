//implementation of 0/1 knapsack problem using dynamic programmming
 class Knapsackdp01 {
	public static void  main (String args[]){
		int w[]	= {0,20,30,};
		int p[]= {60,100,120};
		int W= 50;
		int n=w.length;
		int dp[][] = new int[n+1][W+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=W;j++){
				if(w[i-1]<=j)
					dp[i][j]=Math.max(p[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		System.out.println("Max Profit="+dp[n][W]);
	}
 }
