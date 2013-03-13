public static void deleteDups(LinkedListNode n) {
    HashTable table = new HashTable();
    LinkedListNode prev = null;
    while (n != null) {
	if (table.containsKey(n.data)) {
	    prev.next = n.next;
	} else {
	    prev = n;
	    table.put(n.data, true);
	}
	n = n.next;
    }
}

/** Restriction: Buffer not allowed. */

public static void deleteDups2(LinkedListNode head) {
    LinkedListNode current = head;
    while (current != null) {
	LinkedListNode runner = current;
	while (runner.next != null) {
	    if (runner.next.data == current.data) {
		runner.next = runner.next.next;
	    } else {
		runner = runner.next;
	    }
	}
	current = current.next;
    }
}
	     