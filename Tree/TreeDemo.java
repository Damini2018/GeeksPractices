// tree traversal methods



import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class TreeDemo{
	static TreeNode root;
	TreeDemo(){
		this.root=null;
	}
	static int [] ar= {2,3,4,5,4,6};
		int c=0;

	public static void main(String[] args) {
		TreeDemo t=new TreeDemo();
		root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);

		System.out.println("Pre-Order travesal");
		t.preOrderTraversal(root);
		System.out.println("In-Order travesal");
		t.inOrderTraversal(root);
		System.out.println("Post-Order travesal");
		t.postOrderTraversal(root);
		System.out.println("Level-Order travesal");
		t.printLevelOrder(root);
		/*
		System.out.println();
		t.printLevelOrderWithQueue(root);
		System.out.println("the inorder with statck call and without recursion");
		t.inorderWithStack(root);

		System.out.println("the inorder without statck call and without recursion");
		t.inorderWithoutStack(root);

		System.out.println();
		System.out.println("the size of the tree is "+t.size(root));

		System.out.println("the size is "+ar.length);

		System.out.println("path from root to leaf are");
		t.printLeafPath(root);

		System.out.println("the leaf count is "+t.getLeafCount(root));
		
*/
		/*root=t.checkChildrenSum(root);
		t.preOrderTraversal(root);
		System.out.println();
		t.inOrderTraversal(root);
		System.out.println();
		int dia=-1;
		System.out.println("the dia is "+t.getDiameter(root));
		if(t.isHeightBalance(root)) System.out.println("Height is balance");
		else{System.out.println("not a balanced tree");}

		System.out.println("in the path sum checking ");
		if(t.checkPathSum(root,26))
			System.out.println("yes");
		else{
			System.out.println("no");
		}*/
			/*
					System.out.println("Constructing tree from the given traversal");
					int in[]={4 ,2, 5, 1, 6,3,7};
					int pre[]={1 ,2 ,4 ,5, 3,6,7};
					root=t.constructTree(pre,in,0,pre.length-1);
					t.printLevelOrder(root);*/


				/*	System.out.println("the double tree is ");
			t.printLevelOrder(t.constructDoubleTree(root));
		*/
			System.out.println("Checking for the foldability of any tree");
			if(t.isFoldable(root)) System.out.println("yes foldable ");
			else System.out.println("Not foldable");

			System.out.println("The level of the given data is ");
			System.out.println("Answer is "+t.getlevelOfData(root,8));

			if(t.printAncestor(root,3)){
				System.out.println(" the above are the ancestor");
			}

	


			System.out.println("the boundary of tree is ");
			t.printBoundary(root);


			System.out.println("Cheching for complete Tree");
			if(t.checkCompleteTree(root)) 
				System.out.println("Yes complete tree");
			else
				System.out.println("Not a Binary complete");
		}



	public   void inOrderTraversal(TreeNode node){
		if(node==null) return;
		inOrderTraversal(node.left);
		System.out.print(node.key+" ");
		inOrderTraversal(node.right);
	}

	public  void preOrderTraversal(TreeNode node){
		if(node==null) return;
		System.out.print(node.key+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public  void postOrderTraversal(TreeNode node){
		if(node==null) return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.key+" ");
	}

	public int getHeight(TreeNode node){
		if (node==null) return 0;
		else {
			int lheight=getHeight(node.left);
			int rheight=getHeight(node.right);
			if(lheight>rheight) return (lheight+1);
			else return (rheight+1);
		}
	}

	public void printLevelOrder(TreeNode node){
		int h=getHeight(node);
		for(int i=1;i<=h;i++){
			printGivenLevel(node,i);
		}
	}

	public void printGivenLevel(TreeNode node,int l){
		if(node==null) return ;
		if(l==1) System.out.print(node.key+" ");
		else if(l>0){
			printGivenLevel(node.left,l-1);
			printGivenLevel(node.right,l-1);
		}
	}

	public void printLevelOrderWithQueue(TreeNode  node){
		  LinkedList<TreeNode> q= new LinkedList<TreeNode>();
		int levelNodes=0;
		if(node==null) return;
		q.add(node);
		while(!q.isEmpty()){
			levelNodes=q.size();
			while(levelNodes>0){
				TreeNode n=(TreeNode)q.remove();
				System.out.print(n.key+"  ");
				if(n.left!=null) q.add(n.left);
				if(n.right!=null) q.add(n.right);
				levelNodes--;
			}
			System.out.println();
		}
	}

	public void inorderWithStack(TreeNode node){
		Stack <TreeNode> stck = new Stack<TreeNode>();
		TreeNode temp=node;
		while(temp!=null){
			stck.push(temp);
			temp=temp.left;
		}

		while(stck.size()>0){
			temp=stck.pop();
			System.out.print(temp.key+"  ");
			if(temp.right!=null){
				temp=temp.right;
				while(temp!=null){
					stck.push(temp);
					temp=temp.left;
		         }
			}
		}
	}

	public void inorderWithoutStack(TreeNode node){
		if(node==null) return;
		TreeNode currn=node;
		TreeNode pre=null;

		while(currn!=null){
			if(currn.left==null){
				System.out.print(currn.key+"  ");
				currn=currn.right;
			}else{
				pre=currn.left;
				while(pre.right!=null && pre.right!=currn ){
					pre=pre.right;
				}

				if(pre.right==null){
					pre.right=currn;
					currn=currn.left;
				}else {
					pre.right=null;
					System.out.print(currn.key+"  ");
					currn=currn.right;
				}
			}

		}
	}

	public int size(TreeNode node){
		if(node==null) return 0;
			else return (size(node.left)+1+size(node.right));
	}

	public boolean areIdentical(TreeNode a,TreeNode b){
		if(a==null && b==null){ return false;}
		else if(a!=null && b!=null){
			return (a.key==b.key && areIdentical(a.left,b.left) && areIdentical(a.right,b.right) ) ;
		}
		else{
			return false;
		}
	}

	public TreeNode treeMirror(TreeNode node){
		if(node==null) return node;
		TreeNode tleft=treeMirror(node.left);
		TreeNode tright=treeMirror(node.right);
		node.left=tright;
		node.right=tleft;
		return node;
	}

	public void printLeafPath(TreeNode node){
		//System.out.println("in the 1st call to print path");
		int ar[]=new int[200];
		int len=0;
		printRootToLeaf(node,ar,len);
	}
	public void printRootToLeaf(TreeNode node,int path[],int pathlen){
		if(node==null)  return;
		
		path[pathlen]=node.key;
		pathlen++;
		if(node.left==null &&  node.right==null){
				printthis(path,pathlen);
		}
		else{
			printRootToLeaf(node.left,path,pathlen);
			printRootToLeaf(node.right,path,pathlen);
			
		}
	}

	public void printthis(int[] ar,int len){
		for(int i=0;i<len;i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public int getLeafCount(TreeNode node){
		if(node==null) return 0;
		else if(node.left==null && node.right==null) return 1;
		else return getLeafCount(node.left)+getLeafCount(node.right);
	}

	public void printSpiral(TreeNode node){
		boolean flag= false;
		int h=getHeight(node);
		for (int i=1;i<=h ;i++ ) {
				printSpiralWithGivenLevel(node,i,flag);	
				flag=!flag;		
		}
	}

	public void printSpiralWithGivenLevel(TreeNode node,int i,boolean flag){
		if(node==null) return ;
		if(i==1) System.out.print(node.key+"  ");
		else if(i>1){
			if(flag){
			printSpiralWithGivenLevel(node.left,i-1,flag);
			printSpiralWithGivenLevel(node.right,i-1,flag);
		}else {
			printSpiralWithGivenLevel(node.right,i-1,flag);
			printSpiralWithGivenLevel(node.left,i-1,flag);
		}
		}

	}

	public TreeNode checkChildrenSum(TreeNode node){
		int diff=0;
		if(node==null || (node.left==null && node.right==null)){
			return null;
		}
		else{
			checkChildrenSum(node.left);
			checkChildrenSum(node.right);

			diff=node.left.key+node.right.key-node.key;

			if(diff>0) node.key=node.key+diff;

			else if(diff<0){
				node=increment(node,-diff);
			}
			}
			return node;
	}

	public TreeNode  increment(TreeNode node,int  diff){
		if(node.left!=null){
			node.left.key=node.left.key+diff;
			node.left=increment(node.left,diff);
		}
		else if(node.right!=null) {
			node.right.key=node.right.key+diff;
			node.right=increment(node.right,diff);
		}
		return node;
	}

	public int getDiameter(TreeNode node){
		
		System.out.println("the node is "+node.key);
		if(node!=null && (node.left==null && node.right==null)) return 1;
		else{
			int left =getHeight(node.left);
			int right=getHeight(node.right);
			
			int  leftD=getDiameter(node.left);
			int  rightD=getDiameter(node.right);

			return Math.max(left+right+1,Math.max(leftD,rightD));
		}
	}

	public boolean isHeightBalance(TreeNode node){
		int lh;int rh;
		if(node==null) return true;
		

		else{
			lh=getHeight(node.left);
			rh=getHeight(node.right);
			return (Math.abs(lh-rh)<=1 && isHeightBalance(node.left) && isHeightBalance(node.right));
		}
	}


	public boolean checkPathSum(TreeNode node,int value){
		if(node==null) return (value==0);
		else{
			if(value==0 && node.left==null && node.right==null) return true;
			return (checkPathSum(node.left,value-node.key) ||  checkPathSum(node.right,value-node.key));
		}
	}

	public TreeNode constructTree(int[] pre,int in[],int a,int  b){
			if( a<b){
			
			TreeNode tempRoot=new TreeNode(pre[c]);
			int j=a;
			while(pre[c]!=in[j]){
				j++;
			}
			
			c++;
			
			tempRoot.left=constructTree(pre,in,a,j-1);
			
			tempRoot.right=constructTree(pre,in,j+1,b);
			return tempRoot;
		}
		else{
			
			c++;
		return new TreeNode(in[a]);
		}
	}

	public TreeNode constructDoubleTree(TreeNode node){
		if(node==null) return null;
		TreeNode temp=node.left;
		TreeNode newNode=new TreeNode(node.key);
		node.left=newNode;
		newNode.right=null;
		newNode.left=constructDoubleTree(temp);
		node.right=constructDoubleTree(node.right);
		return node;
	}

	public boolean isFoldable(TreeNode node){
		boolean flag=false;
		if(node==null) return true;
		node.left=treeMirror(node.left);
		flag=isStuctureSame(node.left,node.right);
		node.left=treeMirror(node.left);
		return flag;
	}

	public boolean isStuctureSame(TreeNode a,TreeNode b){
		if(a==null && b==null) return true;
		if(a!=null && b!=null && isStuctureSame(a.left,b.left) && isStuctureSame(a.right,b.right)) 
			return true;
		return false;
			 
	}

	public int getlevelOfData(TreeNode node,int data){
		return getlevel(node,data,1);
	}

	public int getlevel(TreeNode node,int k,int level){
		if(node==null) return 0;
		if(node.key==k) return level;
		else{
			return (int)Math.max(getlevel(node.left,k,level+1),getlevel(node.right,k,level+1));
		}
	}

	public boolean printAncestor(TreeNode node,int k){
		if(node==null) return false;
		if(node.key==k) return true;
		if(printAncestor(node.left,k) || printAncestor(node.right,k)){
			System.out.print(node.key+"  ");
			return true;
		}
		return false;
	}

	public boolean isSubtree(TreeNode T,TreeNode S){
		if(T==null ) return false;
		if(S==null) return true;
		if(areIdentical(T,S)) return true;
		else{
			if(areIdentical(T.left,S) || areIdentical(T.right,S))
				return true;
		}
		return false;

	}


	public boolean checkCompleteTree(TreeNode node){
		if(node==null) return false;
		
		 LinkedList<TreeNode> q= new LinkedList<TreeNode>();
		boolean isFlagNull=false;
		TreeNode temp=null;
		q.add(node);
		while(!q.isEmpty()){

			temp=q.peek();
			//System.out.println("In while where temp "+temp.key);
			q.remove();
			if(temp!=null){
				//System.out.println("Temp is not null ");
				if(isFlagNull) return false;

				q.add(temp.left);
				q.add(temp.right);
			}
			else
				isFlagNull=true;
		}
		return true;
	}

	public void printBoundary(TreeNode node){
		if(node==null) return ;
		else{
			System.out.print(node.key+" ");
			printLeft(node.left);
			printLeaves(node);
			printRight(node.right);
		}
	}

	public void printLeft(TreeNode node){
		//System.out.println("printing left");
		
		if(node==null || (node.left==null && node.right==null) )return ;
		else{

			System.out.print(node.key+" ");
			printLeft(node.left);
		}
	}

	public void printLeaves(TreeNode node){
		//System.out.println("printing leaves");
		if(node==null) return;
		if(node.right==null && node.left==null) 
		{
			System.out.print(node.key+" ");
			return;
		}
		printLeaves(node.left);
		printLeaves(node.right);

	}

	public void  printRight(TreeNode node){
	//	System.out.println("printing right");
		if(node==null || (node.left==null && node.right==null) )return ;
		else{
			printRight(node.right);
			System.out.print(node.key+" ");
		}
	}

}

class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;

	 TreeNode(int key){
	 	this.key=key;
	 	this.left=null;
	 	this.right=null;
	 }
}

