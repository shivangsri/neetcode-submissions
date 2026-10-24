class Solution {
    public int lengthOfLongestSubstring(String s) {
        // better
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int hash[] = new int[256];
        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
           
            if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
                l =  map.get(s.charAt(r)) + 1;
            }
             map.put(s.charAt(r), r);

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
