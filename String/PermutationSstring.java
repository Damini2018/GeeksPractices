// with repetition only

public class PermutationSstring{
	public static void main(String[] args) {
		String s="MAA";
		int len=s.length()-1;
		//permutation(s,0,len);
		printPermutation(s,"");
	}

	/*static void permutation(String s,int i,int len){
		if(i==len){
			System.out.println(s);}
		else{
			for(int j=i;j<=len;j++){
				s=swap(s,i,j);
				permutation(s,i+1,len);
				s= swap(s,i,j);
			}
			
		}
	}

	static public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }*/

public  static void printPermutation(String string, String permutation) {
   
  if(string.length()==0){
   System.out.println(permutation);
   return;
  }
   
  for (int i = 0; i < string.length(); i++) {
   char toAppendToPermutation = string.charAt(i);
   String remaining = string.substring(0, i) + string.substring(i + 1);
    
   printPermutation( remaining,  permutation + toAppendToPermutation);
  }  
 }


}