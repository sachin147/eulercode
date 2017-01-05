package projecteuler;

public class CountingSummations {
	public static void main(String args[]) {
		int n = partitions(4);
		System.out.println("Number of partitions " + n);
	}

	public static int partitions(int n) {
		return partitions(1, n);
	}

	public static int partitions(int k, int n) {
		if (k <= 0 || n <= 0 || k > n)
			return 0;
		else if (k == n) {
			return 1;
		} else {
			//print(k, n);
			return partitions(k + 1, n) + partitions(k, n - k);
		}

	}

	public static void print(int k, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(k);
		}
		System.out.println(n);
	}
}
