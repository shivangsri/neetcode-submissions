class Solution {
    public int lengthOfLongestSubstring(String s) {
        // take arr to track if elemtn is visited and laso track index where it was seen
        // brue force is 2 loops and track when we get repeating char
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
