
import java.util.*;

public class QueueDemo{
	public static void main(String[] args) {
		QueueArray q1=new QueueArray(20);
		q1.enqueue(2);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.printQueue();
		System.out.println("the size of the queue is "+q1.getSize());
		System.out.println("the capacity of the queue is "+q1.getCapacity());
		q1.dequeue();
		q1.printQueue();

		QueueLinkedlist q2=new QueueLinkedlist();
		q2.enqueue(4);
		q2.enqueue(100);
		q2.enqueue(14);
		q2.enqueue(190);
		System.out.println("the linked list queue is ");
		q2.printQueueList();
		q2.dequeue();
		q2.printQueueList();

		System.out.println("Calculating multiple of 3 coding part");
		QueueLinkedlist q3=new QueueLinkedlist();
		int ar[]={8,1,4};
		int p= q3.getMultipleOf3(ar);
		System.out.println("answer is "+p);


		int arr[] = {12, 1, 78, 90, 57, 89, 56};
		maximumInCurrentWIndow(arr,3);


	}
	public static void maximumInCurrentWIndow(int arr[],int kk){
		QueueArray q1=new QueueArray(kk);
		int max=Integer.MIN_VALUE;
		int i=0;
		int pre_max=Integer.MIN_VALUE;
		for(i=0;i<kk;i++){
				int p= arr[i];
				System.out.println("p is "+p);
				if(p>max) max=p;
				if(max>pre_max && pre_max<p){
					pre_max=p;
				}
				q1.enqueue(p);
		}
		System.out.println("max is "+max);
		
		while(i<arr.length){
			
				/*else{pre_max=max;}*/
				
			int p= arr[i];
			
			if(p>max) max=p;
				if(max>pre_max && pre_max<p){
					pre_max=p;
				}
				System.out.println("p is "+p);
				int dd=q1.dequeue();
				if(dd==max) {
					System.out.println("max is getting dequeued hence max ="+pre_max);
					max=pre_max;}

				q1.enqueue(p);
				System.out.println("max is "+max);
				i++;
		}

	}
}

class QueueArray{
	int front ,rear,size;
	int capacity;
	int queue[];

	public QueueArray(int capacity){
		this.capacity=capacity;
		this.front=this.size=0;
		this.rear=capacity-1;
		this.queue=new int[this.capacity];
	}

	public boolean  isFull(QueueArray queue1){
		if(queue1.size==queue1.capacity){
			return true;
		}
		return false;
	}
	public boolean isEmpty(QueueArray queue1){
		if(queue1.size==0){
			return true;
		}
		return false;
	}

	public void enqueue(int item){
		if(!isFull(this)){
			this.rear=(this.rear+1)%this.capacity;
			this.queue[rear]=item;
			this.size++;
			System.out.println(item+" Enqueued ");
		}
	}



	public int dequeue(){
		if(!isEmpty(this)){
			int item=this.queue[this.front];
			this.front=(this.front+1)%this.capacity;
			this.size--;
			System.out.println(item+" dequeued ");
			return item;
		}
		return Integer.MIN_VALUE;
	}

	public int getFront(){
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.queue[this.front];
	}

	public int getRear(){
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.queue[this.rear];
	}

	public int getSize(){
		return this.size;
	}

	public int getCapacity(){
		return this.capacity;
	}
	public void printQueue(){
		for(int i=this.front;i<=this.rear;i++){
			System.out.print(this.queue[i]+" ");
		}
		System.out.println();
	}



}

class QNode{
	int key;
	QNode next;
	 public QNode(int key){
	 	this.key=key;
	 	this.next=null;
	 }
}

class QueueLinkedlist{
	QNode front;
	QNode rear;

	public void enqueue(int key){
		QNode temp=  new QNode(key);
		if( this.rear==null){
			this.front=this.rear=temp;
			
		}
		else {
			this.rear.next=new QNode(key);
			this.rear=this.rear.next;
			System.out.println(key+" Enqueued ");
		}

	}

