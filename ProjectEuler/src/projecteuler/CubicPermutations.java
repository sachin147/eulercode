package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CubicPermutations {
	public static void main(String args[]) throws IOException {
		List<String> allCombinations = new ArrayList<String>();
		for (int num = 41063625; num <= 41063625; num++) {
			permutation("", num + "", allCombinations);
			// System.out.println(allCombinations);
			int count = 0;
			for (int i = 0; i < allCombinations.size(); i++) {
				boolean isCubeRoot = hasCubeRoot(allCombinations.get(i));
				if (isCubeRoot) {
					count++;
					System.out.println(allCombinations.get(i));
					if (count == 3) {
						System.out.println(allCombinations.get(i));
					}
				}

			}
		}

	}

	private static void permutation(String prefix, String str,
			List<String> allCombinations) {
		int n = str.length();
		if (n == 0) {
			// System.out.println(prefix);
			allCombinations.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1),
						allCombinations);
			}
		}
	}

	public static boolean hasCubeRoot(String number) {
		if (Math.round(Math.cbrt(Double.parseDouble(number))) == Math
				.cbrt(Double.parseDouble(number))) {
			return true;
		}
		return false;
	}

}
