package _8_19_24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);

        while (!level.isEmpty()) {
            int size = level.size();
            TreeNode last = null;

            for (int i = 0; i < size; i++) {
                TreeNode cur = level.poll();
                last = cur;

                if (last.left != null) {
                    level.offer(last.left);
                }
                if (last.right != null) {
                    level.offer(last.right);
                }
            }
            res.add(last.val);
        }
        return res;
    }
}