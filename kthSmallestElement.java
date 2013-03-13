class kthSmallestElement {
    public static void main(String[] args) {
	int[] input = {3, 1, 5, 2, 6, 4, 7};
	int result = kthSmallestElement(input, 0, 6, 5);
	System.out.println(result);
    }
    public static int kthSmallestElement(int[] arr, int start, int end, int k) {
	int j = partition(arr, start, end);
	if (start == end) return arr[start];
	if (j == k) {
	    return arr[j];
	}
	else if (j < k) {
	    return kthSmallestElement(arr, j+1, end, k-j-1);
	}
	else {
	    return kthSmallestElement(arr, start, j-1, k);
	}
    }
    
    public static int partition(int[] arr, int left, int right) {
	int pivot = arr[left+(right-left)/2];
	int original = left;
	while (left <= right) {
	    while (arr[left] < pivot) {
		left++;
	    }
	    while (arr[right] > pivot) {
		right--;
	    }
	    if (left <= right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	    }
	    
	}
	return left;
    }
}