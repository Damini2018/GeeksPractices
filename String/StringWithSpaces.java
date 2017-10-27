import java.util.*;
public class StringWithSpaces{
	public static void main(String[] args) {
		String s="Geeks For Geeks";
		int len=s.length();
		s=s.trim();
		String s1="";
		s1+=s.charAt(0);

		
		for (int k=1;k<len ;k++ ) {
			char c= s.charAt(k);
			if(c==' '){
				while(c==' '){

					k++;
					c=s.charAt(k);
				}
				s1+=s.charAt(k);
			}
		}
		System.out.println(s1);

	}
}