class quickSort {
    public static void main(String[] args) {
	int[] input = {3, 1, 5, 2, 6, 8};
	quickSort(input, 0, input.length-1);
	for (int i : input) {
	    System.out.print(i);
	}
	System.out.println();
    }
    
    public static void quickSort(int[] array, int left, int right) {
	int index = partition(array, left, right);
	
	if (left < index-1) {
	    quickSort(array, left, index-1);
	}
	
	if (index < right) {
	    quickSort(array, index, right);
	}
    }
    
    public static int partition(int[] array, int left, int right) {
	int pivot = array[(left + right)/2];
	while (left <= right) {
	    while(array[left] < pivot) {
		left++;
	    }
	    while(array[right] > pivot) {
		right--;
	    }
	    if (left <= right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		left++;
		right--;
	    }
	}
	return left;
    }
}