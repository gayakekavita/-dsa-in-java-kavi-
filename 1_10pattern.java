/*
Problem statement
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
*/

public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=0;k<(n-i-1);k++)
            {
                System.out.print(" ");
            }
             for(int j=(i*1+1);j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
