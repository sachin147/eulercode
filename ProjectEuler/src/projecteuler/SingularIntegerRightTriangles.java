package projecteuler;

public class SingularIntegerRightTriangles {
	public static void main(String args[]) {

		for (int m = 2; m < 10000; m++) {
			for (int n = 1; n < m; n++) {
				if (((m - n) % 2 != 0) && getGCD(n, m) == 1) {
					int a = m * m + n * n;
					int b = m * m - n * n;
					int c = 2 * m * n;
					int p = a + b + c;

					System.out.println(a + "   " + "  " + b + "  " + c + "  "
							+ p);
				}
			}
		}
	}

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return getGCD(b, a % b);
	}
}
