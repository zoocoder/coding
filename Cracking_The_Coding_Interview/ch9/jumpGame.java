import java.util.Arrays;

class jumpGame {
    public static void main(String[] args) {
	int[] input = {1, 0, 1, 4, 2, 1, 2};
	boolean[] result = jumpGame(input);
	String str = Arrays.toString(result);
	System.out.println(str);
    }

    public static boolean[] jumpGame(int[] input) {
	if (input == null) return null;
	boolean[] cache = new boolean[input.length];
	jumpGameHelp(input, cache, 0);
	return cache;
    }

    public static void jumpGameHelp(int[] input, boolean[] cache, int i) {	
	if (i >= input.length || i < 0) return;

	if (input[i]+i < input.length) {
	    if (!cache[i] && input[i+input[i]] == 0 || cache[i+input[i]]) {
		cache[i] = true;
		jumpGameHelp(input, cache, i+1);
	    }
	}

	if (i-input[i] >= 0) {
	    if (!cache[i] && input[i-input[i]] == 0 || cache[i-input[i]]) {
		cache[i] = true;
		jumpGameHelp(input, cache, i+1);
	    }
	}
    }
}