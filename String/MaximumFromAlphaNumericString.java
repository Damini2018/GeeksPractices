import java.util.*;
import java.lang.*;
public class MaximumFromAlphaNumericString{
	public static void main(String[] args) {
  		Scanner sc= new Scanner(System.in);
  		int t= sc.nextInt();
  		for(int i=0;i<t;i++){
  			String s=sc.next();
  			int len=s.length();
  			int max=0;
  			String s1="";
  		
  			for(int k=0;k<len;k++){

  				char c=s.charAt(k);
  			
  				if(c>='0' && c<='9'){

  					s1=s1+c;
  					if(max<Integer.parseInt(s1)){
  						max=Integer.parseInt(s1);
  					}
  					continue;
  				}
  				else{
  					s1="";
  				}

  			}

  			System.out.println(max);


  		}		
	}
}