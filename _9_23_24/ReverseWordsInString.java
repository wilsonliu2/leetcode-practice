package _9_23_24;

// trim extra spaces, use regex //s+ to split the words, use 2 pointer to swap the words in place and finally join the string
// time: O(n), space: O(n)
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] w = s.split("//s+");

        int l = 0;
        int r = w.length - 1;

        while (l <= r) {
            String temp = w[l];
            w[l] = w[r];
            w[r] = temp;
            l++;
            r--;
        }
        return String.join(" ", w);
    }
}