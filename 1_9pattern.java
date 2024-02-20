/*
Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

You are required to print the pattern as shown in the examples below.

Example:
Input: ‘N’ = 3

Output: 

1
0 1
1 0 1
*/

public class Solution {
    public static void nBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if the sum of i and j is even, else print 0
                System.out.print((i + j) % 2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
