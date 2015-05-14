// Author: Jesse Sheridan
// Email: jesse.sheridan@gmail.com
// Date: 04/13/2015
// Description: Very basic recursive Fibonacci sum method

package playArea;

public class Fib {

    /**
     * Returns the Fibonacci sum of the parameter passed in
     * This is a recursive method with the base case being n <= 1.
     * 
     * @param n the number that we want to know the sum of
     * @return a number that is the Fibonacci sum of n
     */
	public static int fib(int n) {
		if (n <= 1)
			return n;
		return (fib(n-1) + fib(n-2));
	}
	
	public static void main(String[] args) {
	
		// Verify the function performs correctly.
		for (int i = 0; i < 11; i++)
			System.out.println("Fib of " + i + ": " + fib(i));
	}

}
