package _9_26_24;

class Solution {
    public String reverseVowels(String s) {
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

        int l = 0;
        int r = s.length() - 1;
        char[] c = s.toCharArray();

        while (l < r) {
            if (!v.contains(c[l])) {
                l++;
            } else if (!v.contains(c[r])) {
                r--;
            } else if (v.contains(c[l]) && v.contains(c[r])) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }
        String str = new String(c);
        return str;
    }
}
