import java.util.*;
import java.lang.*;
import java.io.*;

class FirstNonRepetingChar {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int len=sc.nextInt();
		    String s= sc.next();
		    char ch[]=s.toCharArray();

		    ArrayList<Character> al= new ArrayList<Character>(Chars.asList(ch));
		    
		    for(int i=0;i<len;i++){
		    	System.out.println("i=="+i);
		        char c= s.charAt(i);
		        Iterator it= al.iterator();
		        while(!it.hasNext()){
		        	if(it.next().equals('c')){
		        		it.remove();
		        	}
		        }


		        /*boolean flag= al.contains(c);
		        if(flag==false){
		            al.add(c);
		        }
		        else{
		            int index= al.indexOf(c);
		            al.remove(index);
		        }*/
		    }
		    
		      if(!al.isEmpty())
		    
		    System.out.println(al.get(0));
		    else{
		         System.out.println("-1");
		    }
		}
	}
}