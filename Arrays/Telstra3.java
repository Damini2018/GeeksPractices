import java.util.*;

public class Telstra3{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int r[]={0,2};
		int res[]= findMaxRot(a,r);
		for (int k :res ) {
			System.out.print(k+"  ");
		}
	}

	static int[] findMaxRot(int a[],int b[]){
		int al=a.length;
		int rl=b.length;
		int max=0;
		int max_index=-1;
		for(int i=0;i<al;i++){
			if(a[i]>max) max_index=i;
		}
		int res[]=new int[rl];
		int index=0;
		for(int p=0;p<rl;p++){
			index=b[p]%al;
			index=max_index-index+al;
			index=index%al;
			res[p]=index;
		}

		return res;

	}

}