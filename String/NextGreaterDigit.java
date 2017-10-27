import java.util.*;

public class NextGreaterDigit{
	public static void main(String[] args) {
		String s="111000011100111110";
		int i=0;
		int count=0;
		while(i<s.length()){
			System.out.println("the character is "+s.charAt(i)+"   "+ s.charAt(i+1));
			if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){ System.out.println("when if is true i is ="+i);
				break;} 
			else i++;
		}
		//System.out.println("substring from 0 to 2 ="+s.substring(0,i+1));
		System.out.println("from 0 to 1 "+s.substring(0,i)+" 2 to 3 "+s.substring(i+1,i+2)+" 1 to 2 is "+s.substring(i,i+1)+" 3 to last "+s.substring(i+2,s.length()));
		s=s.substring(0,i)+s.substring(i+1,i+2)+s.substring(i,i+1)+s.substring(i+2,s.length());
		


		
		//System.out.println("i is "+i);
		i=i+2;
		System.out.println("i is "+i);
		for(int j=i;j<s.length();j++){
			System.out.println(" couting ");
			if(s.charAt(j)=='1') count++;
		}
		System.out.println("countng finished  count ="+count);
		//count 1
		//for(int k=i;k<length;k++) if(s.charAt(k)=='1')
		int zeros=s.length()-(count);
		System.out.println("i is "+i);
		System.out.println("zeros is "+zeros);
		s=s.substring(0,i);
		System.out.println("substring "+s);
		for(int kd=i;kd<zeros;kd++) {
			System.out.println("adding 0 at the end "+(zeros-i)+"times");
			s+='0';}
		 
	 	while(count>0) {s+='1';
	 	count--;}

				System.out.println(s);
	}
}
