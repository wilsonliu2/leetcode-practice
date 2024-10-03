package _10_3_24;

import java.util.HashSet;

// Faster than sorting, time O(n), space O(n). there is another solution that uses the sum formula
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            hs.add(n);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}

// sum formula answer
/**
 * class Solution {
 * public int missingNumber(int[] nums) {
 * int n = nums.length;
 * int expectedSum = n * (n + 1) / 2;
 * int actualSum = 0;
 * 
 * for (int num : nums) {
 * actualSum += num;
 * }
 * 
 * return expectedSum - actualSum;
 * }
 * }
 */