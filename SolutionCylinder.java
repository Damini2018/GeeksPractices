import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int sum1=0;
        int n2 = in.nextInt();
        int sum2=0;
        int n3 = in.nextInt();
        int sum3=0;
        int sum=0;
        int h1[] = new int[n1];
        int h1s[]=new int[n1];
        System.out.println();
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1=sum1+h1[h1_i];
            h1s[h1_i]=sum1;
            System.out.print(h1s[h1_i]+" ");
        }
        System.out.println();
        int h2[] = new int[n2];
         int h2s[]=new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2=sum2+h2[h2_i];
            h2s[h2_i]=sum2;
             System.out.print(h2s[h2_i]+" ");
        }
        System.out.println();
        int h3[] = new int[n3];
         int h3s[]=new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3=sum3+h3[h3_i];
            h3s[h3_i]=sum3;
             System.out.print(h3s[h3_i]+" ");
        }
        System.out.println();
        n1=n1-1;
        n2=n2-1;n3=n3-1;
        System.out.println("Taken input");
        while(h1s[n1]!=h2s[n2]  || h2s[n2]!=h3s[n3]){
            System.out.println("in while loop");
            System.out.println("n1 = "+n1+" n2= "+n2+" n3= "+n3);
            if((h1s[n1]> h2s[n2] || h1s[n1]>h3s[n3] )  && n1>0)  {
                            n1--; System.out.println("1st  s1 ="+h1s[n1]+" s2 ="+h2s[n2]+" s3 ="+h3s[n3]);}
           else if ((h2s[n2]>h1s[n1] || h2s[n2]>h3s[n3] ) && n2>0 ){
                    n2--;
                System.out.println("2nd   s1 ="+h1s[n1]+" s2 ="+h2s[n2]+" s3 ="+h3s[n3]);}
           else  if((h3s[n3]>h1s[n1] || h3s[n3]>h2s[n2]) && n3>0  ) {
                n3--; System.out.println("3rd   s1 ="+h1s[n1]+" s2 ="+h2s[n2]+" s3 ="+h3s[n3]);}
              else {h1s[n1]=0; System.out.println("in the breaking condition"); break;  }
        }
        System.out.println(h1s[n1]);
            
    }
}
