
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<11;i++){
			System.out.println(Thread.currentThread().getId()+" Value is "+i);


		}
		  Thread.sleep(200);
	}
}




public class ThreadDemo{
	public static void main(String[] args) {
		MyThread demo1=new MyThread();
		demo1.start();	
		
		MyThread demo2=new MyThread();
		demo2.start();	
	}
}