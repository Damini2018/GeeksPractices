/*
Variables are resolved compile-time, methods run-time. The aRef is of type A, therefore aRef.Intvalue is compile-time resolved to 1.
*/




 class A {
	 void x(){
		System.out.println("parent A");
	}
}

public class B extends A{
	 void x(){
		System.out.println("child B");
	}

	public static void main(String[] args) {
		A a= new B();
		a.x();
	}
}