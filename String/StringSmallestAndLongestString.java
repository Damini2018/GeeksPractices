import java.util.*;

public class StringSmallestAndLongestString{
	public static void main(String[] args) {
		String s="My name is damainee";
		String s1= "Daminee is";
		String[] arr= s.split(" ");
		int min=100;
		int max=0;
		String minW=""; 
		String maxW="";
		for(String i:arr) {
			int len=i.length();
			if(len>max) {
				max=len;
				maxW=i;
			}
			if(len<min){
				min=len;
				minW=i;
			}

		}
		System.out.println("smallest word = "+minW);
		System.out.println("Longest word = "+maxW);
	}
}
