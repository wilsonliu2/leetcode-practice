package _8_13_24;

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (i < j) {
            int cur = Math.min(height[i], height[j]) * (j - i);
            res = Math.max(res, cur);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}