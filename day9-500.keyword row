import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        // Map each letter 'a'-'z' to its keyboard row index (0, 1, or 2)
        int[] rowMap = {
            1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, // a-m
            2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2  // n-z
        };
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            int targetRow = rowMap[lowerWord.charAt(0) - 'a'];
            boolean isValid = true;
            
            for (int i = 1; i < lowerWord.length(); i++) {
                if (rowMap[lowerWord.charAt(i) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
