/*
Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.

Example 1:

Input:
a = 1
b = 2
Output:
2 4
Explanation: 1 was passed by value whereas 2 passed by reference.
*/
class Solution {
    static int[] passedBy(int a, int b) {
        // Modify a and b
        a += 1;
        b += 2;
        
        // Create an array to hold modified values
        int[] result = {a, b};
        
        return result;
    }
}
