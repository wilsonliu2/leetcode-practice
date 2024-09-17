package _9_17_24;

class Solution {
    public int numIslands(char[][] grid) {
        int c = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    flip(grid, i, j);
                    c++;
                }
            }
        }
        return c;
    }

    public void flip(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        if (grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        flip(grid, i + 1, j);
        flip(grid, i - 1, j);
        flip(grid, i, j - 1);
        flip(grid, i, j + 1);
    }
}