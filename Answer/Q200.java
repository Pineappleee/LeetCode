public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        else {
            int count = 0;
            for (int i=0; i<grid.length; i++){
                for (int j=0; j<grid[0].length; j++){
                 if (grid[i][j] == '1'){
                     merge(i,j,grid);
                     count++;
                 }
                }
            }
                    return count;
        }

    }
    
    public void merge(int i, int j, char[][] grid){
        if (i<0 || j<0 || i>grid.length-1 || j> grid[0].length-1)
            return;
        if (grid[i][j] != '1')
            return; 
        grid[i][j] = '2';
        merge(i-1,j,grid);
        merge(i+1,j,grid);
        merge(i,j-1,grid);
        merge(i,j+1,grid);
        return;
        }
    
}