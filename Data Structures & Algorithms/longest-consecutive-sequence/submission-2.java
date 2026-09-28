class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i : nums) {
            map.put(i, 0);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int nextNumber = nums[i] + 1;
            int prevNumber = nums[i] - 1;
            map.put(nums[i],1);

            while (map.containsKey(nextNumber) && map.get(nextNumber) == 0) {
                map.put(nextNumber, 1);
                nextNumber++;
                count++;
            }

            while (map.containsKey(prevNumber) && map.get(prevNumber) == 0) {
                map.put(prevNumber, 1);
                prevNumber--;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
