Node reversedLinkedList(Node head) {
    Node previous = null;
    while (head != null) {
	Node next = head.next;
	head.next = previous;
	previous = head;
	head = next;
    }
    return previous;
}

//Beautiful reverse, no corner cases, Awesome.

Node reversedLinkedList(Node oldList) {
    Node newList = null;
    while (oldList != null) {
	Node element = oldList;
	oldList = oldList.next;
	element.next = newList;
	newList = element;
    }
    return newList;
}