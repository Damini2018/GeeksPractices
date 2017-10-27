import java.util.*;

public class UglyNumber{
	public static void main(String[] args) {
	 UglyNumber ugn=new UglyNumber();
	 System.out.println(ugn.NthUglyNumber(150));

	}

	int NthUglyNumber(int n){
		int ugly[]=new int[n];
		int i2=1,i3=1,i5=1;
		int mul2=2,	mul3=3,mul5=5;
		
		int nextugly=1;
		int i=1;
		ugly[0]=1;
		for(i=1;i<n;i++){
			System.out.println("the multiples are "+mul2+" "+mul3+" "+mul5);
			nextugly=Math.min(mul2,Math.min(mul3,mul5));
			ugly[i]=nextugly;
			System.out.println("next Ugly number is "+nextugly);
			if(nextugly==mul2){
				i2+=1;
				mul2=ugly[i2]*2;
			}
			if(nextugly==mul3){
				i3+=1;
				mul3=ugly[i3]*3;
			}
			if(nextugly==mul5){
				i5+=1;
				mul5=ugly[i5]*5;
			}

			

		}

		return nextugly;
	}
}