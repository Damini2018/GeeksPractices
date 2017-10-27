import java.util.*;


public class PermutationWithRepetition{
	public static void main(String[] args) {
		String s="ABC";
		String s1="";
		permutation(s,s1);

	}

	static void permutation(String s,String s1){
		if(s.length()==s1.length()){
			System.out.print(s1+"  ");
			return;
		}
		for(int i=0;i<s.length();i++){
			permutation(s,s1+s.charAt(i));
				}
	}

}