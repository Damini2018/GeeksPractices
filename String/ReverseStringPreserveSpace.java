import java.util.*;
public class ReverseStringPreserveSpace{
	public static void main(String[] args) {
		String s= "Help others";
		int len=s.length();
		List<Integer> li= new ArrayList<Integer>();
		
		char ar[]= new char[len];

		for(int i=0;i<len;i++){
			char c= s.charAt(i);
			if(c==' ') {
				ar[i]=' ';
			}
		}

		for (int k=len-1;k>-1 ;k-- ) { 
			char c= s.charAt(k);
			int p=len-1-k;
			
			if(c==' ' &&  ar[p]==' '){
				k--;
				p++;
			}
			else if(c==' '){
				k--;}

			else if(ar[p]==' '){ p++; ar[p]=c;}
			else{ar[p]=c;}


			

		}

	String s1= Arrays.toString(ar);
	System.out.println(s1);		

	}
}
