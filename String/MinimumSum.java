/*Minimum sum of squares of character counts in a given string after removing k characters
Input :  str = abccc, K = 1
Output :  6
We remove c to get the value as 11 + 11 + 22

Input :  str = aaab, K = 2
Output :  2
*/




import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumSum {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		  String s=sc.next();
		  int k=sc.nextInt();
		  int max_index=-1;
		  int max=Integer.MIN_VALUE;
		  int chr[]=new int[26];
		  Arrays.fill(chr,0);
		  int sum=0;
		  for(int j=0;j<s.length();j++){
		      char c= s.charAt(j);
		      char p=Character.toLowerCase(c);
		      int p1=(int)p-97;
		      chr[p1]++;
		      if(max<chr[p1]){max=chr[p1];
		      max_index=p1;}
		  }


		 while(k>0){
		 	Arrays.sort(chr);
		 	
		 	 k--;
		 	 chr[25]--;
		 }		  
		  
		  for(int k1=0;k1<26;k1++){
		     sum=sum+chr[k1]*chr[k1];
		  }
		  
		  System.out.println("answer is "+sum);
		  
		  
		  
		}
		
		
	}
}