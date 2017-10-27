VerticalDistance.java{
	
}

class Node{
	int key;
	int value;
	Node left;
	Node right;
	Node(int key){
		this.key=key;
		this.value=0;
		this.left=this.right=null;

	}
	Node(int key,int value){
		this.key=key;
		this.value=value;
		this.left=this.right=null;
	}
}

class BinarySearchTreeDemo{
	Node root;

	public Node insert(Node node,int k){
		if(node==null)
			node=new Node(k);
		else if(node.key>k){
			node.left=insert(node.left,k);
		}else{
			node.right=insert(node.right,k);
		}
		return node;
	}
}