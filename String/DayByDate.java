import java.util.*;
import java.io.*;



public class DayByDate{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		String[] weekday={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] montharray={0,3,2,5,0,3,5,1,4,6,2,4};
		for(int i=0;i<t;i++){
			int date=sc.nextInt();
			int month=sc.nextInt();
			int year=sc.nextInt();
		if(month<3) year--;

			
		int result=year+year/4-year/100+year/400+date+montharray[month-1];
		result=result%7;


		System.out.println(weekday[result]);
			
				
		}		
}
}
