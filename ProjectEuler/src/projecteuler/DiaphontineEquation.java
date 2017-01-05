package projecteuler;

import java.io.IOException;

public class DiaphontineEquation {
	public static void main(String args[]) throws IOException {
		int[] nums = { 2, 3, 5, 6, 7 };
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					if (Math.pow(j, 2) - i * Math.pow(k, 2) == 1) {
						if (j > max) {
							max = j;
						}
					}
				}
			}
		}
		System.out.println("Max is " + max);
	}
}
