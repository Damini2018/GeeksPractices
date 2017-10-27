import java.util.*;

public class BinarySearchTreeDemo{
	static TreeNode root;
	static  TreeNode pre=null;
	static TreeNode suc=null;
	public static void main(String[] args) {
		BinarySearchTreeDemo bst=new BinarySearchTreeDemo();
		root=bst.insert(root,3);
		root=bst.insert(root,5);
		root=bst.insert(root,32);
		root=bst.insert(root,52);
		root=bst.insert(root,51);
		root=bst.insert(root,15);
		root=bst.insert(root,34);
		root=bst.insert(root,2);
		root.left.left=new TreeNode(10);

		System.out.println("Inorder traversal is ");
		bst.printInorder(root);
		System.out.println();

		System.out.println("Preorder traversal is");
		bst.printPreorder(root);
		System.out.println();

		System.out.println("PostOrder traversal is");
		bst.printPostOrder(root);
		System.out.println();

		System.out.println("LevelOrder traversal is ");
		bst.printlevelOrder(root);
		System.out.println();

		System.out.println("LevelOrder  with queue is ");
		bst.printLevelOrderwithQueue(root);
		System.out.println();

		System.out.println("Search for elements");
		if(bst.search(root,15)!=null) System.out.println("key found");
			else System.out.println("Key not found");


		/*System.out.println("the 32 is getting deleted ");
		root=bst.delete(root,32);
*/
		System.out.println("LevelOrder traversal is ");
		bst.printlevelOrder(root);
		System.out.println();

		
		System.out.println("getting the preorder and post order of 15");
		bst.predecessorSuccessorUtil(root,15);
		System.out.println("Root key is "+root.key);
		if(pre!=null) System.out.println("predeccessor of 15 is " +pre.key);
		  else System.out.println("no predecessor");
		if(suc!=null)  
			System.out.println("Successor of 15 is "+suc.key);
		else System.out.println("No Successor");


		pre=null;
		suc=null;
		System.out.println("getting the preorder and post order of 45");
		bst.predecessorSuccessorUtil(root,3);
		System.out.println("Root key is "+root.key);
		if(pre!=null) System.out.println("predeccessor of 3 is " +pre.key);
		  else System.out.println("no predecessor");
		if(suc!=null)  
			System.out.println("Successor of 3 is "+suc.key);
		else System.out.println("No Successor");

		if(bst.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) System.out.println("yes BST");
        	else {
        		System.out.println("not a BST");
        	}

        	System.out.println("Searching the LCA ");
        	System.out.println("the LCA is "+bst.getLowestCommonAncestor(root,3,52).key);

        	int[] ar={2,1,4,3,5,32};
        	Arrays.sort(ar,1,ar.length);
        	for (int p : ar) {
        		System.out.print(p+"  ");
        	}
	}

	public TreeNode search(TreeNode node,int k){
		if(node==null || node.key==k) return node;
		else if(k<node.key) return search(node.left,k);
		else return search(node.right,k);
	}

	public TreeNode insert(TreeNode node,int k){
		if(node==null)
			node=new TreeNode(k);
		else if(node.key>k){
			node.left=insert(node.left,k);
		}else{
			node.right=insert(node.right,k);
		}
		return node;
	}

	public TreeNode delete(TreeNode node,int k){
		if(node==null) return null;
		if(node.key>k) 
			node.left=delete(node.left,k);
		else if(node.key<k)
			node.right=delete(node.right,k);
		else
		{
			if(node.left==null) return node.right;
			else if( node.right==null) return node.left;

			else{
				node.key=inorderSuccessor(node.right,k);
				node.right=delete(node.right,node.key);
			}
		}
		return node;
	}

	public int inorderSuccessor(TreeNode node,int k){
		TreeNode temp=node;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp.key;
	}



	public void printInorder(TreeNode node){
		if(node==null) return;
		else{
			printInorder(node.left);
			System.out.print(node.key+" ");
			printInorder(node.right);
		}
	}

	public void printPostOrder(TreeNode node){
		if(node==null) return;
		else{
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.print(node.key+" ");
		}
	}

	public void printPreorder(TreeNode node){
		if(node==null) return;
		else{
			System.out.print(node.key+" ");
			printPreorder(node.left);
			printPreorder(node.right);
		}
	}

	public void printlevelOrder(TreeNode node){
		
		int h=getHeight(node);

		for(int i=1;i<=h;i++){
			printGivenLevel(node,i);
			//System.out.println();
		}
	}

	public void printGivenLevel(TreeNode node,int i){
		if(node==null) return;
		else if(i==1) System.out.print(node.key+" ");
		else{
			printGivenLevel(node.left,i-1);
			printGivenLevel(node.right,i-1);
		}
	}

	public void printLevelOrderwithQueue(TreeNode node){
		if(node==null) return;
		else{
			LinkedList<TreeNode> q=new LinkedList<TreeNode>();
			q.add(node);
			//System.out.println(node.key+"  added to the queue ");
			TreeNode temp=null;
			while(!q.isEmpty()){
				//System.out.println("queue is not empty");
				//temp=q.peek();
				int qs=q.size();
				while(qs>0){
					temp=q.remove();
					System.out.print(temp.key+" ");
					if(temp.left!=null) q.add(temp.left);
					if(temp.right!=null) q.add(temp.right);
					qs--;
			  }
			}
		}
	}

	public int getHeight(TreeNode node){
		if(node==null) return 0;
		else{
			int lh= getHeight(node.left);
			int rh= getHeight(node.right);
			int h=Math.max(lh,rh);
			return h+1;
		}
	}
	/*public void predecessorSuccessor(TreeNode node,int k){
		predecessorSuccessorUtil(node,k);
		System.out.println("pre is "+pre.key);
		System.out.println("suc is "+suc.key);
	}*/

	public void predecessorSuccessorUtil(TreeNode node,int k){

		if(node==null) return ;
		
		if(node.key==k) {
			System.out.println("key found");
			if(node.left!=null) {

				TreeNode temp=node.left;
				while(temp.right!=null){
					temp=temp.right;
				}
				pre=temp;
				System.out.println("setting pre as key ="+node.key+"  is  found "+pre.key);
			}
			if(node.right!=null){
				TreeNode temp=node.right;
				while(temp.left!=null){
					temp=temp.left;
				}
				suc=temp;
				System.out.println("setting suc as key ="+node.key+"  is  found "+suc.key);
			}
			System.out.println("since key is found hence returning");
			return;
		}
		

		if(node.key>k){
			System.out.println("key is lesser than the root so suc ="+node.key);
			suc=node;
			predecessorSuccessorUtil(node.left,k);
		}
		else{
				System.out.println("key is greater than the root so pre ="+node.key);
			pre=node;
			predecessorSuccessorUtil(node.right,k);
		}
		//`System.out.println("getting pre and suc  "+pre.key+"  "+suc.key);
	}

	public boolean isBST(TreeNode node,int min,int max){
		//System.out.println("in the checking bst");
		if(node==null) return true;
		 if(node.key<min || node.key>max) return false;

		return (isBST(node.left,min,node.key-1) && isBST(node.right,node.key,max));


	}

	public TreeNode getLowestCommonAncestor(TreeNode node,int n1,int n2){
		if(node==null) return null;

		if(node.key>n1 && node.key>n2) 
			return getLowestCommonAncestor(node.left,n1,n2);
		if(node.key<n2 && node.key<n1)
			return getLowestCommonAncestor(node.right,n1,n2);
		return node;
	}
}

class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;
	public TreeNode(int key){
		this.key=key;
		left=null;
		right=null;
	}
}
