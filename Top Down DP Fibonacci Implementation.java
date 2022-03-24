	public static int fib(int n) {
		if(n==0 || n== 1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	//recurstion and memoisation
	public static int fibDP(int n,int arr[]) {
		if(n==0 || n== 1)
			return n;
		if(arr[n] != 0)
			return arr[n];

	return	arr[n]=fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[100];
		System.out.println(fibDP(6, arr));
	
	}