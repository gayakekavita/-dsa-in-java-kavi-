/*
 prbolem ::
 118. Pascal's Triangle
Solved
Easy
Topics
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

 Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> first_row=new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev_row= new ArrayList<>();
             prev_row= triangle.get(i-1);
            List<Integer> curr_row= new ArrayList<>();
            curr_row.add(1);
             for(int j=1;j<i;j++)
             {
                curr_row.add(prev_row.get(j-1) + prev_row.get(j));
             }
            curr_row.add(1);

            triangle.add(curr_row);
        }
       return triangle; 
    }
}

/*execution

   Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]  

Step-by-Step Execution
Initialization:

numRows = 5
triangle is initialized as an empty list of lists: []
first_row is initialized as a list containing a single element [1]
first_row is added to triangle: triangle = [[1]]
First Iteration (i = 1):

prev_row is the first row of the triangle: prev_row = [1]
curr_row is initialized with the first element as 1: curr_row = [1]
Since i = 1, there are no inner loop iterations.
curr_row is completed by adding another 1: curr_row = [1, 1]
curr_row is added to triangle: triangle = [[1], [1, 1]]
Second Iteration (i = 2):

prev_row is the second row of the triangle: prev_row = [1, 1]
curr_row is initialized with the first element as 1: curr_row = [1]
Inner loop iteration (j = 1):
curr_row is updated with the sum of prev_row.get(0) + prev_row.get(1) which is 1 + 1 = 2: curr_row = [1, 2]
curr_row is completed by adding another 1: curr_row = [1, 2, 1]
curr_row is added to triangle: triangle = [[1], [1, 1], [1, 2, 1]]
Third Iteration (i = 3):

prev_row is the third row of the triangle: prev_row = [1, 2, 1]
curr_row is initialized with the first element as 1: curr_row = [1]
Inner loop iterations:
j = 1: curr_row is updated with the sum of prev_row.get(0) + prev_row.get(1) which is 1 + 2 = 3: curr_row = [1, 3]
j = 2: curr_row is updated with the sum of prev_row.get(1) + prev_row.get(2) which is 2 + 1 = 3: curr_row = [1, 3, 3]
curr_row is completed by adding another 1: curr_row = [1, 3, 3, 1]
curr_row is added to triangle: triangle = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
Fourth Iteration (i = 4):

prev_row is the fourth row of the triangle: prev_row = [1, 3, 3, 1]
curr_row is initialized with the first element as 1: curr_row = [1]
Inner loop iterations:
j = 1: curr_row is updated with the sum of prev_row.get(0) + prev_row.get(1) which is 1 + 3 = 4: curr_row = [1, 4]
j = 2: curr_row is updated with the sum of prev_row.get(1) + prev_row.get(2) which is 3 + 3 = 6: curr_row = [1, 4, 6]
j = 3: curr_row is updated with the sum of prev_row.get(2) + prev_row.get(3) which is 3 + 1 = 4: curr_row = [1, 4, 6, 4]
curr_row is completed by adding another 1: curr_row = [1, 4, 6, 4, 1]
curr_row is added to triangle: triangle = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
*/
