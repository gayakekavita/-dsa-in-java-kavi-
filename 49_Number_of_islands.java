// there is a array which contains 0 and 1 where 1 present "island" and 0 represents "water" .
// below is the example which we are going to solve ::


// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:
// Input: grid = [
//  ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1


// so here we are using two variables for iterating over throughs row and columns 
//   this varibales are :
// "i" 

// "j"

// also we are taking one variable which will be returned as the result of number of islands is 
// "count" .
// initially we will set its value to 0.

// so basically firstly we will check whether in the first row is any 1 is present or not .
// also we check if 1 is present then to its vertical and horizontal  position we will check whether 1 is present or not .
// we will check to its vertical and horizontal position till any 0 is encouterd .
// when we find a '0' in its vertical or horizontal position then we will break the current iteration.

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char grid[][], int i, int j) {
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]=='1') {
            grid[i][j] = '0';
            dfs(grid, i + 1, j);// next vertical adjacent element
            dfs(grid, i - 1, j);//previous vertical adjacent element 
            dfs(grid, i, j + 1);//next horizontal adjacent element
            dfs(grid, i, j - 1);// previous horizontal adjacent element 
         }
    }
}

// -->so in the first row at first position we found '1' so to its horizontal places and to its vertical places we check for any '1' is present or not::
//       1.if it is present then we will make it as '0'.[also make '0' to  '1' at current position]
//        2.if no we will check till '0' is find .

  
     
