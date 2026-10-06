class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> arr[] = new ArrayList[nums.length + 1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();
            if (arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(number);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (k == 0) {
                break;
            }
            if (arr[i] != null) {
               for (int num : arr[i]) {
                    if (k > 0) {
                        ans.add(num);
                        k--; // Correctly tracks each individual element added
                    } else {
                        break;
                    }
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