	public int getFront(){
		if(this.front==null) return -1;
		else{
			return front.key;
		}
	}

	public int getRear(){
		if(this.rear==null) return -1;
		else{
			return rear.key;
		}
	}
	public boolean isEmpty(){
		if(this.front==null) return true;
		else return false;
	}





	public QNode dequeue(){
		if(this.front==null) return null;
		else{
			QNode temp=this.front;
			this.front=this.front.next;
			if(this.front== null) this.rear=null;
			System.out.println(temp.key+" Dequeued\"");
			return temp;
		}
	}

	public void printQueueList(){
		QNode temp=this.front;
		while(temp!=null){
			System.out.print(temp.key+"  ");
			temp=temp.next;
		}
		System.out.println();
	}

	public void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }


	public int getMultipleOf3(int ar[]){
		QueueLinkedlist q0=new QueueLinkedlist();
		QueueLinkedlist q1=new QueueLinkedlist();
		QueueLinkedlist q2=new QueueLinkedlist();
	int sum=0;
	Arrays.sort(ar);

	for(int i=0;i<ar.length;i++){
		if(ar[i]%3==0){
			q0.enqueue(ar[i]);

		}
		else if(ar[i]%3==1){
			q1.enqueue(ar[i]);
		}
		else{
			q2.enqueue(ar[i]);
		}
		sum=sum+ar[i];
	}

	q0.printQueueList();
	q1.printQueueList();
	q2.printQueueList();
	System.out.println("Sum is "+sum);
	if(sum%3==0){
		System.out.println("sum fall in  sum%3==0 condition");
		rvereseArray(ar,0,ar.length-1);
					
		StringBuilder strNum = new StringBuilder();
				for (int num : ar) 
				{
				     strNum.append(num);
				}
			return Integer.parseInt(strNum.toString());
	}
	else if(sum%3==1){
		System.out.println("sum fall in  sum%3==1 condition");

		if(!q1.isEmpty()){
			QNode temp=q1.dequeue();
			System.out.println("After dequeue q1 is ");
			q1.printQueueList();

		}
		else{
			if(!q2.isEmpty()){
				QNode temp=q2.dequeue();
			}
				else{
					System.out.println("Not possible");
					return -1;
				}
					if(!q2.isEmpty()){
				QNode temp=q2.dequeue();
				}
				else{
					System.out.println("Not possible");
					return -1;
				}
			}
		}
	  
   
	else if(sum%3==2){
		System.out.println("sum fall in  sum%3==2 condition");
		if(!q2.isEmpty()){
			QNode temp=q2.dequeue();
			System.out.println("After dequeue q2 is ");
			q2.printQueueList();
		}
		else{
			if(!q1.isEmpty()){
				QNode temp=q1.dequeue();}
				else{
					System.out.println("Not possible");
					return -1;
				}
					if(!q1.isEmpty()){
				QNode temp=q1.dequeue();
				}
				else{
					System.out.println("Not possible");
					return -1;
				}
			}
		}
	


	


	int w=0;
	int ar1[]=new int[200];
	while(!q0.isEmpty()){
		System.out.println("While q0 not is empty ");
		ar1[w++]=q0.getFront();
		QNode temp=q0.dequeue();
	}
	while(!q1.isEmpty()){
		System.out.println("While q1 not is empty ");
		ar1[w++]=q1.getFront();
		QNode temp=q1.dequeue();
	}
	while(!q2.isEmpty()){
		System.out.println("While q2 not is empty ");
		ar1[w++]=q2.getFront();
		QNode temp=q2.dequeue();
	}


	rvereseArray(ar1,0,ar1.length-1);
					
		StringBuilder strNum = new StringBuilder();
				for (int num : ar1) 
				{
				     strNum.append(num);
				}
			return Integer.parseInt(strNum.toString());

    }
}