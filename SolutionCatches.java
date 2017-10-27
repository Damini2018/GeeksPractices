import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCatches {

   static void whoGetsTheCatch(int n, int x, int[] X, int[] V){
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int min=Integer.MAX_VALUE;
        int index=-1;
        int[] X = new int[n];
        //System.out.println();
        //System.out.println("Succesfull till taken the inputs n x "+n+","+x);
        for(int X_i=0; X_i < n; X_i++){
          int dis = in.nextInt();

              X[X_i]=Math.abs(x-dis);
               //System.out.println("taking inputs all  X[X_i]="+Math.abs(x-dis));
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            int val=in.nextInt();
            //System.out.println("taking input speeds  as v = "+val+"  and calculating the time");
            V[V_i] =X[V_i]/val;
            //System.out.println("V[V_i] = "+V[V_i]);
            
        
            if(min> V[V_i]) {min= V[V_i];
                            index=V_i;}
                            else if(min== V[V_i]) index=-1;
        }
        Arrays.sort(V);
        for(int k=0;k<n-2;k++){
            int diff=V[k]-V[k+1];
            if(diff==0){
               // System.out.println("diffe is 0");
                //System.out.println(V[k]+"-"+V[k+1]);
                index=-1;

            }
        }
        
       // int result = whoGetsTheCatch(n, x, X, V);
        System.out.print("result is     " );
        System.out.println(index);
    }
}
