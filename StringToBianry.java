import java.util.*;
import java.lang.*;

public class StringToBianry{
	public static void main(String[] args) {
		String s= "1010";
		if(s.length()%2!=0) s="0"+s;
		int a= Integer.parseInt(s,4);
		if(a%11=0) System.out.println("yes");
		else
			System.out.println("No");
	}
}