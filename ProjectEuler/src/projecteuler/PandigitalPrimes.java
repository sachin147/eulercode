package projecteuler;

import java.io.IOException;
import java.util.Arrays;

public class PandigitalPrimes {
	public static void main(String args[]) throws IOException {
		long max = 0;
		for (int i = 10; i <= 999999999; i++) {
			if (isPandigital(i) && isPrime(i)) {
				max = i;
				System.out.println(max);
			}
		}
		System.out.println(max);
	}

	public static boolean isPandigital(int num) {
		String number = Long.toString(num);
		StringBuilder s = new StringBuilder(number);
		char[] chars = number.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		switch (sorted.length()) {
		case 2:
			return sorted.equals("12") ? true : false;
		case 3:
			return sorted.equals("123") ? true : false;
		case 4:
			return sorted.equals("1234") ? true : false;
		case 5:
			return sorted.equals("12345") ? true : false;
		case 6:
			return sorted.equals("123456") ? true : false;
		case 7:
			return sorted.equals("1234567") ? true : false;
		case 8:
			return sorted.equals("12345678") ? true : false;
		case 9:
			return sorted.equals("123456789") ? true : false;
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
