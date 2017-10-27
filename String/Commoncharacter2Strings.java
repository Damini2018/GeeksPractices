import java.util.*;
public class Commoncharacter2Strings{
	 public static void main(String[] args) {
	String s1 = "geeksforgeeks", s2 = "practiceforgeeks";
	 char a1[]=s1.toCharArray();
	 char a2[]=s2.toCharArray();
	 Arrays.sort(a1);
	 Arrays.sort(a2);
	  int s1i=0;
	  int s2i=0;
	  while(s1i<a1.length && s2i<a2.length){
	  	if(a1[s1i]==a2[s2i]){
	  		System.out.print(a1[s1i]);
	  		s1i++;
	  		s2i++;
	  		}
	  	else if((int)a1[s1i]>(int) a2[s2i]){
	  		s2i++;
	  	}	
	  	else {
	  		s1i++;
	  	}
	  }
	  System.out.println();
	 }
}