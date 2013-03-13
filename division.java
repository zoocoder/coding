class Division {
    public static void main(String[] args) {
	int divident = 329;
	int divisor = 4;
	int quotient = divide(divident, divisor);
	System.out.println(divident + "/" + divisor + "=" + quotient);
    }

    public static int divide(int divident, int divisor) {
	if (divisor == 0) return -1;
	if (divident == 0) return 0;
	int quotient = 0;
	int currentDivisor = divisor;
	int currentQuotientBase = 1;

	while (divident >= divisor) {
	    if (divident >= currentDivisor) {
		divident -= currentDivisor;
		quotient += currentQuotientBase;
		currentDivisor *= 2;
		currentQuotientBase *= 2;
	    } else {
		currentDivisor /= 2;
		currentQuotientBase /= 2;
	    }
	}

	return quotient;
    }
}
		   