package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsecutivePrimeSum {
	public static void main(String args[]) throws IOException {
		List<Integer> primeNumbers = getPrimeNumbers(100);
		List<Integer> sumList = new ArrayList<Integer>();
		int sum = 0;
		int max = 0;
		System.out.println(primeNumbers);
		for (int i = 0; i < primeNumbers.size(); i++) {
			sum = sum + primeNumbers.get(i);
			sumList.add(sum);
			/*
			 * if (isPrime(sum) && sum > max && sum < 100) {
			 * System.out.println(primeNumbers.get(i)); max = sum; }
			 */
		}
		System.out.println("max " + max);
		System.out.println(sumList);
		int maxSumPrime = 0;
		for (int i = sumList.size() - 1; i >= 0; i--) {
			if (isPrime(sumList.get(i)) && sumList.get(i) < 100) {
				maxSumPrime = sumList.get(i);
				break;
			}
		}
		System.out.println(maxSumPrime);
	}

	public static List<Integer> getPrimeNumbers(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			boolean isPrimeNumber = true;
			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop

				}
			}
			// print the number if prime
			if (isPrimeNumber && i != 1) {
				primes.add(i);
			}
		}
		return primes;
	}

	public static boolean isPrime(int sum) {
		if (sum <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(sum); i++) {
			if (sum % i == 0) {
				return false;
			}
		}
		return true;
	}
}
