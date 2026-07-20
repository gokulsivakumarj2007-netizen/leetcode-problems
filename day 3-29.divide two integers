class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: overflow handling
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        // True if the signs are different, meaning the result will be negative
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to negative to prevent overflow issues
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;

        int quotient = 0;

        // Since both are negative, we loop as long as dividend is less than or equal to divisor
        // e.g., -10 <= -3
        while (dividend <= divisor) {
            int currentDivisor = divisor;
            int numSubtractions = 1;

            // Double the divisor as long as it doesn't overshoot the dividend
            // Also ensure we don't overflow the 32-bit boundary (currentDivisor >= -1073741824)
            while (currentDivisor >= Integer.MIN_VALUE >> 1 && dividend <= (currentDivisor << 1)) {
                currentDivisor <<= 1;
                numSubtractions <<= 1;
            }

            // Subtract the largest accumulated chunk from dividend
            dividend -= currentDivisor;
            // Add the corresponding count to our quotient
            quotient += numSubtractions;
        }

        // Return the correct signed result
        return isNegative ? -quotient : quotient;
    }
}
