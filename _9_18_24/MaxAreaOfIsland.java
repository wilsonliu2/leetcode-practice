package _9_18_24;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = getArea(grid, i, j);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public int getArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int t = 1;
        t += getArea(grid, i + 1, j);
        t += getArea(grid, i - 1, j);
        t += getArea(grid, i, j + 1);
        t += getArea(grid, i, j - 1);
        return t;
    }
}