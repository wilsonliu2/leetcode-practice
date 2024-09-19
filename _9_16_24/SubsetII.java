import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        bt(res, nums, new ArrayList<>(), 0);
        return res;
    }

    public void bt(List<List<Integer>> res, int[] nums, List<Integer> temp, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            bt(res, nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
