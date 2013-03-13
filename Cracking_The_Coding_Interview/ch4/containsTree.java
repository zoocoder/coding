boolean containsTree(TreeNode T1, TreeNode T2) {
    if (t2 == null) {
	return true;
    }
    return subTree(T1, T2);
}

boolean subTree(TreeNode r1, TreeNode r2) {
    if (r1 == null) return false;
    if (r1.data == r2.data) {
	return matchTree(r1, r2);
    }
    return subTree(r1.left, r2) || subTree(r1.right, r2);
}

boolean matchTree(TreeNode r1, TreeNode r2) {
    if (r1 == null && r2 == null) {
	return true;
    }

    if (r1 == null || r2 == null) {
	return false;
    }

    if (r1.data != r2.data) {
	return false;
    }

    return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
}
	  