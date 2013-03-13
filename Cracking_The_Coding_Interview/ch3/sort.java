public static Stack<Integer> sort(Stack<Integer s) {
    Stack<Integer> result = new Stack<Integer>();

    while (!s.isEmpty()) {
	int temp = s.pop();
	
	while (!result.isEmpty() && result.peek() < temp) {
	    s.push(result.pop());
	}
	result.push(temp);
    }
    return result;
}