"""
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.
"""

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m==0 || n==0) return 0;
        int[][] grid = new int[m][n];
        if (obstacleGrid[0][0] == 1 ||obstacleGrid[m-1][n-1] == 1 ) return 0;
        grid[0][0] = 1;
        for (int i=1; i<n; i++){
            if (obstacleGrid[0][i] == 1) grid[0][i] = 0;
            else grid[0][i] = grid[0][i-1];
        }
        for (int i=1; i<m; i++){
            if (obstacleGrid[i][0] == 1) grid[i][0] = 0;
            else grid[i][0] = grid[i-1][0];
        }
        for (int i=1; i<m; i++){
            for (int j=1; j<n; j++){
                if (obstacleGrid[i][j] == 1) grid[i][j] = 0;
                else
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}