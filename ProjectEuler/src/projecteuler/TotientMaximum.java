package projecteuler;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;

public class TotientMaximum {
	public static void main(String args[]) {
		long max = 0;
		long totientmax = 0;
		for (int i = 2; i < 1000000; i++) {
			Set<Integer> primeFactors = getPrimeFactors(i);
			int relativePrimes = getRelativePrimes(i, primeFactors);
			
			if(relativePrimes != 0) {
				totientmax = i / relativePrimes;
			}
			if (totientmax > max) {
				max = totientmax;
			}
		}
		System.out.println(" Max is " + max);
	}

	public static Set<Integer> getPrimeFactors(int numbers) {
		int n = numbers;
		Set<Integer> factors = new HashSet<Integer>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	public static int getRelativePrimes(int number, Set<Integer> factors) {
		int n = number;
		int count = 0;
		for (int i = 2; i < n; i++) {
			Set<Integer> primeFactors = getPrimeFactors(i);
			Set<Integer> intersection = (Set<Integer>) CollectionUtils
					.intersection(primeFactors, factors);
			if (intersection.size() == 0) {
				count++;
			}
		}
		return count;
	}
}
