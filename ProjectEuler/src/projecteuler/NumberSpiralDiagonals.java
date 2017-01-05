package projecteuler;

import java.io.IOException;

public class NumberSpiralDiagonals {
	public static void main(String args[]) throws IOException {
		int sum = 0;

		for (int i = 1; i <= 500; i++) {
			sum += getDiagonalsSum(i);
		}
		System.out.println(" Sum is " + sum);
	}

	public static int getDiagonalsSum(int num) {
		int total = 0;
		int n1 = 16 * (int) Math.pow(num, 2);
		int n2 = 4 * num;
		total = total + (n1 + n2 + 4);

		return total;
	}
}
