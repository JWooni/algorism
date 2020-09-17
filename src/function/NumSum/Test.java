package function.NumSum;

public class Test {
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		} // end for
		return ans;
	} // sum
} // class