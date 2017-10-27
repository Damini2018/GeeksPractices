// Java implementation to find the largest number
// with n set and m unset bits
import java.io.*;

class nsetMunsetBit 
{
	// Function to toggle the last m bits
	static int toggleLastMBits(int n, int m)
	{
		// if no bits are required to be toggled
		if (m == 0)
			return n;

		// calculating a number 'num' having 'm' bits
		// and all are set
		int num = (1 << m) - 1;

		// toggle the last m bits and return the number
		return (n ^ num);
	}

	// Function to find the largest number
	// with n set and m unset bits
	static int largeNumWithNSetAndMUnsetBits(int n, int m)
	{
		// calculating a number 'num' having '(n+m)' bits
		// and all are set
		int num = (1 << (n + m)) - 1;

		// required largest number
		return toggleLastMBits(num, m);
	}
	
	// driver program
	public static void main (String[] args) 
	{
		int n = 4, m = 1;
		System.out.println(largeNumWithNSetAndMUnsetBits(n, m));
	}
}

// Contributed by Pramod Kumar

