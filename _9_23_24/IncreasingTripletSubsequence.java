package _9_23_24;

// use 2 variables to keep track, time: O(n) space: O(1)
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low = Integer.MAX_VALUE;
        int med = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= low) {
                low = nums[i];
            } else if (nums[i] <= med) {
                med = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}