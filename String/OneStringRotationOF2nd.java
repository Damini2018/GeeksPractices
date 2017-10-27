import java.util.*;


public class OneStringRotationOF2nd{
	public static void main(String[] args) {
		String  str1 = "ABACDE",
                     str2 = "CDABA";

           if(str1.length()==str2.length() && ((str1+str2).indexOf(str2))>-1){
           	System.out.println("yes both are rotation of each other");
           }   
           else
           System.out.println("not raotation of each other");       
	}
}