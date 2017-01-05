package projecteuler;

public class CombinatoricSelections {
	public static void main(String args[]) {
		int count = 0;
		for (long n = 1; n <= 100; n++) {
			for (long r = 1; r <= n; r++) {
				long num = fact(n);
				long den1 = fact(r);
				long den2 = fact(n - r);
				long denmul = den1 * den2;
				if (denmul == 0) {
					System.out.println(n + " " + r);
				}
				long combination = num / denmul;
				if (combination > 1000000) {
					System.out.println(combination);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static long fact(long num) {
		if (num == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
