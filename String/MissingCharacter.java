import java.util.*;
public class MissingCharacter{
	public static void main(String[] args) {
		String s= "The quick brown fox jumps";
		boolean bl[]=new boolean[26];
		Arrays.fill(bl,false);

		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(c!=' '){
			c=Character.toLowerCase(c);
			

			int index=(int)c-97;
			if(bl[index]==false) bl[index]=true; 
		}else continue; 

		}
		for(int  i=0;i<26;i++){
			if(bl[i]==false)
			{ int index= i+97;
			System.out.print((char)index);
		}
		}

	}
}