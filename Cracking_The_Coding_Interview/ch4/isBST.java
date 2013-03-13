boolean isBST(Node root) {
    return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

boolean isBSTHelper(Node n, int min, int max) {
    if (n == null) return true;
    if (n.data > min && n.data < max && isBSTHelper(n.left, min, n.data) && isBSTHelper(n.right, n.data, max)){
	return true;
    } else {
	return false;
    }
}
    