class Stairs {
    public static void main(String[] args) {
	int result = stairs(10);
	System.out.println(result);
    }
    
    public static int stairs(int n) {
	int[] cache = new int[n+1];
	return stairsHelp(n, cache);
    }

    public static int stairsHelp(int n, int[] cache) {
	if (n < 0) {
	    return 0;
	} else if (n == 0) {
	    return 1;
	} else if (cache[n] != 0) {
	    return cache[n];
	} else {
	    cache[n] = stairsHelp(n-1, cache) + stairsHelp(n-2, cache) + stairsHelp(n-3, cache);
	}
	return cache[n];
    }
}
	