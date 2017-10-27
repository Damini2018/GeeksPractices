import java.util.Stack;


public class BinaryTreeDemo{
	 
		public static void main(String[] args) {
			Node root=null;
	  BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        root=tree.root;
        tree.inOrderTraversal(root);
        tree.printLevelOrderWithStack();
  
   }

}


class Node{
	int key;
	Node left;Node right;

	public Node(int key){
		this.key=key;
		this.left=null;
		this.right=null;
			}

}
 class BinaryTree{
	Node root;
	
	public BinaryTree(){
		root=null;
	}

	

	void inOrderTraversal(Node node){
		if(node==null) return;
		else{
			inOrderTraversal(node.left);
			System.out.print(node.key+" ");
			inOrderTraversal(node.right);
		}

	}

	void preOrderTraversal(Node node){
		if(node==null) return;
		else{
			System.out.print(node.key+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	void postOrderTraversal(Node node){
		if(node==null) return;
		else{
			
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.key+" ");
		}
	}

	int getHeight(Node node){
		if(node==null) return 0;
		else {
			int lHeight=getHeight(node.left);
			int rHeight=getHeight(node.right);

			return (Math.max(lHeight,rHeight)+1);
		}
	}

   void levelOrderTraversal(Node node){
   	 int h= getHeight(node);
   	 for(int i=1;i<=h;i++){
   	 	printGivenLevel(node,i);
   	 }
   	}

   	void printGivenLevel(Node node,int i){
   		if(node==null) return;
   		else if(i==1) System.out.print(node.key+" ");
   		else{
   			printGivenLevel(node.left,i-1);
   			printGivenLevel(node.right,i-1);
   		}
   	}

   
    void printLevelOrderWithStack(){
    	if(root==null) return;
    	Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.key + " ");
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
}
    }


}
/*
class Node1{
    int data;
    Node next;
    int currMax;
    public Node1(int data,int currMax){
        this.data=data;
        this.next=null;
        
    }
}

class Stack{
    Node1 top=null ;
  
    boolean isEmpty(){
        return (top==null);
    }
    
    
    
    void push(Node1  n){
        if(top==null) {top=n;
           }
        else{
            Node1 temp=n;
            
            temp.next=top;
            top=temp;
        }
    }
    
    Node pop(){
        if(isEmpty()){
            return ;
        }
        else{
           Node temp=top;
            top=top.next;
           
        }
        return temp;
        
    }

    Node1 peek(){
        return top;
    }
}*/