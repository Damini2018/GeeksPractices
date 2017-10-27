import java.util.*;

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

	public void BFSTraverse(int s){
		boolean visited[]=new boolean[this.v];
		LinkedList<Integer> queue= new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size!=0){
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


	public static void main(String[] ar){
		BFSCheck graph=new BFSCheck(3);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,2);
		graph.addEdge(2,0);
		graph.addEdge(2,3);
		graph.addEdge(3,3);

		System.out.println("the Breadth First Traversal is ");
		graph.BFSTraverse(0);
		
	}
}


