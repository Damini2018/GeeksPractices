 
import java.lang.*;
  import java.util.*;

class SeacrhInRotatedAndSorted
{
    // Returns index of key in arr[l..h] 
    // if key is present, otherwise returns -1
    static int search(int arr[], int l, int h, int key)
    {
        System.out.println("the arr[l] and arr[h] is   "+arr[l]+"  "+arr[h]);
        if (l > h) 
            return -1;
       
        int mid = (l+h)/2;
        if (arr[mid] == key)
            return mid;
       
       else if(arr[mid] > key && key>arr[l])
       {

        System.out.println("Key is in between the left side key is "+key+"   and mid is "+arr[mid]);
         return search(arr, l, mid-1, key);
       }
     else{
         return search(arr, mid+1, h, key);
     }
        
    }

   // ArrayList<Integer>
   
    //main function
    public static void main(String args[])
    {
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;

        int i = search(arr, 0, n-1, key);
        /* Integer arr1[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        

        int i = search(arr, 0, n-1, key);
        ArrayList<Integer> arlist= new ArrayList<Integer>(Arrays.asList(arr1));


        Integer[] intArray = {1, 2, 3, 42}; // cannot use int[] here
        List<Integer> intList = Arrays.asList(intArray);

        int[] intArray1 = { 1, 2, 3, 4, 5 };
        int[] removed = ArrayUtils.remove(intArray1, 3);//create a new array
        System.out.println(Arrays.toString(intArray1));*/
        //System.out.println(Arrays.toString(ArrayUtils.reverse(intArray1)));
        if (i != -1) 
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");



        int flag= Arrays.binarySearch(arr,5);
        System.out.println("flag is "+flag);

        int [] newArr= new int[5];
        System.arraycopy(arr,2,newArr,2,3);
        for(int p:newArr)
            System.out.print(p+"  ");
        System.out.println();


        if(Arrays.equals(arr,newArr))
            System.out.print("yes equals");
        else System.out.println("not equals");
    }
}
