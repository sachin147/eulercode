package projecteuler;

import java.io.IOException;
import java.math.BigInteger;

public class SelfPowers {
	public static void main(String args[]) throws IOException {
		BigInteger sum = new BigInteger("0");

		for (long i = 1; i <= 1000l; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow((int)i));
		}
		System.out.println(sum);
		BigInteger m = sum.mod(new BigInteger("10"));
		System.out.println(m);
	}
}
