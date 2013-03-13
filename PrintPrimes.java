class PrintPrimes {
    public static void main(String[] args) {
	primes(100);
	return;
    }

    public static void primes(int n) {
	boolean[] primecache = new boolean[n];
	primeHelper(n, primecache);
	for (int i = 0; i < n; i++) {
	    if (primecache[i]) {
		System.out.println(i);
	    }
	}
    }

    public static void primeHelper(int n, boolean[] primecache) {
	primecache[0] = false;
	primecache[1] = false;
	for (int i = 2; i < n; i++) {
	    primecache[i] = true;
	}

	int limit = (int) Math.sqrt(n);

	for (int i = 2; i <= limit; i++) {
	    for (int j = i*i ; j < n ; j += i) {
		if (primecache[j]) {
		    primecache[j] = false;
		}
	    }
	}
    }
}