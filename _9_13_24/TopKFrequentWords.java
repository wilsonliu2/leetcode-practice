package _9_8_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (!map.containsKey(w)) {
                map.put(w, 0);
            }
            map.put(w, map.get(w) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });

        for (String w : map.keySet()) {
            pq.offer(w);
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}