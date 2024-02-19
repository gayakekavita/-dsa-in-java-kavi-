/*
  Problem statement
Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output: 
* * *
* *
*
*/

public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                 System.out.print("* ");
            }
            System.out.println();
        }
    }
}
