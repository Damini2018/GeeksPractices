// Java program to get intersection point of two linked list

class LinkedListCheckIntersection {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*function to get the intersection point of two linked
	lists head1 and head2 */
	
	/* function to get the intersection point of two linked
	lists head1 and head2 where head1 has d more nodes than
	head2 */
	public int getInter(){
		return intersectPoint(head1,head2);
	}


		public int intersectPoint(Node headA, Node headB)
	{
		/*System.out.println("Before reversing ");
		printList(headA);
		printList(headB);
*/
		
         headA= reverse(headA);
         headB= reverse(headB);
/*         System.out.println("After reversing ");
		printList(headA);
		printList(headB);
*/         // code here
		System.out.println("Comparing the data  "+ headA +" and "+headB);
         boolean flag= false;
         while(headA == headB){
         	System.out.println("yes inside while loop");
             if(headA.next!=headB.next) {
             	System.out.println("Comparing the data  "+ headA.data +" and "+headB.data);
                 return headA.data;
             }
             
                 headA=headA.next;
                 headB=headB.next;
             
             flag=true;
            
         }
          
          return -1;
	}
	
	
	/*Takes head pointer of the linked list and
	returns the count of nodes in the list */
	
	
	public Node reverse(Node node) {
		//System.out.println("starting reversing the list");
		//printList(node);
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
       // printList(node);
        return node;
    }


	public void printList(Node a){
		Node temp=a;
		while(temp!=null){
			System.out.print(temp.data+"  ");
			temp=temp.next;
			}
			System.out.println();
		}


	public static void main(String[] args) {
		LinkedListCheckIntersection list = new LinkedListCheckIntersection();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(15);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getInter());

	}




	public int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public int _getIntesectionNode(int d, Node node1, Node node2) {
		int i;
		Node current1 = node1;
		Node current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return -1;
	}

	public int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return _getIntesectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return _getIntesectionNode(d, head2, head1);
		}
	}


}

// This code has been contributed by Mayank Jaiswal
