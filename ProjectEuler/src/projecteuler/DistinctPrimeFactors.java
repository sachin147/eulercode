package projecteuler;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactors {
	public static void main(String args[]) throws IOException {
		Set<Integer> factors = null;
		for (int i = 0; i < 100000; i++) {
			factors = getPrimeFactors(i);
			if (factors.size() == 4) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(factors);
	}

	public static Set<Integer> getPrimeFactors(int number) {
		Set<Integer> factorList = new HashSet<>();
		int temp = number;
		for (int i = 2; i <= temp; i++) {
			while (temp % i == 0) {
				factorList.add(i);
				temp = temp / i;
			}
		}
		return factorList;
	}
}
