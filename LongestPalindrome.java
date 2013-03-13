class LongestPalindrome {
    public static void main(String[] args) {
	String s = "dcbabcbae";
	int result = LP(s, 0, s.length()-1);
	System.out.println(result);
    }

    public static int LP(String s, int i, int j) {
	if (i > j) return -1;
	if (i == j) return 1;
	if (s.charAt(i) == s.charAt(j)) {
	    return LP(s, i+1, j-1) + 2;
	}
	return Math.max(LP(s, i+1, j), LP(s, i, j-1));
    }
}