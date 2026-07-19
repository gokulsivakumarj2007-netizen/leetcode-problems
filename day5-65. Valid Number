class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
                
            } else if (c == '+' || c == '-') {
                // A sign is only valid at the very beginning 
                // OR immediately following an exponent 'e'/'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                
            } else if (c == '.') {
                // A dot is invalid if we've already seen a dot OR an exponent 'e'/'E'
                if (seenDot || seenE) {
                    return false;
                }
                seenDot = true;
                
            } else if (c == 'e' || c == 'E') {
                // An exponent is invalid if we've already seen an 'e'/'E' 
                // OR if we haven't seen any digits before it
                if (seenE || !seenDigit) {
                    return false;
                }
                seenE = true;
                seenDigit = false; // Reset seenDigit to ensure an integer follows the exponent
                
            } else {
                // Any other character (letters, spaces, symbols) makes it invalid
                return false;
            }
        }
        
        // The string is valid only if it ends having validated at least one digit
        return seenDigit;
    }
}
