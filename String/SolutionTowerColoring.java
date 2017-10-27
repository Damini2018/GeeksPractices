import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class SolutionTowerColoring {

    static long towerColoring(int n){
        // Complete this function
        long a=(long)Math.pow(3,(double)n);
        
        long M= (long)Math.pow(10,9);
        M=M+7;
        a=a%(M-1);
        a= (long)Math.pow(3,a);
        a=a%M;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long result = towerColoring(n);
        System.out.println(result);
    }
}
