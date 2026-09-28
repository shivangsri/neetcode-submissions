class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // approach one with map and freq.
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while (k > 0) {
            int max = 0;
            int key = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            arr.add(key);
            k--;
            map.remove(key);
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
}
