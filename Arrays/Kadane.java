import java.util.*;
import java.lang.*;
import java.io.*;

class Kadane {
	public static void main (String[] args) {
		//code
	
	Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
			int n= sc.nextInt();
			int ar[]=new int[n];
		        for(int k=0;k<n;k++){
				ar[k]=sc.nextInt();}
				

		
		        int c1= ar[0];
		        int curr=ar[0];
		        int max=Integer.MIN_VALUE;
			
			 for(int k=1;k<n;k++){
			 	System.out.println("curr == "+curr+"  c1== "+c1+ " max== "+max );
			    
			    curr+=ar[k];
			    if(c1>curr) {
			        curr=ar[k];
			    }
			    else {c1 = curr;}
			    //System.out.println("c1 == "+c1);
			    max=(curr>max)?curr:max;
			 }
			 
			 System.out.println(max);
		}
		}
}