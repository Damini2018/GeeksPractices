/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// A Binary Tree node
/* class Node
{
    int data;
    Node left, right, nextRight;
    Node(int item)
    {
        data = item;
        left = right = nextRight = null;
        
    }
} */
class GfGConnectSameLevel
{
    void connect(Node root)
    {
        ArrayList<Node> al=new ArrayList<>();
        if(root!=null){
          int ed=1;
            al.add(root);
            while(al.size()>0){
                Node temp=al.get(0);
                al.remove(0);
                if(temp.left!=null){
                    al.add(temp.left);
                }
                if(temp.right!=null){
                    al.add(temp.right);
                }
                ed--;
                if(ed==0){
                    
                    ed=al.size();
                }
                else{
                    temp.nextRight=al.get(0);
                }
                
            }
        }
        // Your code here   
    }
}







/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    void leftView(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int c=q.size()-1;
            Node p=q.remove();
            System.out.print(p.data+" ");
            if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                q.add(p.right);
            while(c>0){
                p=q.remove();
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
                c--;
            }
        }
        //System.out.println();
    }
}