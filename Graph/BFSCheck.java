import java.util.*;
import java.io.*;

public class BFSCheck{
	int v;
	LinkedList<Integer> adj[];

	public BFSCheck(int v){
		this.v=v;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]= new LinkedList();
		}
	}

	public void addEdge(int p,int q){
		adj[p].add(q);
	}

	public void printAdj(){
		for (int i=0;i<v ;i++ ) {
			Iterator<Integer> is=adj[i].listIterator();
			System.out.print(i);
			while(is.hasNext()){
			Integer ii= is.next();
			System.out.print("-> "+ii);
		  }
		  System.out.println();
		}
	}
	public void BFSTraverse(int s){
		boolean visited[]=new boolean[this.v];
		LinkedList<Integer> queue= new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0){
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i=adj[s].listIterator();
			while(i.hasNext()){
				int n= i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}

	public void DFSTraverse(int s){
		boolean visitedDFS[]= new boolean[v];

		DFSUtil(s,visitedDFS);


		// DFS for all the nodes of a given graph

		for(int i=0;i<this.v;i++){
			System.out.println("in th for loop");
			if(!visitedDFS[i]){
			DFSUtil(i,visitedDFS);}
		}
	}

	public void DFSUtil(int s,boolean[] visitedDFS){
		visitedDFS[s]=true;
		System.out.print(s+" ");
		Iterator<Integer> i=adj[s].listIterator();
		while(i.hasNext()){
		int n= i.next();
		if(!visitedDFS[n]){
			DFSUtil(n,visitedDFS);
		}
	  }
	}
	
	public void topologicalSortUtil(int s, boolean visitedTopo[],Stack stack){
        // Mark the current node as visited.
        System.out.println("the visited node is s=  "+s);
        visitedTopo[s] = true;
        Integer i;
 
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> it = adj[s].iterator();
        while (it.hasNext())
        {
            i = it.next();
            //System.out.println("the array element is i= "+i);
            if (!visitedTopo[i])
                topologicalSortUtil(i, visitedTopo, stack);
        }
 
        // Push current vertex to stack which stores result
        stack.push(s);
    }
 
    // The function to do Topological Sort. It uses
    // recursive topologicalSortUtil()
   public  void topologicalSort(){
        Stack stack = new Stack();
 
        // Mark all the vertices as not visited
        boolean visitedTopo[] = new boolean[v];
        for (int i = 0; i < v; i++)
            visitedTopo[i] = false;
 
        // Call the recursive helper function to store
        // Topological Sort starting from all vertices
        // one by one
        for (int i = 0; i < v; i++)
            if (visitedTopo[i] == false)
                topologicalSortUtil(i, visitedTopo, stack);
 
        // Print contents of stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }





	


	public static void main(String[] ar){
		/*BFSCheck graph=new BFSCheck(4);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,2);
		graph.addEdge(2,0);
		graph.addEdge(2,3);
		graph.addEdge(3,3);*/

		BFSCheck graph= new BFSCheck(6);
		graph.addEdge(5,0);
		graph.addEdge(5,2);
		graph.addEdge(2,3);
		graph.addEdge(3,1);
		graph.addEdge(4,0);
		graph.addEdge(4,1);
		graph.printAdj();
		System.out.println("the Breadth First Traversal is ");
		graph.BFSTraverse(2);

		System.out.println("the Deapth First Traversal is ");
		graph.DFSTraverse(2);

       graph.topologicalSort();
		
	}
}


