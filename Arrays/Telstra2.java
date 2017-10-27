import java.util.*;

public class Telstra2{
	public static void main(String[] args) {
		Node strt= new Node(1,4);
		Node end= new Node(14,9);
		System.out.println("hello in main");
		boolean ans= findPossibility(strt,end);
		System.out.println(ans);

	}

	static boolean findPossibility(Node a,Node b){
		System.out.println("hello making the queue");
		Queue<Node> q= new LinkedList<>();
			q.add(a);
			Node p;
			
			while(!q.isEmpty() ){
				
				p=q.remove();
				System.out.println("the removed element is ");
				p.printNode();

				if(p.x1==b.x1 && p.y1==b.y1){ 
					System.out.println("returning true  ");
					return true;}
				else if((p.x1)>b.x1 || p.y1>b.y1){

						continue;
				}
				else{

					Node p1=new Node((p.x1+p.y1),p.y1);
					Node p2=new Node(p.x1,(p.x1+p.y1));

					System.out.println("adding the p1 and p2");
					p1.printNode();
					p2.printNode();
					q.add(p1);
					q.add(p2);
					//q.add((p.x1+p.y1),p.y1);
					//q.add(p.x1,(p.x1+p.y1));
				}
			}
			System.out.println("at the end wala false");

			return false;



	}
}

class Node{
	int x1;
	int y1;

	 public Node(int a,int b){
	 	this.x1=a;
	 	this.y1=b;
	 }

	 void printNode(){
	 	System.out.println("The node value is "+this.x1+"  , "+this.y1);
	 }


}