package projecteuler;

import java.io.IOException;

public class ThousandDigitFibonacci {
	public static void main(String args[]) throws IOException {
		String number = "";
		long n = 0l;
		int count = 2;
		while(number.length() != 1000) {
			n = calcFibonacci(count);
			System.out.println(n);
			number = Long.toString(calcFibonacciIterative(count));
			System.out.println(number);
			count++;
		}
		System.out.println(number);
	}
	
	public static long calcFibonacci(int n) {
		if(n <= 1)
			return n;
		else 
			return calcFibonacci(n-1)+calcFibonacci(n-2);
	}
	
	public static long calcFibonacciIterative(int n) {
		int[] a = new int[n+1];
		a[0] = 0;
		a[1] = 1;
		for(int i=2;i<=n ;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		return a[n];
	}
}
