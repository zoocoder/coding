public class fillIn {

    /** Fill in white space in string with "%20". Assume given true length.*/
    public static void main(String[] args) {
	String result1 = replace("Mr. Victor Zhu    ");
	System.out.println(result1);
	String result2 = replace2("Hello there Neo      ", 15);
	System.out.println(result2);
    }

    public static String replace(String s) {
	if (!s.contains(" ")) return s;
	//First make all white spaces 3 characters long.
	int whiteSpaces;
	whiteSpaces = s.split(" ").length-1;
	String new_s = s;
	for (int i = 0; i < whiteSpaces; i++) {
	    new_s = elongate(new_s);
	}
	return new_s;
    }

    public static String elongate(String s) {
	char[] letters = s.toCharArray();
	int firstWhiteSpace;
	firstWhiteSpace = 0;
	for (int i = 0; i < s.length(); i++) { //Find index of first white space.
	    if (letters[i] == ' ') {
		firstWhiteSpace = i;
		break;
	    }
	}
	String replaceChars = new String("%20");
	char[] shiftLetters = replaceChars.concat(s.substring(firstWhiteSpace+1, s.length())).toCharArray();
	int j;
	j = 0;
	for (; firstWhiteSpace < s.length(); firstWhiteSpace++) {
	    letters[firstWhiteSpace] = shiftLetters[j];
	    j+=1;
	}
	String result = new String(letters);
	return result;
    }

    /** Given true length of string. */
    public static String replace2(String s, int length) {
	char[] str = s.toCharArray();
	int spaceCount = 0, newLength, i;
	for ( i = 0; i < length; i++) {
	    if (str[i] == ' ') {
		spaceCount+=1;
	    }
	}
	
	newLength = length + 2 * spaceCount;
	str[newLength] = '\0';
	
	for (i = length - 1; i >= 0; i--) {
	    if (str[i] == ' ') {
		str[newLength-1] = '0';
		str[newLength-2] = '2';
		str[newLength-3] = '%';
		newLength-=3;
	    } else {
		str[newLength-1] = str[i];
	        newLength-=1;
	    }
	}
	String finalString = new String(str);
	return finalString;
    }
}