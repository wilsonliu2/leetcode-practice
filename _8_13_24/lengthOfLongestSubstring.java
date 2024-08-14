package _8_13_24;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int longest = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                longest = Math.max(longest, hs.size());
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }

        return longest;
    }
}