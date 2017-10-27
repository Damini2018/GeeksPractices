import java.io.*;
import java.util.*;

public class SolutionHourglass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        int [][] ar= new int[6][6];
        int max=-63;
       // System.out.println(max);
        int sum=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                ar[i][j]=sc.nextInt();
                
            }
            
        }
       // System.out.println(max);
        
        int x=3;
        int y=3;
        for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                   sum=0;
                System.out.println("the j is which is collom is = "+j);
                sum=ar[i][j]+ar[i][j+1]+ar[i][j+2];
                sum+=ar[i+1][j+1];
                
                System.out.println("the last term is ="+ar[i+2][j+2]);
                
                sum+=ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
               
                System.out.println("sum is "+sum);
               
                if(sum>max){ max=sum;
                System.out.println("shifting sum to max "+sum);
                                  }
            }
        }
        System.out.println(max);
    }
}