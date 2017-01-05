package projecteuler;

import java.io.IOException;

public class CoinSums {
	public static void main(String args[]) throws IOException {
		/* # the 8 coins correspond to 8 columns */
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[][] waysmatrix = new int[201][8];

		for (int i = 0; i <= 200; i++) {
			waysmatrix[i][0] = 1;
		}

		for (int i = 0; i <= 200; i++) {
			for (int j = 1; j < coins.length; j++) {
				waysmatrix[i][j] = 0;
				/* Is the target big enough to accomodate coins[x]? */
				if (i >= coins[j]) {
					/*
					 * # If yes, then the number of ways to form the target sum
					 * are obtained via: (a) the number of ways to form this
					 * target using ONLY coins less than column x i.e.
					 * matrix[y][x-1]
					 */
					waysmatrix[i][j] += waysmatrix[i][j - 1];
					/*
					 * # plus (b) the number of ways to form this target when
					 * USING the coin of column x which means for a remainder of
					 * y-coins[x] i.e. matrix[y-coins[x]][x]
					 */waysmatrix[i][j] += waysmatrix[i - coins[j]][j];
				} else {
					/*
					 * # if the target is not big enough to allow # usage of the
					 * coin in column x, # then just copy the number of ways
					 * from the # column to the left (i.e. with smaller coins)
					 */
					waysmatrix[i][j] = waysmatrix[i][j - 1];
				}
			}
		}

		for (int i = 0; i <= 200; i++) {
			System.out.print("target " + i + "            ");
			for (int j = 0; j < coins.length; j++) {
				System.out.print(waysmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
