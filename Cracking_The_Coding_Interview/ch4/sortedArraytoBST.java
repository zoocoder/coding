Treenode sortedArraytoBST(int[] arr, int start, int end) {
    if (start > end) {
	return null;
    }
    int mid = (start+end)/2;
    Treenode n = new Treenode(arr[mid]);
    n.left = sortedArraytoBST(arr, start, mid-1);
    n.right = sortedArraytoBST(arr, mid+1, end);
    return n;
}