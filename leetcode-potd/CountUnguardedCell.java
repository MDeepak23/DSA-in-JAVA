//2257
/*
2257. Count Unguarded Cells in the Grid
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given two integers m and n representing a 0-indexed m x n grid. 
You are also given two 2D integer arrays guards and walls 
where guards[i] = [rowi, coli] and walls[j] = [rowj, colj] represent the positions of the ith guard and jth wall respectively.

A guard can see every cell in the four cardinal directions (north, east, south, or west)
starting from their position unless obstructed by a wall or another guard. A cell is guarded if there is at least one guard that can see it.

Return the number of unoccupied cells that are not guarded.

 

Example 1:


Input: m = 4, n = 6, guards = [[0,0],[1,1],[2,3]], walls = [[0,1],[2,2],[1,4]]
Output: 7
Explanation: The guarded and unguarded cells are shown in red and green respectively in the above diagram.
There are a total of 7 unguarded cells, so we return 7.
*/
class CountUnguardedCell {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int [m][n];
        for(int[] i:guards){
            grid[i[0]][i[1]]=2;
        }
          for(int[] j:walls){
            grid[j[0]][j[1]]=3;
        }
        //left-right right-left
        for(int i=0;i<m;i++){
            boolean gseen = false;
            for(int j=0;j<n;j++){
                if(grid[i][j] == 3){
                    gseen=false;
                }
                else if(grid[i][j]==2){
                    gseen=true;
                }
                else if(grid[i][j]==0 && gseen){
                    grid[i][j] = 1;
                }
            }
            gseen = false;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j] == 3){
                    gseen=false;
                }
                else if(grid[i][j]==2){
                    gseen=true;
                }
                else if(grid[i][j]==0 && gseen){
                    grid[i][j] = 1;
                } 
            }

        }
        //top-bottom bottom-top
        for(int j=0;j<n;j++){
           boolean gseen =false;
            for(int i=0;i<m;i++){
                 if(grid[i][j] == 3){
                    gseen=false;
                }
                else if(grid[i][j]==2){
                    gseen=true;
                }
                else if(grid[i][j]==0 && gseen){
                    grid[i][j] = 1;
                } 
            }
            gseen=false;
            for(int i=m-1;i>=0;i--){
                 if(grid[i][j] == 3){
                    gseen=false;
                }
                else if(grid[i][j]==2){
                    gseen=true;
                }
                else if(grid[i][j]==0 && gseen){
                    grid[i][j] = 1;
                } 
            }
        }
        int count=0;
        for(int[] row:grid){
            for(int i : row){
                if(i==0){
                    count++;
                }
            }
        }
      return count;  
    }
}
