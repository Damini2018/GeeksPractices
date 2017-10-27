import java.util.*;

public class Telstra{
	public static void main(String[] args) {
		int ar[]={2,3,4,10,5,9};
		int len=ar.length;

		int diff=findMaxDiff(ar);
		System.out.println(diff);
		

		/*System.out.println("before array remove");
		for(int i:ar){
			System.out.print(i+" ");
		}
		//ar= ArrayUtils.removeElemnet(ar,10);
		System.out.println("after array remove");
		for(int i:ar){
			System.out.print(i+" ");
		}*/
		int  ar1[]={1,2,4,5,3,2};
		//List<Integer> list= Arrays.asList(ar);

		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(ar1));
		for(int i:al){
			System.out.print(i+"  ");
		}
		System.out.println();
	}

	static int findMaxDiff(int a[]){
		int len=a.length;
		int ar[]=new int[len];
		int min=a[0];
		ar[0]=min;
		int max=0;
		for(int i=1;i<len;i++){
			if(a[i]<min) {
				System.out.print("a[i] is min "+a[i]+"  min is  "+min);
			 ar[i]=a[i];}
			 else{
			 	ar[i]=min;
			 }

		}
		for(int ph:ar){
			System.out.print(ph+"  ");
		}
		System.out.println();
		for(int j=0;j<len;j++){
			int p=a[j]-ar[j];
			if(max<p) max=p;
		}
		return max;
	}
}