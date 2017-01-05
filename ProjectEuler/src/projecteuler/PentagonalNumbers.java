package projecteuler;

import java.io.IOException;

public class PentagonalNumbers {
	public static void main(String args[]) throws IOException {
		int result = 0;
		boolean notFound = true;
		int i = 1;

		while (notFound) {
			i++;
			int n = i * (3 * i - 1) / 2;

			for (int j = i - 1; j > 0; j--) {
				int m = j * (3 * j - 1) / 2;
				if (isPentagonal(n - m) && isPentagonal(n + m)) {
					result = n - m;
					System.out.println(i);
					System.out.println(j);
					System.out.println(result);
					notFound = false;
					break;
				}
			}
		}
	}

	public static boolean isPentagonal(int number) {
		double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
		return penTest == ((int) penTest);
	}
}
