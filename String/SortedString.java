import java.util.*;
public class SortedString{
 public static void main(String[] args) {
 	String s="hello dolly star plus";
 	String sr[]= s.split(" ");
    Arrays.sort(sr);
     for(String sd:sr){
     	System.out.print(sd+" ");
     }

 }
}