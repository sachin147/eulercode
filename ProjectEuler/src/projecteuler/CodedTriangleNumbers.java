package projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodedTriangleNumbers {
	public static void main(String args[]) throws IOException {
		List<String> alphabets = Arrays.asList("A", "B", "C", "D", "E", "F",
				"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z");
		BufferedReader br = new BufferedReader(
				new FileReader(
						"/home/sachin/workspace/ProjectEuler/src/projecteuler/p042_words.txt"));
		String str = br.readLine();
		String arr[] = str.split(",");
		int n = 100;
		List<Integer> triangleNumbersList = getTriangleNumbers(n);
		// System.out.println(triangleNumbersList);
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			if (isTriangleWord(arr[i], triangleNumbersList, alphabets)) {
				System.out.println(arr[i]);
			}
		}

	}

	public static List<Integer> getTriangleNumbers(int n) {
		List<Integer> triangleNumbersList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			triangleNumbersList.add(i * (i + 1) / 2);
		}
		return triangleNumbersList;
	}

	public static boolean isTriangleWord(String word, List<Integer> numbers,
			List<String> alphabets) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			if (alphabets.contains(Character.toString(word.trim().charAt(i)))) {
				sum += alphabets.indexOf(Character.toString(word.charAt(i)));
			}
		}
		if (numbers.contains(sum)) {
			return true;
		} else {
			return false;
		}
	}
}
