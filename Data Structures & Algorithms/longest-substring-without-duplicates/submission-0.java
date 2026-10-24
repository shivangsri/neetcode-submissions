class Solution {
    public int lengthOfLongestSubstring(String s) {
        // brute force
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    max = Math.max(max, j - i + 1);
                } else {
                    
                    break;
                }
            }
        }
        return max;
    }
}
