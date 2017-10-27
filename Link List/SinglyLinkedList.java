public class SinglyLinkedList{
	static Node root1;
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(125);
		ll.insert(25);
		ll.insert(104);
		ll.insert(15);
		ll.insert(55);
		ll.insert(5);
		ll.insert(4);
		ll.insert(95);
		ll.insert(1);
		ll.insert(34);
		ll.insert(115);
		ll.insert(25);
		ll.printList();
		ll.insertkeyInSorted(9);
		ll.printList();
		ll.insertkeyInSorted(8);
		ll.printList();
		root1=ll.root;
		//root =ll.reverseList();
		//ll.printList();
		System.out.println("root.key is "+root1.key);

		Node temp=ll.getNodeWithGivenCount(2,root1);
		System.out.println("the node at count 2 is "+temp.key);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
		//ll.sort(root,0,ll.getCount(root)-1);
		//System.out.println("After Quick sorting ");
		ll.printList();


		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Merge Sort applying");
		System.out.println("hello merge sort");


	//	ll.mergeSort(root,0,ll.getCount(root1)-1);
	//	ll.printList();

	}

}
	

 	class LinkedList{
 		Node root;
		Node L;
		Node R;
	public  Node reverseList(){
		System.out.println("reversed List is ");
			Node prev=null;
			Node curr=root;
			Node next;
		
		while(curr!=null){
			System.out.println("the current data is "+curr.key);
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;

		}
		root=prev;
		return root;
	}


	public  void sort(Node node,int low,int high ){
		//System.out.println("inside sorting ");
		//System.out.println("in sorting ");
		System.out.println("sorting result");
		printList();
		if(low<high){
		int pivot=partition(node,low,high);
		
		
		sort(node,low,pivot-1);
		sort(node,pivot+1,high);
	}
	}


	// r is index wise n-1 last index
	public  int partition(Node node,int l,int r){
		
		int j=l-1;
		int i=l;
		System.out.println("starting index for partition is "+i+"  and eending index is "+r);
		Node pivot=getNodeWithGivenCount(r,node);
		
		System.out.println("pivot is "+pivot.key);
		for(i=l;i<r;i++){
			Node temp=getNodeWithGivenCount(i,node);
			System.out.println("key for temp for pivot comparision is "+temp.key);
			if(temp.key<pivot.key){
				j++;

				Node temp2=getNodeWithGivenCount(j,node);
					System.out.println("swapping temp and temp2      "+temp.key+"    " +   temp2.key );
				node=swap(node,temp,temp2);
			}
		}
		j++;
		System.out.println("count j for final swapping is "+j);
		Node temp2=getNodeWithGivenCount(j,node);

		node=swap(node,pivot,temp2);

		System.out.println("Pivot position is "+j);
		return j;
	}



	public  void insert(int key){
		
			Node temp=new Node(key);
			temp.next=root;
			root=temp;
		
	}

	public Node getLastNode(){
		Node temp=root;
		while(temp.next!=null){
			temp=temp.next;
		}
		return temp;
	}

	public int  getCount(Node node){
       int  count=0;
       Node temp=node;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       return count;
   }


    public Node getNodeWithGivenCount(int count,Node node){
      Node temp=node;
      while(count>0){
      	count--;
        temp=temp.next;

      }
      return temp;

    }


	public   void insertkeyInSorted(int key){
		System.out.println("insert in sorted");
		Node node=new Node(key);
		if(root==null){
			root=node;
		}
		else{
			Node temp=root;
			
		while(temp.key<=node.key && temp.next!=null ){
			System.out.println("temp key is "+temp.key);
			
			if(temp.next.key<node.key) {temp=temp.next;}
			else break;
		}
		node.next=temp.next;
		temp.next=node;

		}
	}

	public  void printList(){
		Node temp=root;

		while(temp!=null){
			
			System.out.print(temp.key+"  ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public Node swap(Node node,Node a,Node b){
			int temp=a.key;
			a.key=b.key;
			b.key=temp;

			return node;
	}


// r=  last index
	public void mergeSort(Node node,int l, int r){
		System.out.println("in merger sort");
		System.out.println("  l is ="+l+"  r = "+r);
       if(l<r){
       //	System.out.println("inside if condition");
       	int m= (l+r)/2;
		System.out.println("mid is "+m);
		System.out.println("the mid term is "+getNodeWithGivenCount(m,node).key);
		mergeSort(node ,l,m);
		mergeSort(node,m+1,r);
		merge(node,l,m,r);
       }
	}


	public void merge(Node node, int l,int m,int r){




	}

	/*	void merge(Node node, int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;


		for(int i=0;i<n1;i++){
			L[i]=ar[i+l];
		}
		for(int i=0;i<n2;i++){
			R[i]=ar[i+m+1];
		}
			
		
		int i=0, j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				System.out.println("i is = "+i);
				ar[k]=L[i];
				i++;
				//System.out.print(ar[k]+" ");
			}
			else {
				System.out.println("j is = "+j);
				ar[k]=R[j];
				j++;
				//System.out.print(ar[k]+" ");
			}
			k++;
		}

		while(i<n1){
			ar[k]=L[i];
			i++ ;
			k++;
			//System.out.print(ar[k]+" ");
		}

		while(j<n2){
			ar[k]=R[j];
			j++ ;
			 k++;  
			 //System.out.print(ar[k]+" ");
		}
		//System.out.println();

	}
*/


	
	}



 class Node{
			int key;
			Node next;
			Node(int key){
				this.key=key;
				this.next=null;
				}
			}
	

