import java.util.*;
import java.math.*;
import java.io.*;


public class NumericStringBaseConversion{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int i=Integer.valueOf(s);
		int k=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();

		int len=s.length();
        int sum=0;
        if(len<=k){
            String s1=Integer.toString(Integer.parseInt(s,b),10);
            int p=Integer.valueOf(s1);
            p=p%m;
            sum+=p;
        }
        else{
		int total=len-(k-1);
		int ar[]=new int[total];
		
		for(int j=0;j<total;j++){
			String s1=s.substring(j,j+k);
			s1=Integer.toString(Integer.parseInt(s1,b),10);

			ar[j]=Integer.valueOf(s1);
			ar[j]=ar[j]%m;
			sum+=ar[j];
		}
        }
		System.out.println(sum);
	

    }
}