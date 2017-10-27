import java.util.*;

public class DPCoinPossible{
	//Static int dp[][];
	//Static int count=0;

	public static void main(String[] args) {
		int arr[] ={1,2,3};
		int n=arr.length;
		int sum=4;
		System.out.println(countWays(arr,n,sum));

	//	ArrayList<Integer> arrayIntegers =   new ArrayList<Integer>( Arrays.asList(arr) );




    	//ArrayList<Integer> arl=new ArrayList<Integer>(Arrays.asList(arr));
		//System.out.println("the index of "+Arrays.asList(arr).indexOf(5));
 		//System.out.print( findWay(arr,n,sum));


		}


	static 	int findWay(int arr[],int n,int sum){
		if(n==0 || sum<0)
			return -1;

		int dp[][]=new int[n][sum+1];
			for(int i=0;i<n;i++){
				dp[i][0]=1;
			}

			if(arr[0]<=sum) dp[0][arr[0]]=1;
			for(int i=1;i<n;i++){
				for(int j=0;j<sum+1;j++){
					if(j-arr[i] > 0){
					dp[i][j]= dp[i-1][j]+dp[i-1][j-arr[i]] ;}
					else{
						dp[i][j]= dp[i-1][j]+1;
					}
				}
			}
			System.out.println(dp[n-1][sum]);

		return dp[n-1][sum];	
	}



		static long countWays(int ar[],int m,int n){
			long table[]=new long[n+1];
			Arrays.fill(table,0);
			
			System.out.println();
			table[0]=1;

				/*for(int i=0;i<m;i++){
					for(int j=ar[i];j<=n;j++){
						
						tab[j] += tab[j-ar[i]];
						
						System.out.println("the j is "+j);
						for(int hds:tab){
				              System.out.print(hds+"  ");
			              }
					}
				}*/

				for (int i=0; i<m; i++){
                    for (int j=ar[i]; j<=n; j++){
                       table[j] += table[j-ar[i]];
                    }
				}
				return table[n];

		}

		/* static long countWays(int S[], int m, int n)
    {
        
        long[] table = new long[n+1];
 
        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)
 
        // Base case (If given value is 0)
        table[0] = 1;
 
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }*/


}

