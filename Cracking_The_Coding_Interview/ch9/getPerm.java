import java.util.ArrayList;

class getPerm {
    public static void main(String[] args) {
	String input = "victor";
	ArrayList<String> result = getPerms(input);
	for (String s : result) {
	    System.out.println(s);
	}
    }

    public static ArrayList<String> getPerms(String str) {
	if (str == null) {
	    return null;
	}
	ArrayList<String> permutations = new ArrayList<String>();
	if (str.length() == 0) {
	    permutations.add("");
	    return permutations;
	}

	char first = str.charAt(0);
	String remainder = str.substring(1);
	ArrayList<String> words = getPerms(remainder);
	for (String word : words) {
	    for (int i = 0; i <= word.length(); i++) {
		String s = insertCharAt(word, first, i);
		permutations.add(s);
	    }
	}
	return permutations;
    }

    public static String insertCharAt(String str, char c, int index) {
	String start = str.substring(0, index);
	String end = str.substring(index);
	return start + c + end;
    }
}
	   