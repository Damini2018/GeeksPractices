/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/
import java.io.*;
import java.util.*;

class MaximumWindow1or0
{
    /*You are required to complete this method*/ 
   static int maxLen(int[] arr) 
    {
         // Your code here
         int victim=0;
         int count0=0;
         int count1=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==0) count0++;
             if(arr[i]==1) count1++;
             
             
         }
         System.out.println("the 0 count is "+count0+"  \n the 1 count is "+count1);
         victim=(count0>count1)? 0:1;
         System.out.println("the victim is "+victim);
         int i=0;
         int j=arr.length-1;
         int diff=Math.abs(count0-count1);
         System.out.println("the DIfferenceis "+diff);
         for(int k=0;k<arr.length;k++){
             if(diff==0 ){
                 System.out.println("DIfference is 0");
                 if(i>j)
                 return 0;
                 else{
                    System.out.println("the i ="+i+"  the j ="+j);
                 return Math.abs(j-i+1);}
             }
             if(arr[i]==victim){
                i++;
                duff--;
                System.out.println("increasing i "+i+"  diff="+diff );
                 //i++;
                 //diff--;
             }
             else if(arr[j]==victim){
                 j--;
                 System.out.println("Decreasing j "+j);
                 diff--;
             }
             
             
         }
         return j-i+1;
         
    }

    public static void main(String[] args) {
        int arr[]=new int[85];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<85;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the result is "+maxLen(arr));
        //maxLen(arr);
    }
}


//    1 1 0 1 0 0 0 0 1 0 0 0 0 1 1 0 0 0 1 1 1 0 1 0 0 0 1 0 0 1 1 1 0 1 0 1 1 1 1 1 1 1 1 1 1 0 1 1 0 1 0 1 1 0 0 1 0 1 1 1 0 0 0 1 0 1 0 1 0 1 0 1 1 1 1 0 0 0 1 0 1 0 0 0 0 