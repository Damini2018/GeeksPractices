// Java program to check if there is exist a path between two vertices
// of a graph.
import java.io.*;
import java.util.*;
import java.util.LinkedList;
 
// This class represents a directed graph using adjacency list
// representation
class BFSpathbwSD
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List
 
    //Constructor
    BFSpathbwSD(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    //Function to add an edge into the graph
    void addEdge(int v,int w)  {   adj[v].add(w);   }
 
    //prints BFS traversal from a given source s
    int  isReachable(int s, int d)
    {
        LinkedList<Integer>temp;
    int count=0;
        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[V];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        // 'i' will be used to get all adjacent vertices of a vertex
        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
 
            int n;
            i = adj[s].listIterator();
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            while (i.hasNext())
            {
                n = i.next();
 
                // If this adjacent node is the destination node,
                // then return true
                if (n==d)
                    return count;
 
                // Else, continue to do BFS
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                    count++;
                }
            }
        }
 
        // If BFS is complete without visited d
        return -1;
    }
 
    // Driver method
    public static void main(String args[])
    {
        // Create a graph given in the above diagram
        BFSpathbwSD g = new BFSpathbwSD(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 4);
        g.addEdge(6, 4);
        g.addEdge(5, 6);
 
        int u = 0;
        int v = 4;
        int count2=g.isReachable(u, v);
        if (g.isReachable(u, v)>0)
            System.out.println("There is a path from " + u +" to " + v+"  and the cunt is "+count2);
        else
            System.out.println("There is no path from " + u +" to " + v);;
 
        u = 3;
        v = 1;
        int count=g.isReachable(u,v);
        if (g.isReachable(u, v)>0)
            System.out.println("There is a path from " + u +" to " + v+"  and the count is "+count);
        else
            System.out.println("There is no path from " + u +" to " + v);


        Stack<String> st= new Stack<String>();
        st.push("1");
        st.push("hello ");


        while(!st.empty()){
            System.out.print(st.pop()+"  ");
        }


        Queue qu=new LinkedList();
        qu.add("c");
        qu.add("pkfofjd");

        while(!qu.isEmpty()){
            System.out.print(qu.remove()+"  ");
        }
    }
}