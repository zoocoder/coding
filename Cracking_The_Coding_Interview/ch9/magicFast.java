class magicFast {
    public static void main(String[] args) {
	int[] A = {-10, -1, 0, 3, 5};
	int result = magicFast(A, 0, A.length-1);
	System.out.println(result);
    }

    public static int magicFast(int[] A, int start, int end) {
	if (end < start || start < 0 || end >= A.length) {
	    return -1;
	}

	int mid = start + (end-start)/2;
	if (A[mid] == mid) {
	    return mid;
	} else if (A[mid] < mid) {
	    return magicFast(A, mid+1, end);
	} else {
	    return magicFast(A, start, mid-1);
	}
    }
}