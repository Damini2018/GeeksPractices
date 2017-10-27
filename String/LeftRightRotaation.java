import java.util.*;

public class LeftRightRotaation{
	public static void main(String[] args) {
		String s= "geeksforgeeks";
		int n=2;

		String left=s.substring(n,s.length())+s.substring(0,n);
		System.out.println(left);
		String right=s.substring((s.length()-n),s.length())+s.substring(0,(s.length()-n));
		System.out.println(right);
	}
}
