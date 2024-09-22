package _9_18_24;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(res, nums, new ArrayList<>());
        return res;
    }

    public void bt(List<List<Integer>> res, int[] nums, List<Integer> temp) {
        if (nums.length == temp.size()) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i]))
                    continue;
                temp.add(nums[i]);
                bt(res, nums, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}