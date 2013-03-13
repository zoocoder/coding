/**
 * Author: Victor Zhu (victor.zhu@berkeley.edu)
 * Written on: Thursday, February 7, 2013
 */

import java.util.Arrays;

class FourHighest {

    public static void main(String[] args) {
	//Test case
	int[] input = {5, 2, 3, 10, 4, 20, 2, 3, 9, 11};
	int[] output =  FourHighest(input);

	//Below should return 9 10 11 20.
	for (int i : output)  {
	    System.out.print(i + " ");
	}
	System.out.println();
    }

    /** 
     * Return four highest integers in array in O(n) time. 
     * Brief Analysis:
     * We have a result array of length 4, so the space complexity is O(1).
     * There is one for loop that iterates through elements 4...end in the array. For every element,
     * comparing to candidate is a constant time operation, as is sorting the length 4 result array.
     * Overall, it is O(n) time.
     */
    public static int[] FourHighest(int[] arr) {
	if (arr.length < 5) return arr; //If the array has four elements or smaller, we're done.
	int[] result = Arrays.copyOfRange(arr, 0, 4); //Initialize sorted result with first four elements.
	Arrays.sort(result);

	//Iterate through the remaining elements{4...end} and replace result as appropriate.
	for (int i = 4; i < arr.length; i++) {
	    int candidate = arr[i];
	    if (candidate > result[0]) {
		result[0] = candidate;
	    }
	    Arrays.sort(result); //Quicksort is O(nlogn). Here, n is always 4, so it is time 4*2 = 8, which is a constant.
	}

	return result;
    }
}