package codeSnippet;

public class FibonacciNumber {	
	
	void fibonacciNumber(int n) {
		int febonacciZero = 0;
		int febonacciOne = 1;
		for(int number=0;number<=n;number++) {			
			System.out.println("fibonacciNumber for zero = " + febonacciZero );
			int febNumber = febonacciOne + febonacciZero;
			febonacciZero = febonacciOne;
			febonacciOne = febNumber;
		}	
	}

	public static void main(String[] args) {
		FibonacciNumber findFibNumber = new FibonacciNumber();
		findFibNumber.fibonacciNumber(4);
	}
}
