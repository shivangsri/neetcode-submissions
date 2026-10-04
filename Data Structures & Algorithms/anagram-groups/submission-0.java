class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue;
            }
            String parent = sortStr(strs[i]);
            List<String> str = new ArrayList<>();
            for (int j = i; j < strs.length; j++) {
                if (visited[j]) {
                    continue;
                }
                String child = sortStr(strs[j]);
                if (parent.equals(child)) {
                    visited[j] = true;
                    str.add(strs[j]);
                }
            }
            list.addAll(new ArrayList<>(List.of(str)));
        }

        return list;
    }

    private String sortStr(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
}
