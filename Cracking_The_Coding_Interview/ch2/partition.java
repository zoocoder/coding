public LinkedListNode partition(LinkedListNode n, int x) {
    LinkedListNode beforeX, afterX = null;
    while (n != null) {
	LinkedListNode next = n.next;
	if (n.data < x) {
	    n.next = beforeX;
	    beforeX = n;
	} else {
	    n.next = afterX;
	    afterX = n;
	}
	n = next;
    }

    if (beforeX == null) {
	return afterX;
    }

    LinkedListNode head = beforeX;

    while (beforeX.next != null) {
	beforeX = beforeX.next;
    }

    beforeX.next = afterX;

    return head;
}