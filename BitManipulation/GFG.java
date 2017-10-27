import java.util.*;

public class GFG{
    
    public static void main(String ar[]){
    Scanner sc =new Scanner(System.in);
    int m=sc.nextInt();
    int n= sc.nextInt();
        String s="";
        for(int i=0;i<n;i++){
        s=s+"1";
        }
        
        for(int i=0;i<m;i++){
        s=s+"0";
        }
    
    int number= Integer.parseInt(s,2);
    System.out.println(number);

    
}

}