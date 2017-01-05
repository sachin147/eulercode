package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DigitFifthPowers {
	public static void main(String args[]) throws IOException {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 2; i <= 99999; i++) {
			boolean isValid = isFifthPower(i);
			if (isValid) {
				a.add(i);
			}
		}
		System.out.println(a);
		int sum=0;
		for(int i=0;i<a.size();i++){
			sum+=a.get(i);
		}
		System.out.println(sum);
	}

	public static boolean isFifthPower(int num) {
		int n = num;
		int temp = 0, fourthPower = 0, tempSum = 0;
		while (n != 0) {
			temp = n % 10;
			fourthPower = (int) Math.pow(temp, 5);
			tempSum += fourthPower;
			n = n / 10;
		}
		if (tempSum == num)
			return true;
		else
			return false;
	}
}
