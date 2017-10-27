import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayRearrange {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n= sc.nextInt();
		    int a1[]= new int[n];
		    int a2[]=new int[n];
		    int j=0;
		    for(int i=0;i<n;i++){a1[i]=sc.nextInt();}
		    Arrays.sort(a1);
		System.out.println();
		    if(n%2==0){
		    for(int i=0 ;i<n/2;i++){
		        a2[j]=a1[i];
		        a2[j+1]=a1[n-i-1];
		        j=j+2;
		    }

		    }
		    else{
		        for(int i=0 ;i<n/2;i++){
		        a2[j]=a1[i];
		        a2[j+1]=a1[n-i-1];
		        j=j+2;
		    }
		     a2[j]=a1[n/2];
		    }
		    for(int i:a2){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}