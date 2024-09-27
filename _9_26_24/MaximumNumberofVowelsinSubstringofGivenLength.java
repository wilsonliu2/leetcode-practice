package _9_26_24;

import java.util.HashSet;

class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> v = new HashSet<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        v.add('A');
        v.add('E');
        v.add('I');
        v.add('O');
        v.add('U');

        int max = 0, c = 0;

        for (int i = 0; i < k; i++) {
            if (v.contains(s.charAt(i))) {
                c++;
            }
        }
        max = c;

        for (int i = k; i < s.length(); i++) {
            if (v.contains(s.charAt(i))) {
                c++;
            }
            if (v.contains(s.charAt(i - k))) {
                c--;
            }
            max = Math.max(max, c);
        }

        return max;
    }
}
