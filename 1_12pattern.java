/*
  Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

You must print a matrix corresponding to the given Reverse Letter Triangle.

Example:
Input: ‘N’ = 3

Output: 

A B C
A B
A
*/

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        int var;
        for(int i=n;i>0;i--)
        {
            var=65;
            for(int j=0;j<i;j++)
            {
                System.out.print((char)var +" ");
                var++;
            }
            System.out.println();
        }
    }
}
