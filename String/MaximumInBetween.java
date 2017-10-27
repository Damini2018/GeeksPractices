import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumInBetween {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int []ar=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    int x=-1;
		    for(int i=0;i<n;i++)
		    {
		        if(findx(i,ar))
		        {x=ar[i];
		        break;
		        }
		    }
		    System.out.println(x);
		}
	}
	static boolean findx(int i,int[] ar)
	{
	   int j=0;
	   int c=0;
	   while(j<i)
	   {
	       if(ar[j]<=ar[i])
	       {c++;}
	       else return false;
	       j++;
	   }
	   
	   j++;
	   int d=0;
	   while(j<ar.length)
	   {
	       
	       if(ar[j]>=ar[i])
	       {d++;}
	       else return false;
	       j++;
	   }
	   if(c>0&&d>0)
	   return true;
	  else return false;  
	}
}