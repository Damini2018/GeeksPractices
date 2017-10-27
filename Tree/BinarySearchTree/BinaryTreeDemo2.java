class Node {
	
	int val;
	Node left, right;
	
	Node(int d) {
		val = d;
		left = right = null;
	}
}

public class BinaryTreeDemo2 {
    
    static Node root;
    static Node firstElement = null;
    static Node secondElement = null;
    
    static void findPreSuc(Node root , int key) {
        
        findPreSucUtil(root , key);
        
        System.out.println("PRE: " + firstElement.val); 
        System.out.println("SUC: " + secondElement.val);
    }
    
    static void findPreSucUtil(Node root , int key) {
        
        if (root == null)
            return;
            
        if (root.val == key)
        {
            if(root.left != null)
            {
                Node temp = root.left;
                while(temp.right!=null)
                    temp = temp.right;
                    
                firstElement = temp;
                
            }
            
            if(root.right != null)
            {
                Node temp = root.right;
                while(temp.left!=null)
                    temp = temp.left;
                    
                secondElement = temp;
                
            }
            return;
        }
        
        if(root.val > key){
            secondElement = root;
            findPreSucUtil(root.left , key);
        }
        
        if(root.val < key){
            firstElement = root;
            findPreSucUtil(root.right , key);
        }
            
}

	
	public static void main(String[] args) {
		BinaryTreeDemo2 tree = new BinaryTreeDemo2();
		tree.root = new Node(3);
      
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(32);
        tree.root.right.right.left = new Node(15);
        tree.root.right.right.right = new Node(52);
         tree.root.right.right.right.left = new Node(51);
          tree.root.right.right.right.left.left = new Node(34);
        
        
		findPreSuc(tree.root  ,3);

	}
}