/*
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Example 1:

Input:
n=5
Output:
225
Explanation:
13+23+33+43+53=225
*/
class Solution {
    long sum=0;
    long sumOfSeries(long n) {
        
        // code here
        if(n<=0)
        {
            return sum;
        }
        sum+= n*n*n;
        return sumOfSeries(n-1);
        
    }
}
