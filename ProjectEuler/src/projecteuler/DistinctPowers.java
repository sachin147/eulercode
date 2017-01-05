package projecteuler;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {
	public static void main(String args[]) throws IOException {
		Set<Integer> distinctpowers = new HashSet<Integer>();
		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= 100; b++) {
				int x = (int) Math.pow(a, b);
				distinctpowers.add(x);
			}
		}
		System.out.println(distinctpowers);
		System.out.println("length is " + distinctpowers.size());
	}
}
