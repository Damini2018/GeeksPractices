
import java.util.*;

public class ROT13{
	public static void main(String[] args) {
		   long millis = System.currentTimeMillis() ;
		String s="GEEKS FOR GEEKS";
		int len=s.length();
		//System.out.println("the length is "+len);
		String cs="";
		for(int a=0;a<len;a++){
			char c= s.charAt(a);
			//System.out.println("the char is original "+c);
			if((int)c>64 && (int)c<78){
				
				int p=(int)c+13;

				cs+=(char)p;
				//System.out.println("the char is "+(char)p);
			}
			else if((int)c>77 && (int)c<91){
				
				int p=(int)c-13;
				cs+=(char)p;
			   // System.out.println("the char is "+(char)p);
			}
			else 
				cs+=" ";
			
		}
		System.out.println(cs);
		  long millis2 = System.currentTimeMillis() ;
		  long actual=millis2-millis;
		  System.out.println("time taken is "+actual);
	}

}