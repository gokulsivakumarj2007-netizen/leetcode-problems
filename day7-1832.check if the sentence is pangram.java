class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        
        Set<Character> seen = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            seen.add(c);
        }
        
        return seen.size() == 26;
    }
}
