// yatra question 1 
import java.util.*;
public class MinDeduction{
	public static void main(String[] args) {
		int ar[]={5,4,4,2,2,5};
		int a= getMinHigest(ar);
		System.out.println("the answer is a = "+a);
	}

	static int getMinHigest(int ar[]){
		int size = ar.length;
		Arrays.sort(ar);
		ArrayList<Integer> al= new ArrayList<Integer>();
		System.out.println("the ar is ");
		System.out.println("the ar size is "+ar.length);
		for (int p :ar ) {
			System.out.print(p+"  ");
		}
		System.out.println();

		
		int min=0;
		int q=0;

		while(q<=size-1 ){
			System.out.println("while loop  with q= "+q+"    the size is "+size);
				min=ar[q];
				System.out.println("min is "+min);
				int count=size-q;
		          al.add(count);
				for(int i=0;i<size;i++){
					if(ar[i]>0)
					ar[i]=ar[i]-min;
				}

				for(int j=q;j<size;j++){
					if(ar[j]>0) {
						q=j;
						break;
					}
				}

				if(q==size-1) break;
				System.out.println("while loop  with q= "+q+"    the size is "+size);
							//System.out.println("the ar is ");
							for (int p :ar ) {
						System.out.print(p+"  ");
					}
					System.out.println();

    	}
    		al.add(1);

    	System.out.println("the ArrayList is "+al);


		System.out.println("the ar is ");
		System.out.println("the ar size is "+ar.length);
		for (int p :ar ) {
			System.out.print(p+"  ");
		}
		System.out.println();
		return 1;
	}
}