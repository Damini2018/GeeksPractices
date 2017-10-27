import java.io.*;
import java.util.*;

public class SolutionAlgorithmicCrush {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int ar[]=new int[N];
       System.out.println("the element in array is "+ar[0]+" "+ar[1]);
        int q=sc.nextInt();
        int max=0;
        while(q-->0){
             System.out.println(" max is "+max);
            int i=sc.nextInt();
            System.out.println(" start is "+i);
            int  j=sc.nextInt();
             System.out.println(" end  is "+j);
            int sum=sc.nextInt();
            System.out.println("sum is "+sum);
            for(int k=i-1;k<j;k++){
                ar[k]+=sum;
                if(ar[k]>max) max=ar[k];
                System.out.println("ar["+k+"] is "+ar[k]);
            }
        }
        System.out.println();
        System.out.println(max);
        
    }
}