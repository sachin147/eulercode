package projecteuler;

import java.io.IOException;

public class ExtendedEuclid {
	public static void main(String args[]) throws IOException {
		int[] ans = new int[3];

		ans = ExtendedEuclid(20, 50);
		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);

	}

	public static int[] ExtendedEuclid(int a, int b)
	/*
	 * This function will perform the Extended Euclidean algorithm to find the
	 * GCD of a and b. We assume here that a and b are non-negative (and not
	 * both zero). This function also will return numbers j and k such that d =
	 * j*a + k*b where d is the GCD of a and b.
	 */
	{
		int[] ans = new int[3];
		int q;

		if (b == 0) { /* If b = 0, then we're done... */
			ans[0] = a;
			ans[1] = 1;
			ans[2] = 0;
		} else { /* Otherwise, make a recursive function call */
			q = a / b;
			System.out.println("q "+q);
			ans = ExtendedEuclid(b, a % b);
			System.out.println("Before swap "+ans[0] + " " + ans[1] + " " + ans[2]);
			int temp = ans[1] - ans[2] * q;
			System.out.println("temp "+temp);
			ans[1] = ans[2];
			System.out.println("ans[1] "+ans[1]);
			ans[2] = temp;
			System.out.println("ans[2] "+ans[2]);
			System.out.println("After swap "+ans[0] + " " + ans[1] + " " + ans[2]);
			System.out.println("");
		}

		return ans;
	}
}
