class Permutation {
    public static void main(String[] args) {
	PrintPermute("123".toCharArray(), 0);
	PrintPermute("victor".toCharArray(), 0);
    }

    public static void PrintPermute(char[] inputs, int currentFocus) {
	if (currentFocus == inputs.length-1) {
	    System.out.println(new String(inputs));
	    return;
	}
	
	PrintPermute(inputs, currentFocus+1);
	
	for (int i = currentFocus+1; i < inputs.length; i++) {
	    char temp = inputs[currentFocus];
	    inputs[currentFocus] = inputs[i];
	    inputs[i] = temp;
	    PrintPermute(inputs, currentFocus+1);
	}
    }
}