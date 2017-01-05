package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TriangularPentagonalHexagonal {
	public static void main(String args[]) throws IOException {
		int n = 1000;
		List<Integer> triangleNumbersList = getTriangleNumbers(n);
		List<Integer> penatagonalNumbersList = getPentagonalNumbers(n);
		List<Integer> hexagonalNumbersList = getHexagonalNumbers(n);

		for (int num : triangleNumbersList) {
			if (penatagonalNumbersList.contains(num)
					&& hexagonalNumbersList.contains(num)) {
				System.out.println(num);
			}
		}
	}

	public static List<Integer> getTriangleNumbers(int n) {
		List<Integer> triangleNumbersList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			triangleNumbersList.add(i * (i + 1) / 2);
		}
		return triangleNumbersList;
	}

	public static List<Integer> getPentagonalNumbers(int n) {
		List<Integer> pentagonNumbersList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			pentagonNumbersList.add(i * (3 * i - 1) / 2);
		}
		return pentagonNumbersList;
	}

	public static List<Integer> getHexagonalNumbers(int n) {
		List<Integer> hexagonNumbersList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			hexagonNumbersList.add(i * (2 * i - 1));
		}
		return hexagonNumbersList;
	}

}
