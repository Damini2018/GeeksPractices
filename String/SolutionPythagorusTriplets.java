import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionPythagorusTriplets {

    static long[] pythagoreanTriple(int a){
        // Complete this function
        long[] p=new long[3];
        long b=(long)a;
       

        if(b%2==0){
            p[0]=b;
            b=b/2;
            b=b*b;
            p[1]=b-1;
            p[2]=b+1;
        }
        else{
            p[0]=b;
            b=b*b;
            b=b-1;
            b=b/2;
            p[1]=b;
            p[2]=b+1;

        }
         return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long[] triple = pythagoreanTriple(a);
        for (int i = 0; i < triple.length; i++) {
            System.out.print(triple[i] + (i != triple.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
