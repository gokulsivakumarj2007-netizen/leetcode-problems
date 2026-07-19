class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        // dp[j] stores the number of distinct subsequences of s that equal t[0...j-1]
        int[] dp = new int[n + 1];
        
        // Base case: empty t can always be formed in 1 way
        dp[0] = 1;
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            // Traverse backwards to avoid using updated values from the current row
            for (int j = n; j >= 1; j--) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[j] = dp[j] + dp[j - 1];
                }
                // If they don't match, dp[j] remains dp[j] (which is implicitly dp[i-1][j])
            }
        }
        
        return dp[n];
    }
}
