
// select the minimum from l to r and afetr getting it keeep it at position l
 //now again sart looking for the minimun from l+1 to r 


public class SelectionSort{
	public static void main(String[] args) {
		int [] ar={1,4,63,75,34,22};

		for(int i=0;i<ar.length;i++){
			int recent=i;
			for (int j=i+1;j<ar.length;j++) {
					if(ar[j]<ar[recent]){
						recent=j;
					}				
			}
			ar = swap(ar,i,recent);
		}

		for(int k:ar) System.out.print(k+"  ");
			System.out.println();
	}

	static int[] swap(int ar[],int i,int j){
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		return ar;
	}
}