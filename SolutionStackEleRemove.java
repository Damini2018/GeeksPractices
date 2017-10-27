import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionStackEleRemove {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
       // System.out.println("g ="+g);
        Stack s1=new Stack();
        Stack s2= new Stack();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();

            // System.out.println("n = "+n);
              //System.out.println("m= "+m);
               //System.out.println("x= "+x);

            int[] a = new int[n];
            for(int a_i=n-1; a_i >=0; a_i--){
                a[a_i] = in.nextInt();
              // System.out.print(a[a_i]+"  ");
                  
            }
            //System.out.println();
            int[] b = new int[m];
           
            for(int b_i=m-1; b_i >=0; b_i--){
                b[b_i] = in.nextInt();
              // System.out.print(b[b_i]+"  ");
            }
            
         //  System.out.println();
            
            for(int a_i=0;a_i<n;a_i++){
                 s1.push(new Node(a[a_i]));
                 //System.out.println("new top is "+s1.peek().data);
            }
            
             for(int b_i=0;b_i<m;b_i++){
                 s2.push(new Node(b[b_i]));
                // System.out.println("new top is "+s2.peek().data);
            }
           /* System.out.println("before while loop ");
            System.out.println("new top is for s1 "+s1.peek().data);
            System.out.println("new top is for s2  "+s2.peek().data);*/
            int sum=0;
            int count=0;
            while(sum<x  && s1.peek()!=null && s2.peek()!=null) 
                { System.out.println("in the while loop with count "+count);
           // System.out.println("new top is for s1 "+s1.peek().data);
            //System.out.println("new top is for s2  "+s2.peek().data);

            if(s1.peek()!=null && s2.peek()!=null){

                 if((s1.peek().data<s2.peek().data) )  {
                    System.out.println("this is creating problem 1st");
                    sum=sum+s1.peek().data;
                                                   s1.pop();
                    System.out.println("new top is for s1 "+s1.peek().data);
                }
                else  {sum=sum+s2.peek().data; 
                       s2.pop();
                       System.out.println("this is creating problem 2nd " );
                       System.out.println("new top is  for s2 "+s2.peek().data);
                       }
            }

            else if(s1.peek()!=null){
                sum=sum+s1.peek().data;
             s1.pop();
            }

             else if(s2.peek()!=null){
                sum=sum+s2.peek().data;
             s2.pop();
            }

             System.out.println("the sum is "+sum);
                     if(sum<=x)  {
                       
                        count++;
                        System.out.println("Hence increasing the count "+count);}  
            
              
        }
         System.out.println(count);

       }
    }

}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node top=null ;
  
    boolean isEmpty(){
        return (top==null);
    }
    
    
    
    void push(Node n){
        if(top==null) {top=n;
           }
        else{
            Node temp=n;
            
            temp.next=top;
            top=temp;
        }
    }
    
    int pop(){
        int a=0;
        if(isEmpty()){
            return a ;
        }
        else{

            a=top.data;
            System.out.println("popin hence giving data  "+a);
            top=top.next;
        }
        return a;
    }

    Node peek(){
        return top;
    }
}
