class editDist { 
    //Compute the smallest edit distance between integers A and B
    public static void main(String[] args) {
	int[] A = {1, 2, 3, 4};
	int[] B = {1, 2, 3, 4};
	int result = editDist(A,B);
	System.out.println(result);
    }

    public static int editDist(int[] A, int[] B) {
	int m = A.length;
	int n = B.length;
	int[][] E = new int[m][n];
	for (int i = 0; i < m; i++) {
	    E[i][0] = i;
	}
	for (int j = 1; j < n; j++) {
	    E[0][j] = j;
	}
	for (int i = 1; i < m; i++) {
	    for (int j = 1; j < n; j++) {
		E[i][j] = Math.min(Math.min(1+E[i-1][j], 1+E[i][j-1]), diff(A[i],B[j]) + E[i-1][j-1]);
	    }
	}
	return E[m-1][n-1];
    }

    public static int diff(int i, int j) {
	if (i == j) return 0;
	else return 1;
    }
}