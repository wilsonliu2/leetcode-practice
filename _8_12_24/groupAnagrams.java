package _8_12_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);

            if (!anagrams.containsKey(sortedWord)) {
                anagrams.put(sortedWord, new ArrayList<>());
            }

            anagrams.get(sortedWord).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}