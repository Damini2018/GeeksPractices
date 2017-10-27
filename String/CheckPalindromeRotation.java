import java.util.*;

public class CheckPalindromeRotation{
	public static void main(String[] args) {
		String s="aabi";
		int len=s.length();
		s=s+s;
		String check="Change me";
		System.out.println("system with replacemet demo of character "+check.replace('m','M'));
		check=check.replace('m','M');

		String checkNew= check.concat("Hello");
		System.out.println(check);
		System.out.println(checkNew);
		for(int i=0;i<len;i++){
			String sub=s.substring(i,i+len);
			if(checkPalindrome(sub))
			{
				System.out.println("yes palindrome");
				break;
			}
		}


		Integer inte= Integer.valueOf("10");
		System.out.println("The integer value is "+inte);

		String line = "444";
		int size = -1;
		size = Integer.valueOf(line, 16);
		System.out.println("Sze is "+size);

		StringBuffer strBfr= new StringBuffer();
		System.out.println("String buffer size is "+strBfr.length());
		System.out.println("Str Buffer capacity is "+strBfr.capacity());

		strBfr.append("hello daminee sao ");
		System.out.println("String buffer size is "+strBfr.length());
		System.out.println("Str Buffer capacity is "+strBfr.capacity());

		Object obj[]={1,2,3,"mini",strBfr};
		System.out.println("Object element at 4 is obj "+obj[4]);
	}

	static boolean checkPalindrome(String s ){
		int h=0;
		int l=s.length()-1;
		while(h<l){
			if(s.charAt(h++)!=s.charAt(l--)){
				return false;
			}
		}
		return true;

	}
}