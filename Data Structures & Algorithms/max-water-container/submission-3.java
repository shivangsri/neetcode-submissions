class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int minHeight = Math.min(heights[left], heights[right]);
            int width = Math.abs(right - left);
            max = Math.max(max, (minHeight * width));
            if (heights[right] > heights[left]) {
                left++;
            } else if (heights[right] < heights[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return max;
    }
}
