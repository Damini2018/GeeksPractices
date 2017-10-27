import java.util.*;

public class CompatibleSinglyLinkedList{
	static Node root, root2,check,check2;
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		root=ll.insert(root,11);
		root=ll.insert(root,5);
		root=ll.insert(root,3);
		root=ll.insert(root,1);

		ll.printList(root);

		root2=root;
		

		root2=ll.insert(root2,10);
		root2=ll.insert(root2,1);
		root2=ll.insert(root2,20);
		root2=ll.insert(root2,8);
		root2=ll.insert(root2,11);
		root2=ll.insert(root2,111);
		ll.printList(root2);

		check=ll.insert(check,6);
		check=ll.insert(check,4);
		check=ll.insert(check,2);
		

		System.out.println("after alternative merges ");
		check=ll.alternativeMerge(root,check);
		ll.printList(check);


		/*ll.printList(root);
		ll.printList(check);
		check=ll.countSum2List(root,check);
		System.out.println("the list after counting the two list and merging");
		ll.printList(check);*/



		

//20  1  10  3  4 


/*
		// delete the node which are having hgher value nodes on right side
		System.out.println("List after deleting higher nodes on right");
		root2=ll.deleteRightLesserValue(root2);
			ll.printList(root2);
*/

		// Quick sort terms

		/*System.out.println("count of terms is "+ll.getCount(root2));
		ll.Quicksort(root2,0,ll.getCount(root2)-1);
		System.out.println("After Quick sorting ");
		ll.printList(root2);
		root2=ll.insertkeyInSorted(root2,15);
		ll.printList(root2);*/
		

		// Merge Sort	
		root2=ll.mergeSort(root2,0,ll.getCount(root2)-1);
		System.out.println("After Merge sorting ");
		ll.printList(root2);
		

/*
		check=ll.getSubList(root2,0,2);
		check2=ll.getSubList(root2,3,4);
		System.out.println("the sublists are ");

		ll.printList(check);
		ll.printList(check2);

		check=ll.merge1(check,check2);
		ll.printList(check);*/




		root2=ll.reverseUtil(root2,root2,null);
		System.out.println("the revversed list is");
		ll.printList(root2);


		// detecting cycle

/*				// creating cycle first then detect
			root2.next.next.next.next.next=root2.next.next;


		if(ll.detectCycle(root2)){
			System.out.println("yes there is cycle");
		}
		else {
			System.out.println("No cycle found");
		}

	}*/
	Node dummy=root2;
			Node a1=null;
			Node a2=null;
			int count=ll.getCount(root2);
			while(count-->0){
				if(count%2==0){
					a1=ll.insert(a1,dummy.key);
					dummy=dummy.next;
				}
				else
				{
					a2=ll.insert(a2,dummy.key);
					dummy=dummy.next;
				}
			}
			System.out.println("the alternative lists are");
			a1=ll.reverseList(a1);
			a2=ll.reverseList(a2);
			ll.printList(a1);
			ll.printList(a2);

			System.out.println("the a1 key is "+a1.key);

			Object obj[]={1,2,3,"HelloWorld!",a1};
			Node aaa=(Node) obj[4];
		System.out.println("Object element at 4 is obj "+(Node) obj[4].key);
		System.out.println("Object element at 4 is obj "+aaa.key);
}





}

	
class LinkedList{
	Node a;

	public Node insert(Node a,int key){
		if(a==null) a= new Node(key);
		else{
			Node temp=new Node(key);
			temp.next=a;
			a=temp;
		}
		return a;
	}

	public void printList(Node a){
		Node temp=a;
		while(temp!=null){
			System.out.print(temp.key+"  ");
			temp=temp.next;
			}
			System.out.println();
		}

	public  Node reverseList(Node a){
		System.out.println("reversed List is ");
			Node prev=null;
			Node curr=a;
			Node next;
		
		while(curr!=null){
			System.out.println("the current data is "+curr.key);
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;

		}
		a=prev;
		return a;
	}	

