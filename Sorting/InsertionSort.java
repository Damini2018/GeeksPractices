public class InsertionSort{
	public static void main(String[] args) {
		int ar[]={64, 34, 25, 12, 22, 11, 90};
		int len=ar.length;
		for (int i=1;i<len ;i++ ) {
			for (int j=i;j>0 ; j--) {
				if(ar[j]<ar[j-1]){
					swap(ar,j,j-1);
				}				
			}

		}
		for (int a :ar ) {
			System.out.print(a+ "   ");			
		}
	}

	static int[] swap(int ar[],int i,int j){
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		return ar;
	}
}