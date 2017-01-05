package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircularPrimes {
	public static void main(String args[]) throws IOException {

		for (int num = 10; num <= 1000000; num++) {
			List<Integer> allCombinations = rotatenumber(num);
			//System.out.println(allCombinations);
			boolean isAllPrime = isAllPrime(allCombinations);
			if (isAllPrime) {
				System.out.println(num);
			}
		}

	}

	public static List<Integer> rotatenumber(int number) {
		long start = number;
		List<Integer> allCombinations = new ArrayList<>();
		int numdigits = (int) Math.log10((double) number); // would return
															// numdigits - 1
		int multiplier = (int) Math.pow(10.0, (double) numdigits);

		/*
		 * System.out.println(number); System.out.println(numdigits);
		 * System.out.println(multiplier);
		 */
		while (true) {
			long q = number / 10;
			long r = number % 10;

			// 1234 = 123;
			number = number / 10;
			number = (int) (number + multiplier * r);

			//System.out.println(number);
			allCombinations.add(number);
			if (number == start)
				break;
		}

		return allCombinations;
	}

	public static boolean isAllPrime(List<Integer> allCombinations) {
		boolean allPrime = true;

		for (int i = 0; i < allCombinations.size(); i++) {
			if (!isPrime(allCombinations.get(i))) {
				allPrime = false;
			}
		}
		return allPrime;
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
