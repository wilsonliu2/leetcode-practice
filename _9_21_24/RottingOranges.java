package _9_21_24;

import java.util.LinkedList;
import java.util.Queue;

// BFS
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int t = 0;
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0)
            return 0;

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!q.isEmpty()) {
            int s = q.size();
            boolean rotted = false;

            for (int i = 0; i < s; i++) {
                int[] rotten = q.poll();

                for (int[] d : directions) {
                    int r = rotten[0] + d[0];
                    int c = rotten[1] + d[1];

                    if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        rotted = true;
                        q.offer(new int[] { r, c });
                        fresh--;
                    }
                }
            }

            if (rotted) {
                t++;
            }
        }

        if (fresh > 0) {
            return -1;
        }

        return t;
    }
}
