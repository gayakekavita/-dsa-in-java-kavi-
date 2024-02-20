/*
 Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*****
 ***
  *
*/

public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<(n-i-1);k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
