import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
	int[] A = {4, 2, 5, 7, 3, 1};
	System.out.println(Arrays.toString(A));
    }

    public static void mergeSort1(int[] L, int i, int j) {
	if (i >= j) { return; }
	int mid = (i + j) / 2;
	int len = L.length;
	mergeSort(L, 0, mid);
	mergeSort(L, mid+1, len);
	merge(L, i, mid+1);
    }

    public static void merge(int[] L, int i, int j) {
    }
}
