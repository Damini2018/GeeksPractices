import java.io.*;
import java.util.*;

public class SolutionStack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack sk=new Stack();
        Scanner sc= new Scanner(System.in);
        int maxi=Integer.MIN_VALUE;
        int t= sc.nextInt();

        for(int i=0;i<t;i++){
            
            int in=sc.nextInt();
           // System.out.println("taken the index " +in);
            if(in==1){

            
                int j=sc.nextInt();
                maxi=Math.max(j,maxi);

            // System.out.println("taken the vale to insert " +j +" and max value "+maxi);
                sk.push(new Node(j,maxi));
            }
            else if(in==2){ 
               // System.out.println("Poping");
                sk.pop();
                if(sk.isEmpty()){maxi= Integer.MIN_VALUE;}
                else{
                maxi=sk.peek().currMax;}
            }
            else if(in==3){System.out.println(maxi);}
        }
    }
}


class Node{
    int data;
    Node next;
    int currMax;
    public Node(int data,int currMax){
        this.data=data;
        this.next=null;
        this.currMax=currMax;
    }
}

class Stack{
    Node top=null ;
  
    boolean isEmpty(){
        return (top==null);
    }
    
    
    
    void push(int  n){
        if(top==null) {top=new Node(n);
           }
        else{
            Node temp=new Node(n);;
            
            temp.next=top;
            top=temp;
        }
    }
    
    void pop(){
        if(isEmpty()){
            return ;
        }
        else{
       //     Node temp=top;
            top=top.next;
           
        }
        
    }

    Node peek(){
        return top;
    }
}