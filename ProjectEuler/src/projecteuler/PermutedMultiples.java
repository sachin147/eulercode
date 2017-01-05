package projecteuler;

import java.io.IOException;
import java.util.Arrays;

public class PermutedMultiples {
	public static void main(String args[]) throws IOException {
		int i = 1;
		while (true) {
			if (areSame(i)) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}

	public static boolean areSame(int i) {
		String o = sortedString(i);
		if(o.equals(sortedString(2*i)) && o.equals(sortedString(3*i)) && o.equals(sortedString(4*i)) && o.equals(sortedString(5*i)) && o.equals(sortedString(6*i) ))
			return true;
		else 
			return false;
		
	}

	public static String sortedString(int i) {
		String n = Integer.toString(i);
		char[] arr = n.toCharArray();
		Arrays.sort(arr);
		String sortedString = new String(arr);
		return sortedString;
	}
}
