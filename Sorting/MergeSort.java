import java.util.*;
import java.lang.*;


public class MergeSort{
	public static void main(String[] args) {
		int ar[]={64, 34, 25, 12, 22, 11, 90};
		int len=ar.length;

		sort(ar,0,len-1);
		for (int a : ar) {
			System.out.print(a+"  ");
			
		}
		System.out.println();
	}

static void sort(int [] ar,int l, int r){
	if(l<r){
		int m= (l+r)/2;
		 sort(ar,l,m);
		 sort(ar,m+1,r);

		 merge(ar,l,m,r);

	}

}

static void merge(int[] ar, int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;

		int L[]= new int[n1];
		int R[]=new int[n2];

		for(int i=0;i<n1;i++){
			L[i]=ar[i+l];
		}
		for(int i=0;i<n2;i++){
			R[i]=ar[i+m+1];
		}
			
		
		int i=0, j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				System.out.println("i is = "+i);
				ar[k]=L[i];
				i++;
				//System.out.print(ar[k]+" ");
			}
			else {
				System.out.println("j is = "+j);
				ar[k]=R[j];
				j++;
				//System.out.print(ar[k]+" ");
			}
			k++;
		}

		while(i<n1){
			ar[k]=L[i];
			i++ ;
			k++;
			//System.out.print(ar[k]+" ");
		}

		while(j<n2){
			ar[k]=R[j];
			j++ ;
			 k++;  
			 //System.out.print(ar[k]+" ");
		}
		//System.out.println();

}


}

