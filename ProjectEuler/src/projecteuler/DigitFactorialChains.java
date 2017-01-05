package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class DigitFactorialChains {
	public static void main(String args[]) {
		int result = 0;
		for (int i = 2; i <= 100; i++) {
			int factorialsum = getFactorialSum(i);
			System.out
					.println(" Factorial Sum of " + i + " is " + factorialsum);
			int n = i;
			List<Integer> sequence = new ArrayList<Integer>();

			while (!sequence.contains(n)) {
				sequence.add(n);
				n = getFactorialSum(n);
			}

			if (sequence.size() == 60) {
				result++;
			}
		}
		System.out.println(" Number of sequence with size 60 is " + result);
	}

	public static int getFactorialSum(int num) {
		int n = num;
		int sum = 0;
		while (n != 0) {
			int temp = n % 10;
			int fact = getFactorial(temp);
			sum = sum + fact;
			n = n / 10;
		}
		return sum;
	}

	public static int getFactorial(int num) {
		int n = num;
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;

	}
}
