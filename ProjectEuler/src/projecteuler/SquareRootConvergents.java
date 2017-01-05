package projecteuler;

import java.io.IOException;

public class SquareRootConvergents {
	public static void main(String args[]) throws IOException {
		double x = 1.5d;
		for (int i = 1; i <= 100; i++) {
			double sum = 1 + (1/(1+x));
			System.out.println("   sum is "+sum);
		}

	}
}
