import java.util.Arrays;

public class FindDuplicateCharacter{
	public static void main(String[] args) {
		String s ="daminee";
		char [] ch=s.toCharArray();
		Arrays.sort(ch); 
		boolean flag=false;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]!=ch[i+1])
				{ flag=true;
					continue;}
			else {flag=false; break;}

		}

		if(flag) System.out.println("the string has unique character");
		else System.out.println("the string is having common character");

		float base = 17;
		float height = (200/base);
		System.out.println(height);
	}
}

