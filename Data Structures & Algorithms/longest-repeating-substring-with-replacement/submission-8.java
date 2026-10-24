class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int hash[] = new int[26];
        int maxFreq = 0;

        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            for (int i = 0; i < hash.length; i++) {
                if (maxFreq < hash[i]) {
                    maxFreq = hash[i];
                }
            }
            if ((r - l + 1) - maxFreq > k) {
                 hash[s.charAt(l) - 'A']--;
                l++;
            }

            if ((r - l + 1) - maxFreq <= k) {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max;
    }
}
