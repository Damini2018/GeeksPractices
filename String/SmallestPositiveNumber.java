import java.util.*;


public class SmallestPositiveNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int ar[]=new int[n];
			int max=0;
			for (int k=0;k<n;k++ ) {
				ar[k]=sc.nextInt();
				if(max<ar[k]) max=ar[k];				
			}
			int key=1;
			while(key<=max){
				
				if(contains(ar,key)){
					key++;
				}
				else{
					break;
					
				}
			}
			if(key==max){
				key++;
			}
			System.out.println(key);
		}
	}

	static boolean contains(int [] ar, int key){
		for(int p:ar){
			if(p==key){
			return 	true;
			}
		}
		return false;
	}
}