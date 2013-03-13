import java.util.ArrayList;

class generateParens {
    public static void main(String[] args) {
	ArrayList<String> result = generateParams(3);
	for (String s : result) {
	    System.out.println(s);
	}
    }

    public static ArrayList<String> generateParams(int n) {
	char[] str = new char[2*n];
	ArrayList<String> list = new ArrayList<String>();
	addParen(list, n, n, str, 0);
	return list;
    }

    public static void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count) {
	if (leftRem < 0 || rightRem < leftRem) return;

	if (leftRem == 0 && rightRem == 0) {
	    String s = String.copyValueOf(str);
	    list.add(s);
	} else {
	    if (leftRem > 0) {
		str[count] = '(';
		addParen(list, leftRem-1, rightRem, str, count+1);
	    }
	    if (rightRem > leftRem) {
		str[count] = ')';
		addParen(list, leftRem, rightRem-1, str, count+1);
	    }
	}
    }
}