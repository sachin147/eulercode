package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class CyclicalFigurateNumbers {
	public static void main(String args[]) throws Exception {
		List<Integer> triangleNumbers;
		List<Integer> squareNumbers;
		List<Integer> rectangleNumbers;
		List<Integer> pentagonalNumbers;
		List<Integer> hexagonalNumbers;
		List<Integer> octagonalNumbers;

		triangleNumbers = getTriangleNumbers();
		squareNumbers = getSquareNumbers();
		rectangleNumbers = getRectangleNumbers();
		pentagonalNumbers = getPentagonalNumbers();
		hexagonalNumbers = getHexagonalNumbers();
		octagonalNumbers = getOctagonalNumbers();

		System.out.println(triangleNumbers);
		System.out.println(squareNumbers);
		System.out.println(rectangleNumbers);
		System.out.println(hexagonalNumbers);
		System.out.println(octagonalNumbers);

		for (int i = 0; i < triangleNumbers.size(); i++) {
			for (int j = 0; j < squareNumbers.size(); j++) {
				for (int k = 0; k < pentagonalNumbers.size(); k++) {
					if (Math.log10(triangleNumbers.get(i)) + 1 == 4
							&& Math.log10(squareNumbers.get(i)) + 1 == 4 && Math.log10(pentagonalNumbers.get(i))+1 == 4) {
						
					}

				}
			}
		}
	}

	public static List<Integer> getTriangleNumbers() {
		List<Integer> triangleNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 150; i++) {
			int t = i * (i + 1) / 2;
			triangleNumbers.add(t);
		}
		return triangleNumbers;
	}

	public static List<Integer> getSquareNumbers() {
		List<Integer> squareNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			int t = i * i;
			squareNumbers.add(t);
		}
		return squareNumbers;
	}

	public static List<Integer> getRectangleNumbers() {
		List<Integer> rectangleNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			int t = i * (3 * i - 1) / 2;
			rectangleNumbers.add(t);
		}
		return rectangleNumbers;
	}

	public static List<Integer> getPentagonalNumbers() {
		List<Integer> pentagonalNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			int t = i * (2 * i - 1);
			pentagonalNumbers.add(t);
		}
		return pentagonalNumbers;
	}

	public static List<Integer> getHexagonalNumbers() {
		List<Integer> hexagonalNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			int t = i * (5 * i - 3) / 2;
			hexagonalNumbers.add(t);
		}
		return hexagonalNumbers;
	}

	public static List<Integer> getOctagonalNumbers() {
		List<Integer> octagonalNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			int t = i * (3 * i - 2);
			octagonalNumbers.add(t);
		}
		return octagonalNumbers;
	}

}
