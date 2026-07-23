class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        
        // Initialize minFreq with counts from the first word
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }
        
        // Intersect frequency counts across all remaining words
        for (int i = 1; i < words.length; i++) {
            int[] charFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                charFreq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charFreq[j]);
            }
        }
        
        // Build the result
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                minFreq[i]--;
            }
        }
        
        return result;
    }
}
