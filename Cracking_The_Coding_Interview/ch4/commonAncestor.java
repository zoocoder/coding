boolean covers(TreeNode root, TreeNode p) {
    if (root == null) {
	return false;
    }
    if (root == p) {
	return true;
    }
    return covers(root.left, p) || covers(root.right, p);
}

TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;
    if (root == p || root == q) return root;
    
    if ((root.value < p.value && root.value > q.value) || (root.value > p.value && root.value < q.value)) {
	return root;
    } else if (root.value < p.value && root.value < q.value) {
	return commonAncestorHelper(root.right, p, q);
    } else {
	return commonAncestorHelper(root.left, p, q);
    }
}

TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (!covers(root, p) || !covers(root, q)) return null;
    return commonAncestorHelper(root, p, q);
}