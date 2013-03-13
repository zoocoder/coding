import java.util.Arrays;

public class stringPermute {
    /** 1.3 Given two strings, decides if one is a permutation of the other. */
    public static void main(String[] args) {
	String s1 = "victor";
	String s2 = "rotciv";
	String s3 = "lucheng";
	String s4 = "luchink";
	boolean result1 = permute1(s1, s2);
	boolean result2 = permute1(s3, s4);
	boolean result3 = permute2(s1, s2);
	boolean result4 = permute2(s3, s4);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
    }
    
    public static String sort(String str) {
	char[] strArr = str.toCharArray();
	java.util.Arrays.sort(strArr);
	return new String(strArr);
    }

    /**Just sort and compare.*/
    public static boolean permute1(String s1, String s2) {
	if (s1.length() != s2.length()) return false;
	return sort(s1).equals(sort(s2));
    }

    /** Keep count of characters. */
    public static boolean permute2(String s1, String s2) {
	if (s1.length() != s2.length()) return false;
	int[] letters = new int[256];
	char[] s1Arr = s1.toCharArray();
	for (char c : s1Arr) {
	    letters[c]++;
	}

	for (int i = 0; i < s2.length(); i++) {
	    int c = (int) s2.charAt(i);
	    if (letters[c] != 1) return false;
	}
	return true;
    }
}