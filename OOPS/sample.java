// Java program to demonstrate multiple inheritance 
// in interfaces
import java.io.*;
interface intfA
{
	void geekName();
}

interface intfB 
{
	void geekInstitute();
}

interface intfC extends intfA, intfB 
{
	void geekBranch();
	void geekInstitute();
}

// class implements both interfaces and provides
// implementation to the method.
public class sample implements intfC
{
	public void geekName()
	{
		System.out.println("Rohit");
	}

	public void geekInstitute()
	{
		System.out.println("JIIT");
	}

	public void geekBranch()
	{
		System.out.println("CSE");
	}
	
	public static void main (String[] args)
	{
		sample ob1 = new sample();

		// calling the method implemented
		// within the class.
		ob1.geekName();
		ob1.geekInstitute();
		ob1.geekBranch();
	}
}
