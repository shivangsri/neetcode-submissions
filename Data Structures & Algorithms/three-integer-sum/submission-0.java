class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> tempWindow = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int number = -(nums[i] + nums[j]);
                if (tempWindow.contains(number)) {
                    List<Integer> arr = new ArrayList<>(List.of(number, nums[i], nums[j]));

                    Collections.sort(arr);
                    unique.add(arr);
                }
                tempWindow.add(nums[j]);
            }
        }
        ans.addAll(unique);
        return ans;
    }
}
