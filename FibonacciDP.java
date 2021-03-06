public static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	// recurstion and memoisation(top down)
	public static int fibTD(int n, int arr[]) {
		if (n == 0 || n == 1)
			return n;
		if (arr[n] != 0)
			return arr[n];

		return arr[n] = fibTD(n - 1, arr) + fibTD(n - 2, arr);

	}
	// buttom up

	public static int fibBU(int n) {
		int dp[] = new int[n + 1];
		// base case
		dp[0] = 0;
		dp[1] = 1;

		// BU
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];

	}

	public static int fibSpaceOpt(int n) {

		if (n == 0 || n == 1)
			return n;
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a=b;
			b=c;
		}
		return c;
	}

	public static void main(String[] args) {

		System.out.println(fibSpaceOpt(6));

	}
