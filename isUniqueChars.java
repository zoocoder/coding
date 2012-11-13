public class isUniqueChars {
    /** Determines whether or not a string only contains unique characters, assume ASCII */
    public static void main(String[] args) {
	boolean result1 = isUniqueChars1("victorzhu");
	boolean result2 = isUniqueChars1("luchengandfranceszhang");
	boolean result3 = isUniqueChars2("adammedwang");
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
    }
    public static boolean isUniqueChars1(String str) {
	if (str.length() > 256) return false;
	
	boolean[] char_set = new boolean[256];
	for (int i = 0; i < str.length(); i++) {
	    int val = str.charAt(i);
	    if (char_set[val]) {
		return false;
	    }
	    char_set[val] = true;
	}
	return true;
    }
    
    public static boolean isUniqueChars2(String str) {
	if (str.length() > 256) return false;
	
	/** Use a bit vector to decrease space complexity by 8 */
	int check = 0;
	for (int i = 0; i < str.length(); i++) {
	    int val = str.charAt(i) - 'a';
	    if ((check & (1 << val)) > 0) {
		return false;
	    }
	    check |= (1 << val);
	}
	return true;
    }
}