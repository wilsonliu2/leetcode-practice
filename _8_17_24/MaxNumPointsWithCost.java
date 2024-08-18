package _8_17_24;

class Solution {
    public long maxPoints(int[][] points) {
        int r = points.length;
        int c = points[0].length;
        long[] dp = new long[c];

        for (int j = 0; j < c; j++) {
            dp[j] = points[0][j];
        }

        for (int i = 1; i < r; i++) {
            long[] left = new long[c];
            long[] right = new long[c];
            long[] newDp = new long[c];

            left[0] = dp[0];
            for (int j = 1; j < c; j++) {
                left[j] = Math.max(left[j - 1] - 1, dp[j]);
            }

            right[c - 1] = dp[c - 1];
            for (int j = c - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1] - 1, dp[j]);
            }

            for (int j = 0; j < c; j++) {
                newDp[j] = Math.max(left[j], right[j]) + points[i][j];
            }

            dp = newDp;
        }

        long result = 0;
        for (long x : dp) {
            result = Math.max(result, x);
        }
        return result;
    }
}
