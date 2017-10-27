public class PrintDistinctCharacter{
  
public static void main(String[] args) {
	

  String s= "a geeks for  zzy geeks";
 String newS="";
	int ar[]=new int[52];
	for(int i=0;i<26;i++ ){
		ar[i]=0;
	}
	System.out.println("Array initialization done stirng length is  "+s.length());
	for(int i=0;i<s.length();i++){

		char c= s.charAt(i);
		System.out.println("char is = "+c +" its value in int is "+(int)c);
		
		if((int)c>64 && (int)c<91) {
			int index=(int)c-64-1;
			System.out.println("index is "+index);
			ar[index]+=1;
		}
		else if((int)c<123 && (int)c>96){ 
			int index=(int)c-96-1+26;
			System.out.println("index is "+index);
			ar[index]+=1;}
	}

System.out.println("Done till counting");
	

	for(int i=0;i<s.length();i++){

		char c= s.charAt(i);
		System.out.println("char is = "+c +" its value in int is "+(int)c);
		
		if((int)c>64 && (int)c<91) {
			int index=(int)c-64-1;
			if(ar[index]==1) newS=newS+c;
		}
		else if((int)c<123 && (int)c>96){ 
			int index=(int)c-96-1+26;
			
			if(ar[index]==1) newS=newS+c;
		}


   }
System.out.println(newS);
}
}
