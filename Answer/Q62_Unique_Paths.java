"""
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
"""

public class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (m == 1 || n ==1) return 1;
        m--;
        n--;
        long ans = 1;
        if (m < n) {
            int temp = n;
            n = m;
            m = temp;
        }
        for (int i=1; i<=n; i++){
            ans = ans*(m+n-i+1)/i;
        }
        return (int)ans;
    }
}