	public boolean detectCycle(Node check){
		Node slow=check;
		Node fast=check;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow== fast){
				return true;
			}
		}
		return false;
	}

	public  void Quicksort(Node node,int low,int high ){
		//System.out.println("inside sorting ");
		//System.out.println("in sorting ");
		System.out.println("Quicksort  result");
		printList(node);
		if(low<high){
		int pivot=partition(node,low,high);
		System.out.println("partion done");
		
		Quicksort(node,low,pivot-1);
		Quicksort(node,pivot+1,high);
	}
	}


	Node reverseUtil(Node head,Node curr, Node prev) {
 
        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;
 
            /* Update next to prev node */
            curr.next = prev;
            return head;
        }
 
        /* Save curr->next node for recursive call */
        Node next1 = curr.next;
 
        /* and update next ..*/
        curr.next = prev;
 
        head = reverseUtil(head,next1, curr);
        return head;
    }
 

	// r is index wise n-1 last index // partition is for quck sort
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


	public Node getLastNode(Node a){
		Node temp=a;
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

    public   Node insertkeyInSorted(Node a,int key){
		System.out.println("insert in sorted");
		Node node=new Node(key);
		if(a==null){
			a=node;
		}
		else{
			Node temp=a;
			
		while(temp.key<=node.key && temp.next!=null ){
			System.out.println("temp key is "+temp.key);
			
			if(temp.next.key<node.key) {temp=temp.next;}
			else break;
		}
		node.next=temp.next;
		temp.next=node;

		}
		return a;
	}


	public Node swap(Node node,Node a,Node b){
			int temp=a.key;
			a.key=b.key;
			b.key=temp;

			return node;
	}



	public Node mergeSort(Node node,int l, int r){
			Node p=node;
		if(l<r){
			int m= (l+r)/2;
			 p=getSubList(node,l,m);
			Node pq=mergeSort(p,0,getCount(p)-1);
			Node q=getSubList(node,m+1,r);
			Node qp=mergeSort(q,0,getCount(q)-1);

			p=merge1(pq,qp);
		}
		return p;

	}


	public Node merge1(Node A,Node B){
	System.out.println("in the merging of temp A and temp B");
  	System.out.println("list A is ");
  	printList(A);
  		System.out.println("list B is");
  		printList(B);
    if(A==null){
    	System.out.println("As list A is empty so printing B list");
    	printList(B);
    	return B;
    }
    else if(B==null){
    	System.out.println("As list B is empty so printing A list");
    	printList(A);
    	return A;
    }

    if(A.key<=B.key){
    	System.out.println("hello A.key is smaller  A.key<=B.key  "+ A.key+"   "+B.key);
    	A.next=merge1(A.next,B);
    	return A;
    }
    else{
    	System.out.println("helllo B.key is smaller   A.key>B.key  "+ A.key+"   "+B.key);
    	B.next=merge1(A,B.next);
    	return B;
    }


}


	public Node alternativeMerge(Node p,Node q){
		if(p==null) return q;
		if(q==null) return p;

		else
		{
			p.next=alternativeMerge(q,p.next);
			return p;
		}

	}



	public Node countSum2List(Node h1,Node h2){
		int count1=getCount(h1);
		int count2=getCount(h2);
		int sum1=0;
		int sum2=0;
		count1--;
		count2--;
		while(count1>-1){
			int p=(int)Math.pow(10,count1);
			System.out.println("p is "+p);
			sum1=sum1+h1.key*p;
			count1--;
			h1=h1.next;
		}
		System.out.println("sum1 is = "+sum1);
		while(count2>-1){
			int p=(int)Math.pow(10,count2);
			System.out.println("p is "+p);
			sum2=sum2+h2.key*p;
			count2--;
			h2=h2.next;
		}
		System.out.println("sum2 is = "+sum2);

		sum1=sum1+sum2;
		System.out.println("sum as total of sum1 and sum2  is = "+sum1);
		count1=1;
		Node result=null;
		
		while(sum1>0){
			System.out.println("sum is "+sum1);
			int divide=10;
			int tempKey=sum1%divide;
			sum1=sum1-tempKey;
			sum1=sum1/10;
			
			result=insert(result,tempKey);
			

		}

		return result;
	}



		public Node getSubList(Node node,int l,int r){
			System.out.println("the sublist is started");
			//Node A=getNodeWithGivenCount(l,node);
			Node temp=null;
			for(int count=r;count>=l;count--){
				temp=insert(temp,(getNodeWithGivenCount(count,node).key));
				
			}
			//A.next=null;
			return temp;
		}



		public void alternateSplitingList(Node node){
			Node dummy=node;
			Node a1=null;
			Node a2=null;
			int count=getCount(node);
			while(count-->0){
				if(count%2==0){
					a1=insert(a,dummy.key);
					dummy=dummy.next;
				}
				else
				{
					a2=insert(a2,dummy.key);
					dummy=dummy.next;
				}
			}
			a1=reverseList(a1);
			a2=reverseList(a2);
      }


      public Node deleteRightLesserValue(Node node){
      	node=reverseList(node);
      	Node dummy=node;
      	Node dummy2=dummy.next;
      	int max=node.key;

      	while(dummy!=null && dummy2!=null){
      		if(dummy2.key<max){
      			dummy.next=dummy2.next;
      			dummy2.next=null;
      			
      			dummy2=dummy.next;
      		}
      		else{
      			dummy=dummy.next;
      			dummy2=dummy.next;
      			max=dummy.key;
      		}
      	}
      	node=dummy;
      	node=reverseList(node);
      	return node;
      }



}


class Node{
			int key;
			Node next;
			Node(int key){
				this.key=key;
				this.next=null;
				}
			}
