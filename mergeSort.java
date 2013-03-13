import java.util.Arrays;

class mergeSort {
    public static void main(String[] args) {
	int[] input = {4, 2, 1, 6, 7, 3, 9};
	mergeSort(input, 0, input.length-1);
	for (int i : input) {
	    System.out.print(i);
	}
	System.out.println();

    }
    public static void mergeSort(int[] array, int low, int high) {
	if (low < high) {
	    int mid = (low+high)/2;
	    mergeSort(array, low, mid);
	    mergeSort(array, mid+1, high);
	    merge(array, low, mid, high);
	}
    }

    public static void merge(int[] array, int low, int mid, int high) {
	int[] helper = new int[array.length];
	
	for (int i = low; i <= high; i++) {
	    helper[i] = array[i];
	}

	int p1 = low;
	int p2 = mid+1;
	int i = low;

	while (p1 <= mid && p2 <= high) {
	    if (helper[p1] < helper[p2]) {
		array[i] = helper[p1];
		p1++;
	    } else {
		array[i] = helper[p2];
		p2++;
	    }
	    i++;
	}
	while(p1 <= mid) {
	    array[i] = helper[p1];
	    p1++;
	    i++;
	}
	
	while(p2 <= high) {
	    array[i] = helper[p2];
	    p2++;
	    i++;
	}
    }
}