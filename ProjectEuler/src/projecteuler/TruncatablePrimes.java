package projecteuler;

import java.io.IOException;

public class TruncatablePrimes {
	public static void main(String args[]) throws IOException {
		for (int i = 10; i < 1000000; i++) {
			if (truncateLeftPrime(i) && truncateRightPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean truncateLeftPrime(int n) {
		int temp = n;
		int rem = 0;
		int i = 1;

		do {
			rem = (int) (temp % Math.pow(10, i));
			if (!isPrime(rem)) {
				return false;
			}
			i++;

		} while (rem != temp);

		return true;
	}

	public static boolean truncateRightPrime(int n) {
		int temp = n;
		while (temp > 0) {
			if (!isPrime(temp)) {
				return false;
			}
			temp = temp / 10;
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
