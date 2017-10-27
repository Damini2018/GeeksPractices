import java.util.*;



public class UnionAndIntersectionOfTtwoSortedArrays {
 public static void main(String[] args) {
  int arr1[] = {10, 15, 22, 80};
  int arr2[] = {5, 10, 11, 22, 70, 90};
  int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3,10};
  /*int max_sum =*/ maxSubAry(a, a.length); 
 // unionAndIntersectionOfTtwoSortedArrays(arr1, arr2);
 }


 
/*public static int maxSubArraySum(int a[], int size)
{
   int max_so_far = a[0];
   int curr_max = a[0];
    int start=0;
    int end=0;
   for (int i = 1; i < size; i++)
   {    int pre_curr=curr_max;
        int pre_max=max_so_far;
        curr_max = Math.max(a[i], curr_max+a[i]);
        if(pre_curr==a[i]){
          start=i;
        }
        max_so_far = Math.max(max_so_far, curr_max);

        if(pre_max!=max_so_far){
          end=i;
        }
   }

   System.out.println("start = "+start+"    end = "+end+"       max so far = "+max_so_far);
   return max_so_far;
}*/
 
public static void maxSubAry(int ar[],int size){
    int n=size;
    int max1=0, max=Integer.MIN_VALUE;
    int st=0;
    int end=0;
   for(int k=0;k<n;k++){
           max1=max1+ar[k];
           if(max1<0){max1=0;
            st=k+1;
           }
           else if(max<max1){
               max=max1;
               end=k;
           }
       }
       
       System.out.println(max+ "   " +st+"  "+end);
    }
}


  
 /*private static void unionAndIntersectionOfTtwoSortedArrays(int[] arr1, int[] arr2){
  String union = "";
  String intersection = "";
   
  int i=0; int j=0;
  while(i < arr1.length && j < arr2.length) {
   if(arr1[i] == arr2[j]){
    union += arr1[i] + " ";
    intersection += arr1[i] + " ";
     
    i++; j++;
   }else if(arr1[i] < arr2[j]){
    union += arr1[i] + " ";
    i++;
   }else{
    union += arr2[j] + " ";
    j++;
   }
  }
   
  if(i < arr1.length){
   union += arr1[i];
  }
    
  if(j < arr2.length) {
   union += arr2[j];
  }
   
  System.out.println("union :"+union);
  System.out.println("intersection :"+intersection);
 }
}*/