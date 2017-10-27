import java.util.*;

public class CoinChangeAmerica{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int coin=sc.nextInt();
		int change[]=new int[coin+1];
		change[0]=0;
		change[1]=1;
		change[2]=2;

		for(int i=3;i<=coin;i++){
			change[i]=Math.max((change[i-1]+1),(change[i/2]+change[i/3]+change[i/4]));
		}
		System.out.println(change[coin]);
		System.out.println((int)'a');
	}
}