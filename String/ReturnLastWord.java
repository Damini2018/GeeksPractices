import java.lang.*;
import java.util.*;


public class ReturnLastWord{
	public static void main(String[] args) {
		String s="hello world ";
		s=s.trim();
		int len=s.length();
		int p=0;
		char c=s.charAt(len-1);
		
		while( Character.isLetter(c))  {
			
			++p;
			c=s.charAt(len-1-p);
		}

		System.out.println("Length "+p);


	}
}
