class maxSum {
    public static void main(String[] args) {
	//Sub-array 3 10 -4 7 2 has maximum sum of 18
	int[] input = {1, -2, 3, 10, -4, 7, 2, -5};
	int result = maxSum(input);
	System.out.println(result);
    }

    public static int maxSum(int[] arr) {
	int currentSum = 0;
	int maxSum = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
	    currentSum +=  arr[i];
	    if (maxSum < currentSum) {
		maxSum = currentSum;
	    }
	    currentSum = Math.max(currentSum, arr[i]);
	    //	    if (currentSum < 0) {
	    //	currentSum = 0;
	    // }
	}
	return maxSum;
    }
}