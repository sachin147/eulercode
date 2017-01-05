package projecteuler;

import java.io.IOException;

public class DigitFactorials {
	public static void main(String args[]) throws IOException {

		for (int i = 10; i < 2540161; i++) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				int num = temp % 10;
				temp = temp / 10;
				int fact = factorial(num);
				sum = sum + fact;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

	public static int factorial(int x) {
		if (x == 0) {
			return 1;
		}
		int y = x;
		for (int i = 1; i < x; i++) {
			y *= i;
		}
		return y;
	}
}
