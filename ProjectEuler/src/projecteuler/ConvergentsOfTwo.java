package projecteuler;

import java.io.IOException;

public class ConvergentsOfTwo {

	public static void main(String args[]) throws IOException {

		double x = 1.5;
		for (int i = 0; i <= 10; i++) {
			double newx = 1 + 1/(1+x);
			System.out.println(newx);
			x = newx;
		}
	}
}
