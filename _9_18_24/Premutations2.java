package _9_18_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] use = new boolean[nums.length];
        bt(res, nums, new ArrayList<>(), use);
        return res;
    }

    public void bt(List<List<Integer>> res, int[] nums, List<Integer> temp, boolean[] use) {
        if (nums.length == temp.size()) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (use[i] || i > 0 && nums[i] == nums[i - 1] && !use[i - 1])
                    continue;
                use[i] = true;
                temp.add(nums[i]);
                bt(res, nums, temp, use);
                use[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}