public boolean isPalindrome(LinkedListNode n) {
    LinkedListNode fast = n;
    LinkedListNode slow = n;
    Stack<Integer> stack = new Stack<Integer>();

    /** Use the runner technique to push half the elements onto the stack. */
    while (fast != null && fast.next != null) {
	stack.push(slow.data);
	slow = slow.next;
	fast = fast.next.next;
    }

    /** If odd number of elements, so advance slow. */
    if (fast != null) {
	slow = slow.next;
    }

    while (slow != null) {
	int top = stack.pop();
	if (top != slow.data) {
	    return false;
	}
	slow = slow.next;
    }
    return true;
}