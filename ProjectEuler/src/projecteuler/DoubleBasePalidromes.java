package projecteuler;

public class DoubleBasePalidromes {
	public static void main(String args[]) {
		for (int i = 1; i < 1000000; i++) {
			if (isDecimalPalindrome(i) && isBinaryPalindrome(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isDecimalPalindrome(int n) {
		int result = 0;
		int temp = n;
		int rem;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			result = result * 10 + rem;
		}
		return temp == result ? true : false;
	}

	public static boolean isBinaryPalindrome(int n) {
		String numberString = Integer.toBinaryString(n);
		StringBuilder newString = new StringBuilder(numberString);
		return newString.reverse().toString().equals(numberString) ? true : false;
	}
}
