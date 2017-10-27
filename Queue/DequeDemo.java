public class DequeDemo{

}


class Deque{
	int front,rear,size,capacity;
	int deque[];

	Deque(int size){
		this.capacity=1000;
		deque=new int[capacity];
		this.front=-1;
		this.rear=0;
		this.size=size;
	}

	public boolean isFull(){
		if((front==0 && rear==size-1) || front=rear+1)
			return true;
		else return false;
	}

	public boolean isEmpty(){
		if(front==-1)
			return true;
		else
			return false;
	}

	public void enqueFront(int item){
		if(isFull()){
			System.out.println("overflow");
		}
		if(this.front==-1){
			front=0;
			rear=0;
			deque[front]=item;
		}
		else if(this.front==0){
			front=size-1;
			deque[front]=item;
		}
		else{
			front--;
			deque[front]=item;
		}
	}

	public void enqueRear(int item){
		if(isFull()){
			System.out.println("overflow");
		}
	 else if(rear==size-1){
			rear=0;
		}
	else if(this.front==-1){
		rear=0;
		front=0;
	}	
		else{
			rear=rear+1;
		}
		deque[rear]=item;
	}

	public void deleteFront(){
		if(isEmpty){
			System.out.println("underflow");
		}
		else if(front==size-1){
			front=0;
		}
		else if(front==0 && rear ==0){
			front=-1;
		}
		else {
			front--;
		}

	}
}