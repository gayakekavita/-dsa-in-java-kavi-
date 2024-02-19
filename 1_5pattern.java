/*
  Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*/
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<((n*2-(i*2))+1);k++)
            {
                 System.out.print("*");
            }

            
            System.out.println();
        }
    }
}
