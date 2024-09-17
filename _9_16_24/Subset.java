import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(res, nums, 0, new ArrayList<>());
        return res;
    }

    public void bt(List<List<Integer>> res, int[] nums, int start, List<Integer> temp) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            bt(res, nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
