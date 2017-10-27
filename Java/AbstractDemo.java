
public class AbstractDemo{
	public static void main(String[] args) {
		System.out.println("Instantiating methods");
		C obj= new D();
		obj.methodA();
		obj.methodB();
		obj.methodC();
		obj.methodD();
		//obj.methodExtraE();
		//obj.methodExtraB();
		//obj.methodF();

		//A obj= new F();
		//B obj= new F();
		//C obj= new F();
		//D obj= new F();

	}
}

abstract class A{
	 void methodA(){
	 	System.out.println("hello method A");
	}
	abstract void methodB();
	abstract void methodC();
	abstract void methodD();

}

abstract class B extends A{
	void methodB(){
		System.out.println("hello method B");
	}
	void methodExtraB(){
		System.out.println("hello in extra B");
	}
}

abstract class C extends B{
	void methodC(){
		System.out.println("hello method C");
	}
}

 class D extends C{

 	@Override
 	void methodA(){
 		System.out.println("hello method A inside D");
 	}
	void methodD(){
		System.out.println("hello method D");
	}
}

class E extends C{
	void methodD(){
		System.out.println("hello method E overwritting th emethod D");
	}
	void methodExtraE(){
		System.out.println("hello in extra E");
	}
}

class F extends E{
	void methodF(){
		System.out.println("hello method F");
	}
}

/*class G extends F(){

}*/