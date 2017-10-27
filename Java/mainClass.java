/*/*///variable overriding is not possible
/*   There is no polymorphism for fields in Java.

Variables decision happens at a compile time so always Base Class variables (not child’s inherited variables) will be accessed.

So whenever upcasting happens always remember

1) Base Class variables will be accessed.

2) Sub Class methods(overridden methods if overriding happened else inherited methods as it is from parent) will be called.        */



 /*class A{
    public int intVal = 1;
    public void identifyClass()
    {
        System.out.println("I am class A");
    }
}

  class Bvar extends A
{
    public int intVal = 2;
   // @Override
    public void identifyClass()
    {
        System.out.println("I am class B");
    }*/
    /*public static void main(String [] args)
    {
        A a = new A();
        B b = new B();
        A aRef;
        aRef = a;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
        B aRef1;
        aRef1 = b;
        System.out.println(aRef1.intVal);
        aRef1.identifyClass();
    }
}
*/
/*public class mainClass
{
    public static void main(String [] args)
    {
        A a = new A();
        B b = new B();
        A aRef;
        aRef = a;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
        aRef = b;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
    }
}*/



 class A{
    public int intVal = 1;
    public void identifyClass()
    {
        System.out.println("I am class A");
    }
}

 class B extends A
{
    public int intVal = 2;
    public void identifyClass()
    {
        System.out.println("I am class B");
    }
}

public class mainClass
{
    public static void main(String [] args)
    {
        A a = new A();
        B b = new B();
        A aRef;
        aRef = a;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
        aRef = b;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
    }
}