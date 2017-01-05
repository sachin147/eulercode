package projecteuler;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LychrelNumbers {
	public static void main(String args[]) throws IOException {
		Set<Integer> nonLychrel = new HashSet<Integer>();
		for (int i = 11; i <= 10000; i++) {
			int x = i;
			for (int j = 1; j <= 50; j++) {
				int n = reverseNumber(x);
				//System.out.println("n  " + n);
				x = x + n;
				//System.out.println("x   " + x);
				if (isPalindrome(x))
					break;
			}
			// System.out.println(i + "   is not a lychrel number");
			nonLychrel.add(i);
		}

		for (int i = 11; i <= 10000; i++) {
			if (!nonLychrel.contains(i)) {
				System.out.println(i + "   is a lychrel number");
			}
		}
	}

	public static int reverseNumber(int n) {
		int num = n;
		int t = 0;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10;
			rev = rev + (num % 10);
			num = num / 10;
		}
		// System.out.println("Reverse of   " + n + "  is  " + rev);
		return rev;
	}

	public static boolean isPalindrome(int n) {
		int num = n;
		int result = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = result * 10 + rem;
		}
		return n == result;
	}
}
