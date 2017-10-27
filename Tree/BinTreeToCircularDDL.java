public class  BinTreeToCircularDDL{
	static Node root,pre,head,tail;
	public static void main(String[] args) {
		pre=null;
		  root = new Node(10);
     root.left = new Node(12);
     root.right = new Node(15);
     root.left.left = new Node(25);
     root.left.right = new Node(30);
     root.right.left = new Node(36);

     bin2Dll(root);
     
     tail.right=head;
     head.left=tail;
     printList(head);

	}

	public static  void bin2Dll(Node node){

		if(node==null) return;
		bin2Dll(node.left);
		if(pre==null) head=node;
		else{
			pre.right=node;
			node.left=pre;
		}
		pre=node;
		bin2Dll(node.right);
		if(node!=null && node.right==null){
			tail=node;
		}


	}

	public static void printList(Node node){
		do{
			System.out.print(node.key+"  ");
		}while(node.right!=node);
	}
}

class Node{
	int key;
	Node left;
	Node right;
		public Node(int key){
			this.key=key;
			this.left=null;
			this.right=null;
		}
}