import java.util.*;
import java.lang.*;
import java.io.*;

class CountPalindrome {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s= sc.next();
		    Set<String> a= new HashSet<>();
		    
		    for(int i=0;i<s.length();i++){
		        for(int j=i;j<s.length();j++){
		            String s1=s.substring(i,j+1);
		            System.out.println("yes sending for checching  "+s1);
		            if(isPalindrome(s1))
		            {
		                System.out.println(s1+"  added");
		            a.add(s1);}
		        }
		    }
		    System.out.println(a.size());
		    System.out.println(a);
		    
		}
	}
	
	public static boolean isPalindrome(String s){
	   int k= s.length();
	   System.out.println("the string sended is "+s);
	    if(k==0 || k==1)
	        { return true;}
	    else if(s.charAt(0)==s.charAt(k-1)){
	        
	           String s2=s.substring(1,k-1);
	           System.out.println("yes equal "+s.charAt(0)+"  "+s.charAt(k-1)+"  and new stringg is "+s2);
	        return isPalindrome(s2);
	        
	    }
	        else{ return false;}
	    
	}
	
}