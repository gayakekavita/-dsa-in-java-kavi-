/*
when we are solving this problem using 'Integer data type' then it will gives us error of "Time limit exceed"  
--  because when value of n is greater than integer range then it  gives time limit exceed error 
-- so it is better to use 'long' data type while solving such type of problems .

Description::
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:

Input: n = 3
Output: false

here it gives result as false because 
i=1;
1<3
   i= i*2
   i= 1*2
    =2


--i=2
2<3 
  i=i*2
  =2*2
  =4 

4<3
   condition states to false 
   
so according to our condition it returns false also 3 is not the value of power of two.

*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        //int i=1;
        long i =1;
        while(i<n)
        {
            i=i*2;
        }
        return (i==n)?true:false;
    }
}
