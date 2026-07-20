class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes. (the minus sign breaks symmetry)
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; // extract last digit
            x /= 10; // remove last digit
            reversed = reversed * 10 + digit; // build reversed number
        }

        return original == reversed;
    }

}
