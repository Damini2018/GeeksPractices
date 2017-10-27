//create maxHeap Tree first for all the roots
//then swap the root to the last index array
//then again heapify from root to last index



public class HeapSort{
	public static void main(String[] args) {
		int ar[]={64, 34, 25, 12, 22, 11, 90,20};
		int len=ar.length;
		buildHeap(ar,len);
		System.out.println("hello   ");
		for (int a :ar ) {
		System.out.print(a+"  ");			
		}
		System.out.println();
	}

	static void buildHeap(int ar[],int n){
		for (int i=(n/2)-1;i>=0 ;i-- ) {
			maxHeapify(ar,i,n);						// building the initial heap       bottom up approch
		}
		for(int i=n-1;i>=0;i--){
			ar=swap(ar,0,i);
			maxHeapify(ar,0,i-1);                    	// heapify one by one from top to bottom
		}
		
	 }
	

	static void maxHeapify(int ar[],int i,int n){
		
		int l=2*i+1;
		int r=2*i+2;
		int max=i;
		if(l<n && ar[l]>ar[max]){
			max=l;
		}
		if(r<n && ar[r]>ar[max]){
			max=r;
		}
		if(max!=i){
			ar =swap(ar,i,max);
			maxHeapify(ar,max,n);
		}

	}

	static int[] swap(int ar[],int i,int j){
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		return ar;
	}	
}