import java.util.*;



public class FirstNonRepeatingCharacter{

	public static void main(String[] args) {
		String s= "hellohelloketty";
		int len=s.length();
		int [] count=new int[26];
		Arrays.fill(count,0);
		int result=Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			char c= s.charAt(i);
			c= Character.toUpperCase(c);
			//System.out.println("the char is "+c);
			int index= (int)c-65;
			//System.out.println("the char index is "+index);
			//count[index]+=1;
			if(count[index]==1 &&  result>i) {
				result=i; 
			System.out.println("the non cahr is "+s.charAt(result));}
		}

		System.out.println("the character is "+s.charAt(result));


	}
}