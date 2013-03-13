LinkedListNode FindBeginning(LinkedListNode head) {
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    /**First find collision point, which will be LoopSize - k steps into the linked list. */
    while (fast != null && fast.next != null) {
	slow = slow.next;
	fast = fast.next.next;
	if (slow == fast) { //Collision
	    break;
	}
    }

    if (fast == null || fast.next == null) {
	return null;
    }

    slow = head;
    while (slow != fast) {
	slow = slow.next;
	fast = fast.next;
    }

    return fast;
}