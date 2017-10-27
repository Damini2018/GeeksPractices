public class ActivitySelection{
	public static void main(String[] args) {
		 int s[] =  {1, 3, 0, 5, 8, 5};
	     int f[] =  {2, 4, 6, 7, 9, 9};
	     int n = s.length;
    	getMaxActivity(s,f,n);
	}

	public static  void getMaxActivity(int[] s,int f[],int n){
		
		int  j=0;
		int count=1;
		System.out.println(j+" " +s[j]+"  ");
		for(int i=1;i<n;i++){
			if(s[i]>=f[j]){
			System.out.println(i+" " +s[i]+"  ");
			j=i;
			count++;
		}
		}
		System.out.println();
		System.out.println("count is "+count);
	}
}