public LinkedListNode addNodes(LinkedListNode L1, LinkedListNode L2, int carry) {
    if (L1 == null && L2 == null && carry == 0) {
	return null;
    }

    LinkedListNode result = new LinkedListNode(carry, null, null);;
    int value = carry;
    if (L1 != null) {
	value += L1.data;
    }

    if (L2 != null) {
	value += L2.data;
    }

    result.data = value % 10;
    if (L1 != null || L2  != null || value >= 10) {
	LinkedListNode more = addLists(L1 == null ? null : L1.next, L2 == null ? null : L2.next, value >= 10 ? 1 : o);
	result.setNext(more);
    }

    return result;
}