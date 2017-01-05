package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DigitCancelingFractions {
	public static void main(String args[]) throws IOException {
		List<Integer> numerators = new ArrayList<Integer>();
		List<Integer> denominators = new ArrayList<Integer>();
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if (i / j < 1) {
					numerators.add(i);
					denominators.add(j);
				}
			}
		}

		System.out.println(numerators.size());
		System.out.println(denominators.size());
		System.out.println(numerators);
		System.out.println(denominators);
		double ans = calculatePandigitals(numerators, denominators);
		System.out.println("Pandigital product is "+ans);
	}

	public static double calculatePandigitals(List<Integer> numerators,
			List<Integer> denominators) {
		int size = numerators.size();
		double denominatorproduct = 1;
		for (int i = 0; i < size; i++) {
			int numfirst = numerators.get(i)/10;
			int numsecond = numerators.get(i)%10;
			int denfirst = denominators.get(i)/10;
			int densecond = denominators.get(i)%10;
			
			if(numsecond == denfirst && numfirst < densecond && numsecond > numfirst && denfirst > densecond ) {
				denominatorproduct = denominatorproduct*densecond;
				System.out.println("n1 " +numfirst);
				System.out.println("n2 "+numsecond);
				System.out.println("d1 "+denfirst);
				System.out.println("d2 "+densecond);
			}					
		}
		return denominatorproduct;
	}
}
