package _9_21_24;

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            hs.add(n);
        }

        for (int n : nums) {
            if (!hs.contains(n - 1)) {
                int cur = n;
                int curLong = 1;

                while (hs.contains(cur + 1)) {
                    cur = cur + 1;
                    curLong++;
                }
                longest = Math.max(curLong, longest);
            }
        }

        return longest;
    }
}