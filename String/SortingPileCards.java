import java.util.*;
public class SortingPileCards{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
			int n= sc.nextInt();
			int ar[]=new int[n];
			int max=-1;
			int max_index=-1;
			for(int k=0;k<n;k++){
				ar[k]=sc.nextInt();
				if(max<ar[k]) {max=ar[k];
					max_index=k;}
			}
			int result=n-1-max_index;
			System.out.println( result);
		}
	}
}