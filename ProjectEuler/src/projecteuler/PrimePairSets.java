package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimePairSets {
	public static void main(String args[]) throws IOException {
		Set<Integer> primeSet = new TreeSet<Integer>();

		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				getPair(i, primeSet);
			}
		}
		System.out.println(primeSet);
	}

	public static void getPair(int n, Set<Integer> primeSet) {
		for (int i = n; i < 1000; i++) {
			if (isPrime(i) && isPrime(Integer.parseInt(i + "" + n))
					&& isPrime(Integer.parseInt(n + "" + i))) {
				primeSet.add(n);
				primeSet.add(i);
				if (!allPrimePair(primeSet)) {
					primeSet.remove(i);
				}
			}
		}
	}

	public static boolean allPrimePair(Set<Integer> primeSet) {
		List<Integer> primeList = new ArrayList<Integer>(primeSet);
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i + 1; j < primeList.size(); j++) {
				if(isPrime(Integer.parseInt(primeList.get(i) + "" + primeList.get(j)))
						&& isPrime(Integer.parseInt(primeList.get(j) + "" + primeList.get(i)))) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
