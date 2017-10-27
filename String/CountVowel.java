import java.util.*;
import java.lang.*;

public class CountVowel{
	public static void main(String[] args) {
		String s= "abc de";
		s=s.trim();
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++){
			
			char c=s.charAt(i);
			if(Character.isLetter(c)){
				if(checkVowel(c)){
				count++;
			}	
			}
			else continue;
			
		}

			System.out.println("the count  is "+count);
			

	}

	static boolean checkVowel(char c){
		
		c=Character.toUpperCase(c);

		
			 if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {return true;}
			 else return false;
	
    }
}