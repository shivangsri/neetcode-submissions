class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // prev slution was O(n2.KlogK), we can redunce one n iteration using map.
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = sortStr(strs[i]);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        
    }
    private String sortStr(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
}
