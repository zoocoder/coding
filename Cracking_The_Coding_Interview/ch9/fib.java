class Fib {
    public static void main(String[] args) {
	int result = fib(10000);
	System.out.println(result);
    }

    public static int fib(int n) {
	int[] cache = new int[n+1];
	cache[0] = 0;
	cache[1] = 1;
	if (n <= 1) return n;
	for (int i = 2; i <= n; i++) {
	    cache[i] = cache[i-1] + cache[i-2];
	}
	return cache[n];
    }
}
	    