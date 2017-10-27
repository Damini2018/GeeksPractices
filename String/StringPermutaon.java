public class StringPermutaon{
public static void main(String[] args) {
	String s="ybghjhbuytb";
	int ar[]=new int[26];
	for(int i=0;i<26;i++ ){
		ar[i]=0;
	}
	int count=0;
	for(int i=0;i<s.length();i++){
		int a= (int)s.charAt(i)-97;
		 ar[a]+=1;
		 
		
	}
	int result=factorial(s.length());
	for(int i=0;i<26;i++ ){
		if(ar[i]!=0)
		result=result/factorial(ar[i]);
	}
  System.out.println(result);


}

static int factorial(int a){
	if(a<=1) return 1;
	else{
		a=a*factorial(a-1);
	}
	return a;
}

}