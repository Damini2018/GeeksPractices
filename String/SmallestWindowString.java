import java.util.*;
import java.lang.*;

public class SmallestWindowString{
	public static void main(String[] args) {
		String s="aabcbcdbca";
		int len=s.length();
		boolean ar[]=new boolean[256];
		Arrays.fill(ar,false);
		int disc_count=0;
		for(int i=0;i<len;i++){
			if(ar[s.charAt(i)]==false){
				ar[s.charAt(i)]=true;
				disc_count++;
			}
		}

		int start=0;int window_len=len; int start_index=-1;
		int count=0; int min_length=Integer.MAX_VALUE;
		int[] curr=new int[256];
		Arrays.fill(curr,0);
		for(int k=0;k<len;k++){
			curr[s.charAt(k)]++;
			if(curr[s.charAt(k)]==1) count++;
			if(count==disc_count){
				while(curr[s.charAt(k)]>1){
					if(curr[s.charAt(k)]>1) curr[s.charAt(k)]--;
					start++;
				}

				window_len=k-start+1;
				if(min_length>window_len) {min_length=window_len;
					start_index=start;
				}
			}

		}
		//System.out.println("the start and min window length is = "+start_index+"   "+min_length);
		
		System.out.println(s.substring(start_index,(start_index+ min_length)));
		
	}
}