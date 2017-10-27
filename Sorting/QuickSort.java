// iterative method




public class QuickSort{
	public static void main(String[] args) {
		int ar[]={64, 34, 25, 12, 22, 11, 90,20};
		int len=ar.length;
		sort(ar,0,len-1);

		for (int a :ar ) {
			System.out.print(a+"   ");			
		}

		String binaryIntInStr = Integer.toBinaryString(11);
		int count = Integer.bitCount(11);
		System.out.println("the string representation is "+binaryIntInStr+"   and bit count is "+count);
	}


	static void sort(int ar[],int low,int high ){
		System.out.println("in sorting ");
		if(low<high){
		int pivot=partition(ar,low,high);
		
		
		sort(ar,low,pivot-1);
		sort(ar,pivot+1,high);
	}
	}

	static int partition(int ar[],int l,int r){
		int mid=(l+r)/2;
		swap(ar,mid,r);
		int j=l-1;
		int i=l;
		int pivot =ar[r];
		System.out.println("pivot is "+pivot);
		for(i=l;i<r-1;i++){
			if(ar[i]<pivot){
				j++;
				if(i!=j)
				swap(ar,i,j);
			}
		}
		j++;
		swap(ar,j,r);

		System.out.println("Pivot position is "+j);
		return j;
	}
		
	

	static void swap(int ar[],int i,int j){
		System.out.println("swapping "+ar[i]+"  &&  "+ar[j]);
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		for (int p :ar ) {
			System.out.print(p+"  ");			
		}
		System.out.println();
		//return ar;
	}

}