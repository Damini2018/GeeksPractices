import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionBalanceBracket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean tem=true;
        for(int a0 = 0; a0 < t; a0++){
           Stack sk=new Stack();
            String s = in.next();
            int len=s.length();
            for(int k=0;k<len;k++){
                
                char c=s.charAt(k);
                //System.out.println("the char taken is "+c);
                if(c=='(' || c=='{' || c=='['){
                  //  System.out.println(" pushing the char ");
                    sk.push(c);
                }
                 if(!sk.isEmpty()){if(c==')' ){
                    if(sk.peek().data!='(') {tem=false;}
                   else { sk.pop();
                    //    System.out.println("the char is ( hence popping");
                        tem=true;}
                     
                }
                else if(c==']' ){ if(sk.peek().data!='[') {tem=false;}
                   else { sk.pop();
                      //  System.out.println("the char is [ hence popping");
                        tem=true;}
                     
                }
                else if(c=='}' ){
                    if(sk.peek().data!='{') {tem=false;}
                   else { sk.pop();
                        //System.out.println("the char is { hence popping");
                        tem=true;}
                     
                }}
                else sk.push(c);
                
                
            }
            if(sk.peek()!=null) tem=false;
            
            if(tem) System.out.println("YES");
            else System.out.println("NO");
                

        }
    }
    
    
   
}


class Node{
    char data;
    Node next;
      public Node(char data){
        this.data=data;
        this.next=null;
       // this.currMax=currMax;
    }
}

class Stack{
    Node top=null ;
  
    boolean isEmpty(){
        return (top==null);
    }
    
    
    
    void push(char n){
        if(top==null) {top=new Node(n);
           }
        else{
            Node temp=new Node(n);
            
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