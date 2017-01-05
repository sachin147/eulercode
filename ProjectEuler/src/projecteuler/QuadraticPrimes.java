package projecteuler;

public class QuadraticPrimes {
	public static void main(String args[]) {
		int aMax = 0, bMax = 0, nMax = 0;

		for (int a = -1000; a <= 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int n = 0;
				while (isPrime(Math.abs(n * n + a * n + b))) {
					n++;
				}

				if (n > nMax) {
					aMax = a;
					bMax = b;
					nMax = n;
				}
			}
		}
		System.out.println("a " + aMax + "b " + bMax + "n" + nMax);

	}

	public static boolean isPrime(int n) {
		int i;
		if (n <= 0)
			return true;
		if (n == 2)
			return true;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
