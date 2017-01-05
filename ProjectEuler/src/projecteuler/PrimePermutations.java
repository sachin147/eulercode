package projecteuler;

import java.io.IOException;
import java.util.Arrays;

public class PrimePermutations {
	public static void main(String args[]) throws IOException {

		for (int i = 1000; i < 9999; i++) {
			for (int j = 1; j < 9999; j++) {
				int k = i + j;
				int l = k + j;
				if (k < 9999 && isPrime(k) && hasSameDigits(k, i) && l < 9999
						&& isPrime(l) && hasSameDigits(l, k)
						&& (i != 1487 || k != 4817))
					System.out.println("" + i + " " + k + " " + l);
			}
		}
	}

	private static boolean hasSameDigits(int x, int y) {
		char[] xdigits = Integer.toString(x).toCharArray();
		char[] ydigits = Integer.toString(y).toCharArray();
		Arrays.sort(xdigits);
		Arrays.sort(ydigits);
		return Arrays.equals(xdigits, ydigits);
	}

	private static boolean isPrime(int n) {
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
