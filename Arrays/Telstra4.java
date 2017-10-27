import java.util.*;

public class Telstra4{
	public static void main(String[] args) {
		
	
	int a[]={1,3,4,5,4,1};
	int b[]={1,2,3,4,10,4};
	String s="Odd";
	String res=findMax(a,b,s);
	System.out.println("the res is "+res);
  }

  static String findMax(int a[],int b[],String s){
  	int len= a.length;
  	int r=0;
  	if(s=="Odd") r=len/2;
  	else{
  		r=len/2;
  		r++;
  	}
  	int ar[]=new int[r];
  	if(s=="Odd") ar[0]=1;
  	else ar[0]=0;

  	for(int j=1;j<r;j++){
  		ar[j]=ar[j-1]+2;
  	}

  	int am=0;
  	int bm=0;
  	for(int i=0;i<r;i++){
  			am+=a[ar[i]]-b[ar[i]];
  			bm+=b[ar[i]]-a[ar[i]];
  	}
  	if(am<bm) return "b";
  	else if(bm<am) return "a";
  	else return "Tie";

  }
}