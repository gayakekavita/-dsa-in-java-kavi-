/*
Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.

Example:
Input: ‘N’ = 3

Output: 

1
2 3
4 5 6
*/
public class Solution {
    public static void nNumberTriangle(int n) {
        int count = 1; // Variable to track the increasing numbers

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
