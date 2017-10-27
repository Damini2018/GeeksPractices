public class ItronSumCount{
	public static void main(String[] args) {
		int A=3;
		int N= 4;
		int ar[][]=new int[1+N][1+A];
		// N is for row  A is for column 
		for(int i=0;i<N+1;i++){
			for(int j=0;j<A+1;j++){
				ar[i][j]=0;
			}
		}
		ar[2][1]=1;
		int count=0;
		for(int i=2;i<N+1;i++){
			count=0;
			int p=i;
			for(int j=1;j<i;j++){
				if((i-j)>0){
					System.out.println("i is "+i+"  j is "+j+ "   hence computing the count here");
					count++;
					count+=ar[i-j][j];
					p=i-j;
					ar[p][j]=count;
					System.out.println("the term  ar["+p+"]["+j+"] is  "+ar[i-j][j]);
				}
				//p=p-j;
				
			}
			System.out.println("Count is "+count);
			ar[i][i-1]=count;
		}

		System.out.println("the output of matrix is ");
		for(int i=0;i<N+1;i++){
			for(int j=0;j<A+1;j++){
				System.out.print(ar[i][j]);			}
				System.out.println();
		}



	}
}